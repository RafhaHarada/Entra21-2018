import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * ExercicioExtraAlternativo
 */
public class ExercicioExtraAlternativo {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();
        List<String> tarefa = new ArrayList<String>();
        list.add("Alan");
        list.add("Carlos");
        list.add("Cidmar");
        list.add("Crispim");
        list.add("Daiana");
        list.add("Dheniffer");
        list.add("Gabriel Ferreira");
        list.add("Gabriel Budke");
        list.add("Guilherme");
        list.add("Gustavo");
        list.add("Henrique");
        list.add("Jaqueline");
        list.add("Joseph");
        list.add("Kaio");
        list.add("Leonardo Airam");
        list.add("Leonardo Moreira");
        list.add("Leticia");
        list.add("Logan");
        list.add("Lucas");
        list.add("Marcio Pedro");
        list.add("Marcio Schlosser");
        list.add("Matheus");
        list.add("Michele");
        list.add("Nattana");
        list.add("Patrick");
        list.add("Rafael");
        list.add("Ricardo");
        list.add("Sara");
        list.add("Thiago");
        list.add("Wagner");

        tarefa.add("Futebol");
        tarefa.add("Restaurante");
        tarefa.add("Padaria");
        tarefa.add("Escola");
        tarefa.add("Bombeiro");
        tarefa.add("Correios");
        tarefa.add("Policia");
        tarefa.add("Posto de Gasolina");
        tarefa.add("HEMOSC");
        tarefa.add("Loja");
        tarefa.add("Transportadora");
        tarefa.add("Cinema");
        tarefa.add("Hotel");
        tarefa.add("Contabilidade");

        Collections.shuffle(list);
        Collections.shuffle(tarefa);

        String duplas = "";
        String[] lista = list.toArray(new String[list.size()]);
        String[] tarefas = tarefa.toArray(new String[tarefa.size()]);

        for (int i = 0; i < 15; i++) {
            duplas += tarefas[i] + " - " + lista[i] + " e " + lista[i+14] + "\n";
        }

        JOptionPane.showMessageDialog(null, "Duplas:\n\n" + duplas);

    }

}