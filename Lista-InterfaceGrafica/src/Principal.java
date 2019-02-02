
import java.awt.EventQueue;

/**
 *
 * @author Alunos
 */
public class Principal {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new classePrincipal();
            }
        });
    }

}
