
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
public class Exemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numeros.add(Integer.parseInt(JOptionPane
                    .showInputDialog("Digite um número")));
        }

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("[" + i + "] = " + numeros.get(i));
        }

        int soma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }

        double media = soma / numeros.size();

        int menorNumero = Integer.MAX_VALUE;
        
        for (int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) < menorNumero){
                menorNumero = numeros.get(i);
            }
        }
        
        int maiorNumero = Integer.MIN_VALUE;
        
        for (int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) > maiorNumero){
                maiorNumero = numeros.get(i);
            }
        }

        JOptionPane.showMessageDialog(null,
                "A soma é : " + soma +
                "\nMédia: " + media + 
                "\nMenor Número: " + menorNumero +
                "\nMaior Número: " + maiorNumero
        );
        
    }

}
