
import java.util.Random;

import javax.swing.JOptionPane;

public class SnakeJOP {

    public static void main(String[] args) {
        //Configuration
            String string = "";
            int m = 0, n = 0, i = 0, j = 0, o = 0, p = 0, ponto = 0, posicao = 5;
            Object opcao[] = {"Equerda","Cima","Baixo","Direita","Sair"};

            String matriz[][] = new String[12][16];
        //Random Spawn
            m = (int) (Math.random() * 12);
            n = (int) (Math.random() * 16);
            while(m == 0 || m == 11 || n == 0 || n == 15){
                m = (int) (Math.random() * 12);
                n = (int) (Math.random() * 16);
            }
        //Random Fruit
            o = (int) (Math.random() * 12);
            p = (int) (Math.random() * 16);
            while(o == 0 || o == 11 || p == 0 || p == 15 || o == m || p == n){
                o = (int) (Math.random() * 12);
                p = (int) (Math.random() * 16);
            }
        //Game Loop Principal
            while(posicao != 4){
                //Game Hud
                    for (i = 0; i < 12; i++) {
                        for (j = 0; j < 16; j++) {
                            //Cobra
                                if((i == m && j == n && j != 0 && j != 15)){
                                    matriz[i][j] = "     O    ";
                                    string = string + matriz[i][j];
                                }
                                else if((i == m && j == n && j != 15)){
                                    matriz[i][j] = "|O       ";
                                    string = string + matriz[i][j];
                                }
                                else if((i == m && j == n&& j != 0)){
                                    matriz[i][j] = "       O|";
                                    string = string + matriz[i][j];
                                }
                            //Fruta
                                else if(m == o && n == p){
                                    o = (int) (Math.random() * 12);
                                    p = (int) (Math.random() * 16);
                                        while(o == 0 || o == 11 || p == 0 || p == 15 || o == m || p == n){
                                            o = (int) (Math.random() * 12);
                                            p = (int) (Math.random() * 16);
                                        }
                                    ponto ++;
                                }
                                else if (i == o && j == p && j != 0 && j != 15 ){
                                    matriz[i][j] = "     Q    ";
                                    string = string + matriz[i][j];
                                }
                                else if(i == o && j == p && j != 15){
                                    matriz[i][j] = "|Q       ";
                                    string = string + matriz[i][j];
                                }
                                else if(i == o && j == p && j != 0){
                                    matriz[i][j] = "       Q|";
                                    string = string + matriz[i][j];
                                }
                            //Mapa
                                else if(i == 0 && j == 0) {
                                    matriz[i][j] = "_____";
                                    string = string + matriz[i][j];
                                }
                                else if(i == 0 && j < 15 && j != 0) {
                                    matriz[i][j] = "_____";
                                    string = string + matriz[i][j];
                                }
                                else if(i == 0 && j == 15) {
                                    matriz[i][j] = "______";
                                    string = string + matriz[i][j];
                                }
                                else if(i < 11 && i != 0 && j == 0) {
                                    matriz[i][j] = "|          ";
                                    string = string + matriz[i][j];
                                }
                                else if(i < 11 && i != 0 && j < 15 && j != 0) {
                                    matriz[i][j] = "            ";
                                    string = string + matriz[i][j];
                                }
                                else if(i < 11 && i != 0 && j == 15) {
                                    matriz[i][j] = "          |";
                                    string = string + matriz[i][j];
                                }
                                else if(i == 11 && j == 0) {
                                    matriz[i][j] = "´´´´´´´´´";
                                    string = string + matriz[i][j];
                                }
                                else if(i == 11 && j != 0 && j < 15) {
                                    matriz[i][j] = "´´´´´´´´´";
                                    string = string + matriz[i][j];
                                }
                                else if(i == 11 && j == 15) {
                                    matriz[i][j] = "´´´´´´´";
                                    string = string + matriz[i][j];
                                }
                            }
                            string = string + "\n";
                    }
                //Game Animation
                    //Snake Moviment
                        posicao = JOptionPane.showOptionDialog(null, string, "Pontos = " + ponto, 0, JOptionPane.PLAIN_MESSAGE, null, opcao, opcao[0]);
                        if(posicao == 0){
                            n--;
                        }
                        else if(posicao == 1){
                            m--;
                        }
                        else if(posicao == 2){
                            m++;
                        }
                        else if(posicao == 3){
                            n++;
                        }
                    //Snake Moviment Wall
                        while(m > 10 || m < 1 || n > 15 || n < 0 && posicao != 4){
                            if(m > 10){
                                m--;
                            }
                            else if(m < 1){
                                m++;
                            }
                            else if(n < 0){
                                n++;
                            }
                            else if(n > 15){
                                n--;
                            }
                            JOptionPane.showMessageDialog(null, "Você não pode atravessar\nTente outro caminho", "Eroou", JOptionPane.ERROR_MESSAGE);
                            posicao = JOptionPane.showOptionDialog(null, string, "Pontos = " + ponto, 0, JOptionPane.PLAIN_MESSAGE, null, opcao, opcao[0]);
                            if(posicao == 0){
                                n--;
                                }
                                else if(posicao == 1){
                                    m--;
                                }
                                else if(posicao == 2){
                                    m++;
                                }
                                else if(posicao == 3){
                                    n++;
                            }
                        }
                        string = "";
            }
    }

}