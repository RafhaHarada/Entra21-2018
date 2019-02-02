
import javax.swing.JOptionPane;

public class teste {

public static void main(String[] args) {

int m[][] = new int[3][3];
int l,c,soma = 0;

JOptionPane.showMessageDialog(null, m);

for (l = 1; l < 3; l++ ){
for (c = 1; c < 3; c++ ){

m[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null,
"Digite o valor do elemento na linha " + l + ", coluna " + c,
"Matriz 3 x 3",
JOptionPane.QUESTION_MESSAGE));

soma += m[l][c];
}
}

JOptionPane.showMessageDialog(
null,"A soma dos valores da matriz é " + soma,"Resultado",
JOptionPane.INFORMATION_MESSAGE);

System.exit(0);
}
}