
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
        // TODO code application logic here
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < 100; i =+ 10) {
            numeros.add(i);
        }
        System.out.println("Tamanho: " + numeros.size());
        System.out.println("Numeros:");

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
            
        }
    }

}
