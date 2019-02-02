
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(22);
        numeros.add(23);
        numeros.add(25);
        numeros.add(23+1);
        numeros.add(21);
        
        int numeroPosicao0 = numeros.get(0);
        int numeroPosicao1 = numeros.get(1);
        int numeroPosicao2 = numeros.get(2);
        int numeroPosicao3 = numeros.get(3);
        int numeroPosicao4 = numeros.get(4);
        
        System.out.println(
                "\n[0] => " + numeroPosicao0 +
                "\n[1] => " + numeroPosicao1 +
                "\n[2] => " + numeroPosicao2 +
                "\n[3] => " + numeroPosicao3 +
                "\n[4] => " + numeroPosicao4
        );
        int soma = numeroPosicao0 + numeroPosicao1 + numeroPosicao2 + numeroPosicao3 + numeroPosicao4;
        
        System.out.println("Soma" + soma);
    }
    
}
