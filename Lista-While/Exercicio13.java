/*
Enunciado:

13. Solicite um número e apresentar a tabuada do mesmo até 1000.

*/


import javax.swing.JOptionPane;

public class Exercicio13{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número","Tabuada Milenar",JOptionPane.QUESTION_MESSAGE));
        int multiplicador = 0;
        String tabuada = "";
        int contador = 10;
        while(numero == 0){
            JOptionPane.showMessageDialog(null,
                "Você inseriu 0, mas você deveria saber,que\n" +
                "Qualque número vezes 0 é igual a 0.\n" + 
                "\nEntão insira algum outro que não seja 0!","Ueh...0?", JOptionPane.WARNING_MESSAGE);
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira novamente um número","Tabuada Milenar",JOptionPane.QUESTION_MESSAGE));
        }
        int pagina = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Insira uma página" + 
            "\n1 - Página de " + numero + "x0 até " + numero + "x300" +
            "\n2 - Página de " + numero + "x301 até " + numero + "x600" +
            "\n3 - Página de " + numero + "x601 até " + numero + "x900" +
            "\n4 - Página de " + numero + "x901 até " + numero + "x1000" +
            "\n5 - Para sair da tabuada milenar",
            "Tabuada Milenar",
            JOptionPane.QUESTION_MESSAGE));
        while(pagina != 5){
            if(pagina <= 0 || pagina >5){
                while(pagina <= 0 || pagina > 5){
                    JOptionPane.showMessageDialog(null,"Erro de entrada!\nPágina não está no sistema!","ERROR 001",JOptionPane.ERROR_MESSAGE);
                    pagina = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Insira novamente uma página" + 
                        "\n1 - Página de " + numero + "x0 até " + numero + "x300" +
                        "\n2 - Página de " + numero + "x301 até " + numero + "x600" +
                        "\n3 - Página de " + numero + "x601 até " + numero + "x900" +
                        "\n4 - Página de " + numero + "x901 até " + numero + "x1000" +
                        "\n5 - Para sair da tabuada milenar",
                        "Tabuada Milenar",
                        JOptionPane.QUESTION_MESSAGE));
                }
            }
            if(pagina == 1){
                tabuada = "";
                multiplicador = 0;
                while(multiplicador <= 300){
                    while(contador != 0 && multiplicador <= 300){
                        tabuada = tabuada + numero + " x " + multiplicador + " = " + (numero*multiplicador) + " | ";
                        if(multiplicador == 0){
                            contador ++;
                        }
                        multiplicador ++;
                        contador --;
                    }
                    tabuada = tabuada + "\n";
                    contador = 10;
                }
                JOptionPane.showMessageDialog(null,"Tabuada do " + numero + "\n\n" + tabuada, "Tabuada Milenar", JOptionPane.PLAIN_MESSAGE);
            }
            else if(pagina == 2){
                tabuada = "";
                multiplicador = 301;
                while(multiplicador <= 600){
                    while(contador != 0 && multiplicador <= 600){
                        tabuada = tabuada + numero + " x " + multiplicador + " = " + (numero*multiplicador) + " | ";
                        multiplicador ++;
                        contador --;
                    }
                    tabuada = tabuada + "\n";
                    contador = 10;
                }
                JOptionPane.showMessageDialog(null,"Tabuada do " + numero + "\n\n" + tabuada, "Tabuada Milenar", JOptionPane.PLAIN_MESSAGE);
            }
            else if(pagina == 3){
                tabuada = "";
                multiplicador = 601;
                while(multiplicador <= 900){
                    while(contador != 0 && multiplicador <= 900){
                        tabuada = tabuada + numero + " x " + multiplicador + " = " + (numero*multiplicador) + " | ";
                        multiplicador ++;
                        contador --;
                    }
                    tabuada = tabuada + "\n";
                    contador = 10;
                }
                JOptionPane.showMessageDialog(null,"Tabuada do " + numero + "\n\n" + tabuada, "Tabuada Milenar", JOptionPane.PLAIN_MESSAGE);
            }
            else if(pagina == 4){
                tabuada = "";
                multiplicador = 901;
                while(multiplicador <= 1000){
                    while(contador != 0 && multiplicador <= 1000){
                        tabuada = tabuada + numero + " x " + multiplicador + " = " + (numero*multiplicador) + " | ";
                        multiplicador ++;
                        contador --;
                    }
                    tabuada = tabuada + "\n";
                    contador = 10;
                }
                JOptionPane.showMessageDialog(null,"Tabuada do " + numero + "\n\n" + tabuada, "Tabuada Milenar", JOptionPane.PLAIN_MESSAGE);
            }
            pagina = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insira uma página" + 
                "\n1 - Página de " + numero + "x0 até " + numero + "x300" +
                "\n2 - Página de " + numero + "x301 até " + numero + "x600" +
                "\n3 - Página de " + numero + "x601 até " + numero + "x900" +
                "\n4 - Página de " + numero + "x901 até " + numero + "x1000" +
                "\n5 - Para sair da tabuada milenar",
                "Tabuada Milenar",
                JOptionPane.QUESTION_MESSAGE));
            
        }
        JOptionPane.showMessageDialog(null,"Fim dos estudos!", "END GAME", JOptionPane.INFORMATION_MESSAGE);
    }
}