package principal;

import view.AlunoCadastro;
import java.awt.EventQueue;
import view.AlunoLista;

/*
 * @author Airam
 */
public class Principal {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AlunoLista();
            }
        });
    }
}
