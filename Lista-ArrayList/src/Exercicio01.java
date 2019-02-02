
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada
 */
/* Enunciado:
    1. Desenvolver um algoritmo que crie um ArrayList para armazenar números inteiros,
 após isto armazenar 15 números e apresentar os mesmos.
 Obs.: não é permitido utilizar nenhuma estrutura de repetição (for, while, do while)
 */
public class Exercicio01 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);
        numeros.add(14);
        numeros.add(15);

        JOptionPane.showMessageDialog(null, 
                "\n1º Número Inteiro: " + numeros.get(0) + 
                "\n2º Número Inteiro: " + numeros.get(1) + 
                "\n3º Número Inteiro: " + numeros.get(2) + 
                "\n4º Número Inteiro: " + numeros.get(3) + 
                "\n5º Número Inteiro: " + numeros.get(4) + 
                "\n6º Número Inteiro: " + numeros.get(5) + 
                "\n7º Número Inteiro: " + numeros.get(6) + 
                "\n8º Número Inteiro: " + numeros.get(7) + 
                "\n9º Número Inteiro: " + numeros.get(8) + 
                "\n10º Número Inteiro: " + numeros.get(9) + 
                "\n11º Número Inteiro: " + numeros.get(10) +
                "\n12º Número Inteiro: " + numeros.get(11) +
                "\n13º Número Inteiro: " + numeros.get(12) +
                "\n14º Número Inteiro: " + numeros.get(13) +
                "\n15º Número Inteiro: " + numeros.get(14),
                "Números",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

}
