import javax.swing.JOptionPane;

public class Teste2{

	public static void main(String[] args){
    
        String notaTexto = JOptionPane.showInputDialog(null, 
                "Digite as quatro notas da matéria:" + 
                "\n\nObs: utilize o formato 'nota 1;nota 2;nota 3;nota 4'" + 
                "\nSeparando os numeros por ';'", 
                "Notas da Materia: Português", 
                JOptionPane.QUESTION_MESSAGE
            );
        String aux[] = notaTexto.split(";");
        double nota1 = Double.parseDouble(aux[0]);
        double nota2 = Double.parseDouble(aux[1]);
        double nota3 = Double.parseDouble(aux[2]);
        double nota4 = Double.parseDouble(aux[3]);
        
        JOptionPane.showMessageDialog(null, nota1 + "\n" + nota2 + "\n" + nota3 + "\n" + nota4);

	}

}
