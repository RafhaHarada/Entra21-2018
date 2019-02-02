
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada
 */
/* Enunciado:
    7. Desenvolver um algoritmo e armazene 25 nomes em uma ArrayList e ao final
 apresentar:
 -> Todos os nomes no ArrayList;
 -> Nome com o maior nome;
 -> Nome com o menor nome;
 -> Quantidade de pessoas que têm o nome Paulo;
 -> Quantidade de pessoas que têm o nome Ana;
 -> Quantidade de pessoas que têm a primeira letra do nome começando com uma
 vogal.
 */
public class Exercicio07 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", (i + 1) + "º Nomes", JOptionPane.QUESTION_MESSAGE));
        }

        String texto = "";
        for (int i = 0; i < nomes.size(); i++) {
            texto += nomes.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Nomes:\n\n" + texto, "Todos os Nomes", JOptionPane.INFORMATION_MESSAGE);

        String maiorNome = "";
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).length() > maiorNome.length()) {
                maiorNome = nomes.get(i);
            }
        }

        String menorNome = maiorNome;
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).length() < menorNome.length()) {
                menorNome = nomes.get(i);
            }
        }

        int paulo = 0;
        int ana = 0;
        int vogal = 0;

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase("Paulo")) {
                paulo++;
            } else if (nomes.get(i).equalsIgnoreCase("Ana")) {
                ana++;
                vogal++;
                continue;
            }
            String comparacao = "" + nomes.get(i).charAt(0);
            if (comparacao.equalsIgnoreCase("a")
                    || comparacao.equalsIgnoreCase("e")
                    || comparacao.equalsIgnoreCase("i")
                    || comparacao.equalsIgnoreCase("o")
                    || comparacao.equalsIgnoreCase("u")) {
                vogal++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Dados:\n"
                + "\nNome com o maior nome: " + maiorNome 
                + "\nNome com o menor nome: " + menorNome
                + "\nQuantidade de nomes com o nome Paulo: " + paulo
                + "\nQuantidade de nomes com o nome Ana: " + ana
                + "\nQuantidade de nomes com a primeira letra sendo uma vogal: " + vogal
        );
    }

}
