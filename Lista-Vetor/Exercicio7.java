import javax.swing.JOptionPane;

/*
Enunciado:
7. Solicite a altura de 4 animais, apresente ao final a altura do animal com a
menor altura.
*/

public class Exercicio7 {
    
    public static void main(String[] args) {
        
        double alturaMaior = Integer.MIN_VALUE;
        double alturaMenor = Integer.MAX_VALUE;

        double[] alturas = new double[4];
            alturas[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura do 1ª animal:", "Altura nº1", JOptionPane.INFORMATION_MESSAGE));
            alturas[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura do 2ª animal:", "Altura nº2", JOptionPane.INFORMATION_MESSAGE));
            alturas[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura do 3ª animal:", "Altura nº3", JOptionPane.INFORMATION_MESSAGE));
            alturas[3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura do 4ª animal:", "Altura nº4", JOptionPane.INFORMATION_MESSAGE));

        //Altura maior
            if(alturas[0] > alturaMaior){
                alturaMaior = alturas[0];
            }
            if(alturas[1] > alturaMaior){
                alturaMaior = alturas[1];
            }
            if(alturas[2] > alturaMaior){
                alturaMaior = alturas[2];
            }
            if(alturas[3] > alturaMaior){
                alturaMaior = alturas[3];
            }
        //Altura menor
            if(alturas[0] < alturaMenor){
                alturaMenor = alturas[0];
            }
            if(alturas[1] < alturaMenor){
                alturaMenor = alturas[1];
            }
            if(alturas[2] < alturaMenor){
                alturaMenor = alturas[2];
            }
            if(alturas[3] < alturaMenor){
                alturaMenor = alturas[3];
            }
        JOptionPane.showMessageDialog(null, 
        "As alturas que você inseriu:\n" +
        "\n1º Animal: "+ alturas[0] + " m" +
        "\n2º Animal: "+ alturas[1] + " m" +
        "\n3º Animal: "+ alturas[2] + " m" +
        "\n4º Animal: "+ alturas[3] + " m" +
        "\n\nO mais alto tem :" + alturaMaior + " m" + 
        "\nO mais baixo tem :" + alturaMenor + " m" 
        , 
        "Animais e Onde Habitam 2", 
        JOptionPane.INFORMATION_MESSAGE);
    }
    
}