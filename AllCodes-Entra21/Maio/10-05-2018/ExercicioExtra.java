/**
 * Exercicio Extra para geração aleatoria de duplas a partir de uma lista de nomes
 */

import javax.swing.JOptionPane;

public class ExercicioExtra {

    public static void main(String[] args) {
        
        //Primeira e Segunda Auxiliar de números aleatórios.
            int aux1 = (int)(Math.random() * 30); 
            int aux2 = (int)(Math.random() * 30); 

        //Variável de condição para botões e suas opções.
            int botoes = 0;
            Object opcao[] = {"Pessoas","Novas Duplas","Sair"};

        //Listas de pessoas e duplas
            String pessoas[] = new String[30];
            String duplas[] = new String[15];

        //Listas para apresentação.
            String lista1 = "";
            String lista2 = "";

        //Loop para gerar outras combinações.
            while(botoes != 4){
                //Pessoas
                    pessoas[0] = "Alan";
                    pessoas[1] = "Carlos";
                    pessoas[2] = "Cidmar";
                    pessoas[3] = "Crispim";
                    pessoas[4] = "Daiana";
                    pessoas[5] = "Dheniffer";
                    pessoas[6] = "Gabriel Ferreira";
                    pessoas[7] = "Gabriel Budke";
                    pessoas[8] = "Guilherme";
                    pessoas[9] = "Gustavo";
                    pessoas[10] = "Henrique";
                    pessoas[11] = "Jaqueline";
                    pessoas[12] = "Joseph";
                    pessoas[13] = "Kaio";
                    pessoas[14] = "Leonardo Airam";
                    pessoas[15] = "Leonardo Moreira";
                    pessoas[16] = "Leticia";
                    pessoas[17] = "Logan";
                    pessoas[18] = "Lucas";
                    pessoas[19] = "Marcio Pedro";
                    pessoas[20] = "Marcio Schlosser";
                    pessoas[21] = "Matheus";
                    pessoas[22] = "Michele";
                    pessoas[23] = "Nattana";
                    pessoas[24] = "Patrick";
                    pessoas[25] = "Rafael";
                    pessoas[26] = "Ricardo";
                    pessoas[27] = "Sara";
                    pessoas[28] = "Thiago";
                    pessoas[29] = "Wagner";
                
                //Atribuição de pessoas a lista.
                    for (int i = 0; i < pessoas.length; i++) {
                    //Adiciona em uma lista as pessoas.
                        lista1 += "-" + pessoas[i] + "\n";
                    }
                
                //Combinatória de pessoas.
                    for (int i = 0; i < duplas.length; i++) {
                    //armazena na nª dupla duas pessoas aleatórias.
                        duplas[i] = pessoas[aux1] + " e " + pessoas[aux2];
                    
                    //inicio de filtro, verifica se: a dupla sortiada é a mesma pessoa e se algum componente já tem dupla.
                        while (pessoas[aux1].equals(pessoas[aux2]) || pessoas[aux1].equals("Com dupla") || pessoas[aux2].equals("Com dupla")) {
                        //Usada para caso a primeira pessoa seja a mesma que a segunda ou se ja foi escolhida.
                            aux1 = (int)(Math.random() * 30); 
                        //Usada para caso a segunda pessoa seja a mesma que a primeira ou se ja foi escolhida.
                            aux2 = (int)(Math.random() * 30); 
                        //Armazena na nª dupla uma nova configuração.
                            duplas[i] = pessoas[aux1] + " e " + pessoas[aux2]; 
                        }
                    //Neste momento uma dupla já foi feita e armazenada.
                    
                    //Aqui ambas as pessoas da dupla são retiradas da lista de componentes.
                        pessoas[aux1] = "Com dupla";
                        pessoas[aux2] = "Com dupla";
                    
                    //randomiza outra vez as auxiliares.
                        aux1 = (int)(Math.random() * 30);
                        aux2 = (int)(Math.random() * 30);
                    
                    //Adiciona em uma lista a dupla gerada.
                        lista2 += duplas[i] + "\n";
                    }
                //Apresentação das pessoas e dos botões
                    botoes = JOptionPane.showOptionDialog(null, 
                        "Escolha alguma das opções abaixo:\n" +
                        "\nPessoas - Mostra a lista de pessoas para se gerar as duplas:" +
                        "\nNovas Duplas - Gera novas duplas aleatóriamente." +
                        "\nSair - Fecha o programa.\n\n"
                        , 
                        "Gerador de Duplas", 0, 
                        JOptionPane.PLAIN_MESSAGE, 
                        null, opcao, opcao[0]);
                    //Botão que motra as duplas geradas 
                        if(botoes == 0){
                            JOptionPane.showMessageDialog(null, "Lista de Pessoas:\n" + lista1, "Pessoas", JOptionPane.PLAIN_MESSAGE);
                            lista1 = "";
                            lista2 = "";
                        }
                    //Botão que motra as duplas geradas
                        else if(botoes == 1){
                            JOptionPane.showMessageDialog(null, "Lista de Duplas:\n\n" + lista2, "Duplas", JOptionPane.INFORMATION_MESSAGE);
                            lista1 = "";
                            lista2 = "";
                        }
                    //Outros botões fecham o programa.
                        else{
                            JOptionPane.showMessageDialog(null, "Obrigado por usar nossos serviços.", "Saindo do Programa...", JOptionPane.WARNING_MESSAGE);
                            System.exit(0);
                        }
                }

    }
    
}