import javax.swing.JOptionPane;

public class Prova1{

    public static void main(String[] args){

        String nome = "", diretor = "", descricao = "", pReceitaMaior = "", pOrcamentoMenor = "", diretorMaior = "", diretorMenor = "", pAnoMenor = "", pDiretorMaior = "", pDiretorMenor = "";
        int ano = 0, anoMenor = 3000, count = 0;
        double orcamento = 0, receita = 0, lucro = 0, receitaMaior = Double.MIN_VALUE, orcamentoMenor = Double.MAX_VALUE;

        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas produções deseja cadastrar?", "Cadastro da Produção", JOptionPane.QUESTION_MESSAGE));
            while(quantidade <= 0 ){
                JOptionPane.showMessageDialog(null, "Erro de entrada\nDigite um numero maior que 0!", "ERROR 001", JOptionPane.ERROR_MESSAGE);
                quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente quantas produções deseja cadastrar?"));
            }

        while (quantidade != 0){

            //Cadastro
                nome = JOptionPane.showInputDialog(null, "Insira o nome do filme:", "Cadastro da Produção", JOptionPane.QUESTION_MESSAGE).trim();
                    while(nome.equals("")){
                        JOptionPane.showMessageDialog(null, "Erro de Entrada!", "ERROR 002", JOptionPane.ERROR_MESSAGE);
                        nome = JOptionPane.showInputDialog(null, "Insira novamente o nome do filme:", "Cadastro da Produção", JOptionPane.QUESTION_MESSAGE).trim();
                    }
                diretor = JOptionPane.showInputDialog(null, "Insira o nome do diretor de " + nome + ":", "Cadastro da Produção", JOptionPane.QUESTION_MESSAGE).trim();
                    while(diretor.equals("")){
                        JOptionPane.showMessageDialog(null, "Erro de Entrada!", "ERROR 003", JOptionPane.ERROR_MESSAGE);
                        diretor = JOptionPane.showInputDialog(null, "Insira novamente o nome do diretor de " + nome + ":", "Cadastro da Produção", JOptionPane.QUESTION_MESSAGE).trim();
                    }
                ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano de " + nome + ":", "Cadastro da Produção", JOptionPane.QUESTION_MESSAGE));
                    while(ano <= 0 || ano < 1940 || ano > 2020){
                        JOptionPane.showMessageDialog(null, "Erro de entrada\nDigite um numero entre 1940 e 2020!", "ERROR 004", JOptionPane.ERROR_MESSAGE);
                        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira novamente o ano de " + nome + ":"));
                    }
                orcamento = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o orçamento de " + nome + ":", "Cadastro da Produção", JOptionPane.QUESTION_MESSAGE));
                    while(orcamento <= 0 ){
                        JOptionPane.showMessageDialog(null, "Erro de entrada\nDigite um numero maior ou igual á 0!", "ERROR 005", JOptionPane.ERROR_MESSAGE);
                        orcamento = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira novamente o orçamento de " + nome + ":"));
                    }
                receita = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a receita de " + nome + ":", "Cadastro da Produção", JOptionPane.QUESTION_MESSAGE));
                    while(receita <= 0){
                        JOptionPane.showMessageDialog(null, "Erro de entrada\nDigite um numero maior ou igual á 0!", "ERROR 006", JOptionPane.ERROR_MESSAGE);
                        receita = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira novamente a receita de " + nome + ":"));
                    }
                descricao = JOptionPane.showInputDialog(null, "Insira a descrição de " + nome + ":", "Cadastro da Produção", JOptionPane.QUESTION_MESSAGE);
                lucro = receita - orcamento;
                JOptionPane.showMessageDialog(null, "O lucro desta produção foi de: R$" + String.format("%.2f", lucro), "Lucro da Produção", JOptionPane.INFORMATION_MESSAGE);

            //Contabilidade
                if(receita > receitaMaior){
                    receitaMaior = receita;
                    pReceitaMaior = nome;
                }

                if(orcamento < orcamentoMenor){
                    orcamentoMenor = orcamento;
                    pOrcamentoMenor = nome;
                }

                if(ano < anoMenor){
                    anoMenor = ano;
                    pAnoMenor = nome;
                }

                if(diretor.length() > diretorMaior.length()){
                    diretorMaior = diretor;
                    pDiretorMaior = nome;
                }

                if(diretorMaior.length() > 0 && count == 0){
                    pDiretorMenor = nome;
                    diretorMenor = diretor;
                    count = 1;
                }

                if(diretor.length() < diretorMenor.length()){
                    pDiretorMenor = nome;
                    diretorMenor = diretor;
                }
                
            quantidade = quantidade - 1;
        }

        JOptionPane.showMessageDialog(null, 
            "Premiação Disney 2018\n" + 
            "\nO filme com maior receita foi a de: " + pReceitaMaior + " com um valor de R$" + String.format("%.2f", receitaMaior) +
            ";\nO filme com menor orçamento foi a de: " + pOrcamentoMenor + " com um valor de R$" + String.format("%.2f", orcamentoMenor) +
            ";\nO filme mais velho foi a de: " + pAnoMenor + " produzido em " + anoMenor +
            ";\nO filme com maior nome de diretor foi a de: " + pDiretorMaior + " do diretor " + diretorMaior + " com um " + diretorMaior.length() + " caracteres" +
            ";\nO filme com menor nome de diretor foi a de: " + pDiretorMenor + " do diretor " + diretorMenor + " com um " + diretorMenor.length() + " caracteres;"
            , 
            "Premiação de Filmes", 
            JOptionPane.INFORMATION_MESSAGE);
    }
  
}
  