import javax.swing.JOptionPane;

/*
Enunciado:
7. Solicite a altura de 4 animais, apresente ao final a altura do animal com a
menor altura.
*/

public class Exercicio7 {
    
    public static void main(String[] args) {
        
        int i = 0;

        String texto = "";

        double alturaMaior = Integer.MIN_VALUE, alturaMenor = Integer.MAX_VALUE;
        double[] alturas = new double[4];

        while (i != 4) {
            alturas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura do " + (i+1) + "ª animal:", "Altura nº" + (i+1), JOptionPane.INFORMATION_MESSAGE));
            if(alturas[i] > alturaMaior){
                alturaMaior = alturas[i];
            }
            if(alturas[i] < alturaMenor){
                alturaMenor = alturas[i];
            }
            texto = texto + "\n" + (i+1) + "º Animal: "+ String.format("%.2f", alturas[i]) + " m";
            i++;
        }

        JOptionPane.showMessageDialog(null, 
        "As alturas que você inseriu:\n" +
        texto +
        "\n\nO mais alto tem :" + String.format("%.2f", alturaMaior) + " m" + 
        "\nO mais baixo tem :" + String.format("%.2f", alturaMenor) + " m" 
        , 
        "Animais e Onde Habitam 2", 
        JOptionPane.INFORMATION_MESSAGE);
    }
    
}