
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada
 */
/* Enunciado:
    4. Desenvolver um algoritmo armazene dez números, apresente-os, remover o
número que está na posição 3, apresentar os números armazenados, remover o
número que está na posição 4, apresentar os números armazenados e a quantidade
de números que restaram no ArrayList.
 */
public class Exercicio04 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
        numeros.add(70);
        numeros.add(80);
        numeros.add(90);
        numeros.add(100);

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
                "\n10º Número Inteiro: " + numeros.get(9),
                "Números",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        numeros.remove(3);
        JOptionPane.showMessageDialog(null, 
                "\n1º Número Inteiro: " + numeros.get(0) + 
                "\n2º Número Inteiro: " + numeros.get(1) + 
                "\n3º Número Inteiro: " + numeros.get(2) + 
                "\n4º Número Inteiro: " + numeros.get(3) + 
                "\n5º Número Inteiro: " + numeros.get(4) + 
                "\n6º Número Inteiro: " + numeros.get(5) + 
                "\n7º Número Inteiro: " + numeros.get(6) + 
                "\n8º Número Inteiro: " + numeros.get(7) + 
                "\n9º Número Inteiro: " + numeros.get(8),
                "Números",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        numeros.remove(4);
        JOptionPane.showMessageDialog(null, 
                "\n1º Número Inteiro: " + numeros.get(0) + 
                "\n2º Número Inteiro: " + numeros.get(1) + 
                "\n3º Número Inteiro: " + numeros.get(2) + 
                "\n4º Número Inteiro: " + numeros.get(3) + 
                "\n5º Número Inteiro: " + numeros.get(4) + 
                "\n6º Número Inteiro: " + numeros.get(5) + 
                "\n7º Número Inteiro: " + numeros.get(6) + 
                "\n8º Número Inteiro: " + numeros.get(7),
                "Números",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        
    }
}


