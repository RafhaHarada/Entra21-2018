
import java.awt.EventQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
public class Principal {

    public static void main(String[] args) {
        /*Sistema sistema = new Sistema();
        sistema.apresentarMenu();*/
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new TelaInicial();
            }
        });
    }

}
