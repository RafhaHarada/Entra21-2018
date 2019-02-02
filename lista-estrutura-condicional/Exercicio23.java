/*Enunciado

23.Solicitar ao usuário todas as quatro notas de cada disciplina abaixo:
    Disciplinas:
        ->Português;
        ->Matemática;
        ->Inglês;
        ->Biologia;
        ->Química;
        ->Física;
        ->Sociologia;
        ->Filosofia;
        ->Geografia;
        ->História;
        ->Educação Física.
        
    Realizar a média das notas de cada disciplina e apresentar como um boletim, após
    apresentar o boletim deve-se apresentar os seguintes tópicos abaixo:
        ->O nome e a média da matéria com maior média;
        ->O nome e a média da matéria com menor média;
        ->O nome e a nota da matéria com a maior nota;
        ->O nome e a nota da matéria com a menor nota;
        ->Apresentar a média das médias do aluno:
        
        -Caso a média das médias seja inferior a 2.0 apresenta uma mensagem que o
        aluno deve se empenhar muito mais;
        -Caso a média das médias seja inferior a 5.0 apresente uma mensagem que o
        aluno deve se empenhar um pouco mais;
        -Caso a média das médias seja inferior a 8.0 apresente uma mensagem que o
        aluno deve se empenhar porém não muito;
        -Caso a média das médias seja inferior a 10.0 apresente uma mensagem que
        o aluno tem o direito a um dia de descanso.

*/

import javax.swing.JOptionPane;

public class Exercicio23{

    public static void main(String[] args){
    
        JOptionPane.showInputDialog(parentComponent, message, title, messageType, icon, selectionValues, initialSelectionValue);
        //->Português
            double nota1P = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota","Português",JOptionPane.QUESTION_MESSAGE));
            double nota2P = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota","Português",JOptionPane.QUESTION_MESSAGE));
            double nota3P = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota","Português",JOptionPane.QUESTION_MESSAGE));
            double nota4P = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota","Português",JOptionPane.QUESTION_MESSAGE));
            double mediaP = (nota1P+nota2P+nota3P+nota4P)/4;
        //->Matemática
            double nota1M = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota","Matemática",JOptionPane.QUESTION_MESSAGE));
            double nota2M = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota","Matemática",JOptionPane.QUESTION_MESSAGE));
            double nota3M = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota","Matemática",JOptionPane.QUESTION_MESSAGE));
            double nota4M = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota","Matemática",JOptionPane.QUESTION_MESSAGE));
            double mediaM = (nota1M+nota2M+nota3M+nota4M)/4;
        //->Inglês
            double nota1I = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota","Inglês",JOptionPane.QUESTION_MESSAGE));
            double nota2I = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota","Inglês",JOptionPane.QUESTION_MESSAGE));
            double nota3I = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota","Inglês",JOptionPane.QUESTION_MESSAGE));
            double nota4I = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota","Inglês",JOptionPane.QUESTION_MESSAGE));
            double mediaI = (nota1I+nota2I+nota3I+nota4I)/4;
        //->Biologia
            double nota1B = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota","Biologia",JOptionPane.QUESTION_MESSAGE));
            double nota2B = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota","Biologia",JOptionPane.QUESTION_MESSAGE));
            double nota3B = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota","Biologia",JOptionPane.QUESTION_MESSAGE));
            double nota4B = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota","Biologia",JOptionPane.QUESTION_MESSAGE));
            double mediaB = (nota1B+nota2B+nota3B+nota4B)/4;
        //->Química
            double nota1Q = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota","Química",JOptionPane.QUESTION_MESSAGE));
            double nota2Q = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota","Química",JOptionPane.QUESTION_MESSAGE));
            double nota3Q = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota","Química",JOptionPane.QUESTION_MESSAGE));
            double nota4Q = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota","Química",JOptionPane.QUESTION_MESSAGE));
            double mediaQ = (nota1Q+nota2Q+nota3Q+nota4Q)/4;
        //->Física
            double nota1FS = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota","Física",JOptionPane.QUESTION_MESSAGE));
            double nota2FS = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota","Física",JOptionPane.QUESTION_MESSAGE));
            double nota3FS = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota","Física",JOptionPane.QUESTION_MESSAGE));
            double nota4FS = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota","Física",JOptionPane.QUESTION_MESSAGE));
            double mediaFS = (nota1FS+nota2FS+nota3FS+nota4FS)/4;
        //->Sociologia
            double nota1S = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota","Sociologia",JOptionPane.QUESTION_MESSAGE));
            double nota2S = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota","Sociologia",JOptionPane.QUESTION_MESSAGE));
            double nota3S = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota","Sociologia",JOptionPane.QUESTION_MESSAGE));
            double nota4S = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota","Sociologia",JOptionPane.QUESTION_MESSAGE));
            double mediaS = (nota1S+nota2S+nota3S+nota4S)/4;
        //->Filosofia
            double nota1FL = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota","Filosofia",JOptionPane.QUESTION_MESSAGE));
            double nota2FL = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota","Filosofia",JOptionPane.QUESTION_MESSAGE));
            double nota3FL = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota","Filosofia",JOptionPane.QUESTION_MESSAGE));
            double nota4FL = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota","Filosofia",JOptionPane.QUESTION_MESSAGE));
            double mediaFL = (nota1FL+nota2FL+nota3FL+nota4FL)/4;
        //->Geografia
            double nota1G = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota","Geografia",JOptionPane.QUESTION_MESSAGE));
            double nota2G = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota","Geografia",JOptionPane.QUESTION_MESSAGE));
            double nota3G = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota","Geografia",JOptionPane.QUESTION_MESSAGE));
            double nota4G = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota","Geografia",JOptionPane.QUESTION_MESSAGE));
            double mediaG = (nota1G+nota2G+nota3G+nota4G)/4;
        //->História
            double nota1H = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota","História",JOptionPane.QUESTION_MESSAGE));
            double nota2H = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota","História",JOptionPane.QUESTION_MESSAGE));
            double nota3H = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota","História",JOptionPane.QUESTION_MESSAGE));
            double nota4H = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota","História",JOptionPane.QUESTION_MESSAGE));
            double mediaH = (nota1H+nota2H+nota3H+nota4H)/4;
        //->Educação Física
            double nota1EF = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota","História",JOptionPane.QUESTION_MESSAGE));
            double nota2EF = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota","História",JOptionPane.QUESTION_MESSAGE));
            double nota3EF = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota","História",JOptionPane.QUESTION_MESSAGE));
            double nota4EF = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota","História",JOptionPane.QUESTION_MESSAGE));
            double mediaEF = (nota1EF+nota2EF+nota3EF+nota4EF)/4;

        double mediaTotal = (mediaB + mediaEF + mediaFL + mediaFS + mediaG + mediaH + mediaI + mediaM + mediaP + mediaQ + mediaS)/11;

        JOptionPane.showMessageDialog(null, "", "Boletim Escolar", JOptionPane.INFORMATION_MESSAGE);
    }

}