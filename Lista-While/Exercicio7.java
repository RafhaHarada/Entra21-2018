/*
Enunciado:

7. O comitê da seleção brasileira de futebol deseja obter algumas estatísticas dos
jogadores, para visualizar melhor o desempenho de seus atletas.
Para tal deve-se solicitar as seguintes informações abaixo:
-> Nome;
-> Idade;
-> Peso;
-> Sexo;
-> Altura;
-> Quantidade de gols marcados;
-> Quantidade de cartões amarelos recebidos;
-> Quantidade de cartões vermelhos recebidos;
Lembrando que um time de futebol terá 22 jogadores.
Ao final deve-se apresentar as seguintes estatísticas:
-> O jogador com o menor peso;
-> O jogador com a maior altura;
-> O jogador com o maior nome;
-> A quantidade de jogadores do sexo F
-> A quantidade de jogadores do sexo M
-> O jogador com a menor quantidade de cartões amarelos recebidos;
-> O jogador com o menor nome;
-> O jogador com o maior peso;
-> O jogador com a maior quantidade de cartões vermelhos recebidos;
-> O jogador com a maior quantidade de cartões amarelos recebidos;
-> O jogador com a menor quantidade de cartões vermelhos recebidos.

*/


import javax.swing.JOptionPane;

public class Exercicio7{

    public static void main(String[] args){

        double pesoMenor = Double.MAX_VALUE; double pesoMaior = Double.MIN_VALUE;
        double alturaMenor = Double.MAX_VALUE; double alturaMaior = Double.MIN_VALUE;
        int vermelhoMenor = Integer.MAX_VALUE; int vermelhoMaior = Integer.MIN_VALUE;
        int amareloMenor = Integer.MAX_VALUE; int amareloMaior = Integer.MIN_VALUE;
        int nomeMenor = Integer.MAX_VALUE; int nomeMaior = Integer.MIN_VALUE;
        int numero = 1;
        int quantidadeSexoF = 0;
        int quantidadeSexoM = 0;

        String tudo = JOptionPane.showInputDialog(null,
            "Digite as informações do atleta:" + 
            "\nUtilize o formato:" + 
            "\nNome;Idade;Peso;Sexo;Altura;G;CA;CV;" + 
            "\n\nSiglas:" + 
            "\nG = Quantidade de gols marcados" + 
            "\nCA = Quantidade de cartões amarelos recebidos" + 
            "\nCV = Quantidade de cartões vermelhos recebidos" +
            "\nPara Sexo use \"F\" para Feminino e \"M\" para Masculino",
            "Jogador " + numero, 
            JOptionPane.QUESTION_MESSAGE);

        tudo.replaceAll(",", ".");

        String[] auxiliar = tudo.split(";");
        String nome = auxiliar[0];
        int idade = Integer.parseInt(auxiliar[1]);
        double peso = Double.parseDouble(auxiliar[2]);
        String sexo = auxiliar[3];
        double altura = Double.parseDouble(auxiliar[4]);
        int gols = Integer.parseInt(auxiliar[5]);
        int cartoesAmarelos = Integer.parseInt(auxiliar[6]);
        int cartoesVermelhos = Integer.parseInt(auxiliar[7]);
        
        //para salvar os nomes dos jogadores
        String 
            jogadorPesado = "", jogadorLeve = "", jogadorNomeMaior = "", jogadorNomeMenor = "", jogadorAlto = "", jogadorBaixo = "", jogadorCvMaior = "", jogadorCvMenor = "", jogadorCaMaior = "", jogadorCaMenor = ""
        ;

        while(numero <= 22){
            //erros possiveis
                while(
                    nome == ""  &&
                    idade <= 0  &&
                    idade > 120  &&
                    peso <= 0.0  &&
                    peso > 400.0  &&
                    !sexo.equalsIgnoreCase("f")  &&
                    !sexo.equalsIgnoreCase("m")  &&
                    altura <= 0  &&
                    altura > 3.0  &&
                    gols < 0  &&
                    cartoesAmarelos < 0  &&
                    cartoesVermelhos < 0
                    ){
                    JOptionPane.showMessageDialog(null, 
                        "Você digitou algo fora dos padrões ou inválido.\n" + 
                        "\nPossíveis erros cometidos: " +
                        "\n-Não inseriu o nome." + 
                        "\n-Inseriu valores inválidos para idade." + 
                        "\n-Inseriu valores inválidos para peso." + 
                        "\n-Não inseriu o sexo." + 
                        "\n-Inseriu valores inválidos para altura." + 
                        "\n-Inseriu valores inválidos para gols." + 
                        "\n-Inseriu valores inválidos para cartões amarelos." + 
                        "\n-Inseriu valores inválidos para cartões vermelhos.", 
                        "Error 001", 
                        JOptionPane.ERROR_MESSAGE);
                    tudo = JOptionPane.showInputDialog(null,
                        "Digite as informções do atleta novamente:" + 
                        "\nUtilize o formato:" + 
                        "\nNome;Idade;Peso;Sexo;Altura;G;CA;CV;" + 
                        "\nPara Sexo use \"F\" para Feminino e \"M\" para Masculino" + 
                        "\n\nSiglas:" + 
                        "\nG = Quantidade de gols marcados" + 
                        "\nCA = Quantidade de cartões amarelos recebidos" + 
                        "\nCV = Quantidade de cartões vermelhos recebidos", 
                        "Jogador " + numero, 
                        JOptionPane.QUESTION_MESSAGE);
                }

            //coparações:
                if(peso < pesoMenor){
                    pesoMenor = peso;
                    jogadorLeve = nome;
                }
                if(peso > pesoMaior){
                    pesoMaior = peso;
                    jogadorPesado = nome;
                }
                if(altura < alturaMenor){
                    alturaMenor = altura;
                    jogadorBaixo = nome;
                }
                if(altura > alturaMaior){
                    alturaMaior = altura;
                    jogadorAlto = nome;
                }
                if(cartoesVermelhos < vermelhoMenor){
                    vermelhoMenor = cartoesVermelhos;
                    jogadorCvMenor = nome;
                }
                if(cartoesVermelhos > vermelhoMaior){
                    vermelhoMaior = cartoesVermelhos;
                    jogadorCvMaior = nome;
                }
                if(cartoesAmarelos < amareloMenor){
                    amareloMenor = cartoesAmarelos;
                    jogadorCaMenor = nome;
                }
                if(cartoesAmarelos > amareloMaior){
                    amareloMaior = cartoesAmarelos;
                    jogadorCaMaior = nome;
                }
                if(nome.length() < nomeMenor){
                    nomeMenor = nome.length();
                    jogadorNomeMenor = nome;
                }
                if(nome.length() > nomeMaior){
                    nomeMaior = nome.length();
                    jogadorNomeMaior = nome;
                }
            //quantificação de sexos
                if(sexo.equalsIgnoreCase("F")){
                    quantidadeSexoF = quantidadeSexoF + 1;
                }if(sexo.equalsIgnoreCase("M")){
                    quantidadeSexoM = quantidadeSexoM + 1;
                }
            numero ++;
            tudo = JOptionPane.showInputDialog(null,
            "Digite as informações do atleta:" + 
            "\nUtilize o formato:" + 
            "\nNome;Idade;Peso;Sexo;Altura;G;CA;CV;" + 
            "\n\nSiglas:" + 
            "\nG = Quantidade de gols marcados" + 
            "\nCA = Quantidade de cartões amarelos recebidos" + 
            "\nCV = Quantidade de cartões vermelhos recebidos" +
            "\nPara Sexo use \"F\" para Feminino e \"M\" para Masculino",
            "Jogador " + numero, 
            JOptionPane.QUESTION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, 
            "Estatísticas do time:\n" +
            ".\nO jogador com o maior nome: " + jogadorNomeMaior +
            ".\nO jogador com o menor nome: " + jogadorNomeMenor +
            ".\nO jogador com o maior peso: " + jogadorPesado + " com " + String.format("%.2f", pesoMaior) + "Kg" +
            ".\nO jogador com o menor peso: " + jogadorLeve + " com " + String.format("%.2f",pesoMenor) + "Kg" +
            ".\nO jogador com a maior altura: " + jogadorAlto + " com " + String.format("%.2f",alturaMaior) + "m" +
            ".\nO jogador com a menor altura: " + jogadorBaixo + " com " + String.format("%.2f",alturaMenor) + "m" +
            ".\nA quantidade de jogadores do sexo F: " + quantidadeSexoF +
            ".\nA quantidade de jogadores do sexo M: " + quantidadeSexoM +
            ".\nO jogador com a maior quantidade de cartões amarelos recebidos: " + jogadorCaMaior + " com " + amareloMaior +
            ".\nO jogador com a menor quantidade de cartões amarelos recebidos: " + jogadorCaMenor + " com " + amareloMenor +
            ".\nO jogador com a maior quantidade de cartões vermelhos recebidos: " + jogadorCvMaior + " com " + vermelhoMaior +
            ".\nO jogador com a menor quantidade de cartões vermelhos recebidos: " + jogadorCvMenor + " com " + vermelhoMenor, 
            "Estatísticas", 
            JOptionPane.INFORMATION_MESSAGE);



    }
}