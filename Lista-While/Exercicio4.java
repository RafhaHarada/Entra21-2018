/*
Enunciado:

4. Faça um programa que solicite a quantidade de carros que o usuário deseja
cadastrar, após isto solicite para o usuário o modelo, valor e ano do carro até que
atinja a quantidade de carros para cadastro.
Apresente ao final:
-> Média do ano dos carros;
-> Média do valor dos carros;
-> Quantidade de carros que começam com a letra G;
-> Quantidade de carros que começam com a letra A.

*/


import javax.swing.JOptionPane;

public class Exercicio4{

    public static void main(String[] args){

        int quantidadeInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de carros que deseja cadastrar: ", "Quantidade de Carros", JOptionPane.QUESTION_MESSAGE));
        while(quantidadeInicial <= 0){
            JOptionPane.showMessageDialog(null, "Quantidade Inválida:\nDigite uma quantidade diferente e maior que 0;", "Error 001", JOptionPane.ERROR_MESSAGE);
            quantidadeInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente a quantidade de carros que deseja cadastrar: ", "Quantidade de Carros", JOptionPane.QUESTION_MESSAGE));
        }
        
        int quantidadeAuxiliar = 0,carrosComG = 0, carrosComA = 0;
        double mediaAno = 0, mediaValor = 0;

        while(quantidadeAuxiliar != quantidadeInicial){
            String modelo = JOptionPane.showInputDialog(null, "Digite o modelo do carro:", "Modelo do Carro", JOptionPane.QUESTION_MESSAGE).trim();
            //correções de texto
                while(modelo.equals("")){
                    JOptionPane.showMessageDialog(null, "Modelo Não Inserido:\nDigite um modelo para proceguir;", "Error 002", JOptionPane.ERROR_MESSAGE);
                    modelo = JOptionPane.showInputDialog(null, "Digite novamente o modelo do carro:", "Modelo do Carro", JOptionPane.QUESTION_MESSAGE).trim();
                }
                String modeloAux = "";
                int contador = modelo.length();
                int i = 0;
                int verificadorEspacosMeio = 0;
                while(contador != 0){
                    if(modelo.charAt(i) == ' ' && verificadorEspacosMeio == 0){
                        modeloAux = modeloAux + modelo.charAt(i);
                        verificadorEspacosMeio = 1;
                    }
                    else if(modelo.charAt(i) != ' ' && verificadorEspacosMeio == 0){
                        modeloAux = modeloAux + modelo.charAt(i);
                    }
                    else if(modelo.charAt(i) != ' ' && verificadorEspacosMeio == 1){
                        modeloAux = modeloAux + modelo.charAt(i);
                        verificadorEspacosMeio = 0;
                    }
                    else{
                        modeloAux = modeloAux + "";
                    }
                    i ++;
                    contador --;
                    }
                modelo = modeloAux;

            int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano do " + modelo + " :", "Ano do Carro", JOptionPane.QUESTION_MESSAGE));
            while(ano > 2020 || ano < 1678){
                JOptionPane.showMessageDialog(null, "Ano Inválido:\nDigite um ano com 4 caracteres;\nSendo o ano máximo 2020;\nE o ano mínimo 1678;", "Error 003", JOptionPane.ERROR_MESSAGE);
                ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente o ano do " + modelo + ":", "Ano do Carro", JOptionPane.QUESTION_MESSAGE));
            }

            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do " + modelo + " :", "Valor do Carro", JOptionPane.QUESTION_MESSAGE));
            while(valor < 0){
                JOptionPane.showMessageDialog(null, "Valor Inválido:\nDigite um valor positivo", "Error 004", JOptionPane.ERROR_MESSAGE);
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite novamente o valor do " + modelo + ":", "Valor do Carro", JOptionPane.QUESTION_MESSAGE));
            }

            mediaAno = mediaAno + ano;
            mediaValor = mediaValor + valor;

            modelo = modelo.toUpperCase();
            char doModelo = modelo.charAt(0);
            
            if(doModelo == 'G'){
                carrosComG = carrosComG + 1;
            }
            if(doModelo == 'A'){
                carrosComA = carrosComA + 1;
            }

            quantidadeAuxiliar = quantidadeAuxiliar + 1;
        }

        mediaAno = mediaAno/quantidadeInicial;
        mediaValor = mediaValor/quantidadeInicial;
        
        JOptionPane.showMessageDialog(null, 
        "Média de anos: " + String.format("%.2f", mediaAno) + 
        "\nMédia de valores: R$" + String.format("%.2f", mediaValor) + 
        "\nQuantidade de carros que começam com G: " + carrosComG + 
        "\nQuantidade de carros que começam com A: " + carrosComA, 
        "Informações dos Carros", JOptionPane.INFORMATION_MESSAGE);
    }
}