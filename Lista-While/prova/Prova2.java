import javax.swing.JOptionPane;

public class Prova2
{

    public static void main(String[] args){
        
        String nMaisPecas = "", nMenosPecas = "";
        int vendasRealizadas = 0, quantidadeTotal = 0, maisPecas = Integer.MIN_VALUE, menosPecas = Integer.MAX_VALUE, count = 0;
        double mediaTotal = 0, valorTotal = 0;

        String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente:", "Cadastro de Cliente",JOptionPane.QUESTION_MESSAGE).trim();
            while(nome.equals("")){
                JOptionPane.showMessageDialog(null, "Erro de entrada!","ERROR 001",JOptionPane.ERROR_MESSAGE);
                nome = JOptionPane.showInputDialog(null, "Digite novamente o nome do cliente:").trim();
            }
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de peças que " + nome + " comprou:", "Cadastro de Cliente",JOptionPane.QUESTION_MESSAGE));
            while(quantidade <= 0){
                JOptionPane.showMessageDialog(null, "Erro de entrada!","ERROR 002",JOptionPane.ERROR_MESSAGE);
                quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira novamente a quantidade de peças que " + nome + " comprou:"));
            }
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor total da compra:", "Cadastro de Cliente",JOptionPane.QUESTION_MESSAGE));
            while(valor <= 0){
                JOptionPane.showMessageDialog(null, "Erro de entrada!","ERROR 003",JOptionPane.ERROR_MESSAGE);
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor total da compra:"));
            }

        while(!nome.equalsIgnoreCase("fim")){
            //contabilidade
                quantidadeTotal = quantidadeTotal + quantidade;
                valorTotal = valorTotal + valor;

                if(quantidade > maisPecas){
                    maisPecas = quantidade;
                    nMaisPecas = nome;
                }
                if(quantidade < menosPecas){
                    menosPecas = quantidade;
                    nMenosPecas = nome;
                }
                vendasRealizadas = vendasRealizadas + 1;
            //cadastro proximo ||
                nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente:\n\nOu insira \"Fim\" para fechar o sistema.", "Cadastro de Cliente",JOptionPane.QUESTION_MESSAGE).trim();
                    while(nome.equals("")){
                        JOptionPane.showMessageDialog(null, "Erro de entrada!","ERROR 001",JOptionPane.ERROR_MESSAGE);
                        nome = JOptionPane.showInputDialog(null, "Digite novamente o nome do cliente:", "Cadastro de Cliente",JOptionPane.QUESTION_MESSAGE).trim();
                    }
                if(!nome.equalsIgnoreCase("fim")){
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de peças que " + nome + " comprou:", "Cadastro de Cliente",JOptionPane.QUESTION_MESSAGE));
                        while(quantidade <= 0){
                            JOptionPane.showMessageDialog(null, "Erro de entrada!","ERROR 002",JOptionPane.ERROR_MESSAGE);
                            quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira novamente a quantidade de peças que " + nome + " comprou:"));
                        }
                    valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor total da compra:", "Cadastro de Cliente",JOptionPane.QUESTION_MESSAGE));
                        while(valor <= 0){
                            JOptionPane.showMessageDialog(null, "Erro de entrada!","ERROR 003",JOptionPane.ERROR_MESSAGE);
                            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor total da compra:", "Cadastro de Cliente",JOptionPane.QUESTION_MESSAGE));
                        }
                }
        }
        mediaTotal = valorTotal/vendasRealizadas;

        JOptionPane.showMessageDialog(null, 
            "A quantidade de vendas realizadas: " + vendasRealizadas +
            ".\nO valor total de todas as compras: R$" + String.format("%.2f", valorTotal) +
            ".\nA média do total de todas as compras: R$" + String.format("%.2f", mediaTotal) + "/Peças" +
            ".\nA quantidade de peças do pedido com mais peças foi a de: " + nMaisPecas + " com " + maisPecas + " peças" +
            "\nA quantidade de peças do pedido com menos peças foi a de: " + nMenosPecas + " com " + menosPecas + " peças.",
            "Informações de Status",
            JOptionPane.INFORMATION_MESSAGE
            );
    }
}
  