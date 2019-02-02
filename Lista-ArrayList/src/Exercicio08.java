
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada
 */
/* Enunciado:
    8. Desenvolver um algoritmo que solicite dez salários, apresentar os seguintes itens:
 Todos os alarmes armazenados;
 A média dos salários;
 A somatória dos salários;
 A soma dos salários que estão armazenados em posições pares;
 A média dos salários que estão armazenados em posições ímpares;
 A quantidade de salários que estão armazenados.
 */
public class Exercicio08 {

    public static void main(String[] args) {
        ArrayList<Double> salarios = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        salarios.add(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um salário real:", (i+1) + "º Salário Real", JOptionPane.QUESTION_MESSAGE)));
        }
        
        String todosOsSalarios = "";
        for (int i = 0; i < salarios.size(); i++) {
            todosOsSalarios += String.format( (i+1) + "º R$%.2f\n", salarios.get(i));
        }
        
        double somatoria = 0;
        for (int i = 0; i < salarios.size(); i++) {
            somatoria += salarios.get(i);
        }
        
        double media = somatoria/salarios.size();
        
        double somaPar = 0;
        double somaImpar = 0;
        int divisor = 0;
        for (int i = 0; i < salarios.size(); i++) {
            if(i %2 == 0){
                somaPar += salarios.get(i);
            }
            else{
                somaImpar += salarios.get(i);
                divisor++;
            }
        }
        
        double mediaImpar = somaImpar/divisor;
        
        String texto = 
                "\nA média dos salários: " + String.format("R$%.2f", media) +
                "\nA somatória dos salários: " + String.format("R$%.2f", somatoria) +
                "\nA soma dos salários que estão armazenados em posições pares: " + String.format("R$%.2f", somaPar) +
                "\nA média dos salários que estão armazenados em posições ímpares: " + String.format("R$%.2f", mediaImpar) +
                "\nA quantidade de salários que estão armazenados: " + salarios.size();
        
        JOptionPane.showMessageDialog(null, "Todos os salários armazenados:\n\n" + todosOsSalarios, "Estatisticas", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, texto, "Estatisticas", JOptionPane.INFORMATION_MESSAGE);
    }

}
