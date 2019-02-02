
import javax.swing.JOptionPane;

public class ExemploWhile01{

	public static void main(String[] args){
	
        int atual = 0;
        int coluna = 10;
        int caracteresMaximosPorLinha = 10;
		while(atual < 10){
            coluna = caracteresMaximosPorLinha;
            while(coluna > 0){
                System.out.print("*");
                coluna = coluna - 1;
                
            }
            System.out.println("");
            atual = atual + 1;
            caracteresMaximosPorLinha = caracteresMaximosPorLinha - 1;
            
        }

	}

}
