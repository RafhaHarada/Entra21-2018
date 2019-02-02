import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Carro{

   public static void main(String[] args){

      JOptionPane.showMessageDialog(null,
         "Um carro precisa estacionar em determinada vaga," +
         "\nUtilize a visão vertical para deslocar o carro",
         "Objetivo",
         JOptionPane.INFORMATION_MESSAGE
      );
      //                   0         1        2        3
      Object[] direcoes = {"Cima","Esquerda","Direita","Baixo"};
      
      int localAtual = 0, loopEnd = 0, direcao = 0;

      while(loopEnd == 0){
         if(localAtual == 0){
            direcao = JOptionPane.showOptionDialog(null, "", "Desloque o carro até a vaga",0,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Carro.class.getResource("/imagem/a.png")), direcoes,direcoes[0]);
            localAtual = 1;
         }//posicao a
         if (localAtual == 1){
            if(direcao == 1){
               direcao = JOptionPane.showOptionDialog(null, "", "Desloque o carro até a vaga",0, JOptionPane.PLAIN_MESSAGE, new ImageIcon(Carro.class.getResource("/imagem/b.png")), direcoes,direcoes[0]);
               localAtual = 2;
            }
            else {
               JOptionPane.showMessageDialog(null, "Carro bateu! - Fim de jogo");System.exit(0);
            }
         }//posicao b
         if (localAtual == 2){
            if(direcao == 1){
               direcao = JOptionPane.showOptionDialog(null, "", "Desloque o carro até a vaga",0, JOptionPane.PLAIN_MESSAGE, new ImageIcon(Carro.class.getResource("/imagem/c.png")), direcoes,direcoes[0]);
               localAtual = 3;
            }
            else if(direcao == 2){
               direcao = JOptionPane.showOptionDialog(null, "", "Desloque o carro até a vaga",0, JOptionPane.PLAIN_MESSAGE, new ImageIcon(Carro.class.getResource("/imagem/a.png")), direcoes,direcoes[0]);
               localAtual = 1;
            }
            else {
               JOptionPane.showMessageDialog(null, "Carro bateu! - Fim de jogo");System.exit(0);
            }
         }//posicao c
         if (localAtual == 3){
            if(direcao == 0){
               direcao = JOptionPane.showOptionDialog(null, "", "Desloque o carro até a vaga",0, JOptionPane.PLAIN_MESSAGE, new ImageIcon(Carro.class.getResource("/imagem/d.png")), direcoes,direcoes[0]);
               localAtual = 4;
            }
            else if(direcao == 2){
               direcao = JOptionPane.showOptionDialog(null, "", "Desloque o carro até a vaga",0, JOptionPane.PLAIN_MESSAGE, new ImageIcon(Carro.class.getResource("/imagem/b.png")), direcoes,direcoes[0]);
               localAtual = 2;
            }
            else {
               JOptionPane.showMessageDialog(null, "Carro bateu! - Fim de jogo");System.exit(0);
            }
         }//posicao d
         if (localAtual == 4){
            if(direcao == 0){
               direcao = JOptionPane.showOptionDialog(null, "", "Desloque o carro até a vaga",0, JOptionPane.PLAIN_MESSAGE, new ImageIcon(Carro.class.getResource("/imagem/e.png")), direcoes,direcoes[0]);
               localAtual = 5;
            }
            else if(direcao == 3){
               direcao = JOptionPane.showOptionDialog(null, "", "Desloque o carro até a vaga",0, JOptionPane.PLAIN_MESSAGE, new ImageIcon(Carro.class.getResource("/imagem/c.png")), direcoes,direcoes[0]);
               localAtual = 3;
            }
            else {
               JOptionPane.showMessageDialog(null, "Carro bateu! - Fim de jogo");System.exit(0);
            }
         }//posicao e
         if (localAtual == 5){
            if(direcao == 2){
               direcao = JOptionPane.showOptionDialog(null, "", "Desloque o carro até a vaga",0, JOptionPane.PLAIN_MESSAGE, new ImageIcon(Carro.class.getResource("/imagem/f.png")), direcoes,direcoes[0]);
               localAtual = 6;
            }
            else if(direcao == 3){
               direcao = JOptionPane.showOptionDialog(null, "", "Desloque o carro até a vaga",0, JOptionPane.PLAIN_MESSAGE, new ImageIcon(Carro.class.getResource("/imagem/d.png")), direcoes,direcoes[0]);
               localAtual = 4;
            }
            else {
               JOptionPane.showMessageDialog(null, "Carro bateu! - Fim de jogo");System.exit(0);
            }
         }//posicao f
         if (localAtual == 6){
            if(direcao == 2){
               JOptionPane.showMessageDialog(null, "Você\nChegou\nao\nSeu\nDestino", "END", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Carro.class.getResource("/imagem/g.png")));
               loopEnd = 1;
            }
            else if(direcao == 1){
               direcao = JOptionPane.showOptionDialog(null, "", "Desloque o carro até a vaga",0, JOptionPane.PLAIN_MESSAGE, new ImageIcon(Carro.class.getResource("/imagem/e.png")), direcoes,direcoes[0]);
               localAtual = 5;
            }
            else {
               JOptionPane.showMessageDialog(null, "Carro bateu! - Fim de jogo");System.exit(0);
            }
         }
      }

      JOptionPane.showMessageDialog(null, "Parabéns, você conseguiu estacionar com sucesso!", "Vitória", JOptionPane.INFORMATION_MESSAGE);
   }

}
