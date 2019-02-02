import javax.swing.JOptionPane;

/*
Enunciado:
11.Solicitar 5 nomes para o usuário armazenando ao vetor.
Exemplo do vetor de nomes:

|Lucas|Paulo|Lúcia|Pedro|Jennifer|

Apresentar da seguinte forma os nomes:
Lucas, Paulo, Lúcia, Pedro e Jennifer.
*/
public class Exercicio11 {

    public static void main(String[] args) {
    
    	 String nomes[] = new String[5];
         String texto = "";

         for (int i = 0; i < nomes.length; i++) {
             nomes[i] = JOptionPane.showInputDialog(null,"Digite um nome: ", (i+1) + "º Nome", JOptionPane.QUESTION_MESSAGE);
         }
         for (int i = 0; i < nomes.length; i++) {
             if(i < (nomes.length - 2)){
                 texto += nomes[i] + ", ";
             }
             else if(i < (nomes.length - 1)){
                 texto += nomes[i] + " e ";
             }
             else{
                 texto += nomes[i] + ". ";
             }
         }
         JOptionPane.showMessageDialog(null, "Os nomes postos foram:\n" + texto, "Nomes", JOptionPane.INFORMATION_MESSAGE);

    }
    
}