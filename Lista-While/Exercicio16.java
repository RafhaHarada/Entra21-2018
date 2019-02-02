/*
Enunciado:

16. Faça um temporizador começando com 23:59:59 até 00:00:00.
Exemplo:
23:59:59
23:59:58
23:59:57
............
23:59:00
23:58:59
............
23:00:01
23:00:00
22:59:59
............
00:00:02
00:00:01
00:00:00

*/


import javax.swing.JOptionPane;

public class Exercicio16{

    public static void main(String[] args){

        int hora = 23;
        int minuto = 59;
        int segundo = 60;

        while(hora != 0 || minuto != 0 || segundo != 0){
            if(segundo != 0){
                segundo = segundo - 1;
                System.out.println(hora + " " + minuto + " " + segundo);
            }
            else if(minuto != 0 && segundo != 60){
                minuto = minuto - 1;
                segundo = 60;
            }
            else if(hora != 0 && minuto != 60){
                hora = hora - 1;
                minuto = 60;
            }
        }
    }
}