
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Alipio Harada
 */
/* Enunciado:

 */
public class Principal {

    public static void main(String[] args) {
        
        /*Pessoa lucas = new Pessoa();
        
        lucas.nome = "Lucas";
        lucas.idade = 16;
        lucas.peso = 94.0f;
        lucas.altura = 1.94f;
        lucas.sexo = 'm';
        lucas.cpf = "123.456.789-12";
        lucas.sobrenome = "Rodrigo";
        
        Pessoa carlos = new Pessoa();
        
        carlos.nome = "Carlos";
        carlos.idade = 18;
        carlos.peso = 78;
        carlos.altura = 1.78f;
        carlos.sexo = 'm';
        carlos.cpf = "987.456.321-12";
        carlos.sobrenome = "Augusto";
        
        JOptionPane.showMessageDialog(null, lucas);
        
        JOptionPane.showMessageDialog(null, carlos);*/
                
                
        Animais macaco1 = new Animais();
        Animais macaco2 = new Animais();
        Animais macaco3 = new Animais();
        Animais macaco4 = new Animais();
        Animais macaco5 = new Animais();
        
        macaco1.especie = "S. apella";
        macaco1.nomeCientifico = macaco1.especie;
        macaco1.apelido = "Macaco Prego";
        macaco1.idade = 10;
        macaco1.altura = 1.36f;
        macaco1.peso = 56.62f;
        macaco1.cor = "Preto";
        macaco1.reino = "Animalia";
        macaco1.filo = "Chordata";
        macaco1.classe = "Mammalia";
        macaco1.ordem = "Primates";
        macaco1.familia = "Cebidae";
        macaco1.genero = "Sapajus";
        
        macaco2.especie = "Eulemur sanfordi";
        macaco2.nomeCientifico = macaco2.especie;
        macaco2.apelido = "Lêmure";
        macaco2.idade = 8;
        macaco2.altura = 1.1f;
        macaco2.peso = 42.1f;
        macaco2.cor = "Listrado(preto e branco)";
        macaco2.reino = "Animalia";
        macaco2.filo = "Chordata";
        macaco2.classe = "Mammalia";
        macaco2.ordem = "Primates";
        macaco2.familia = "Lemuridae";
        macaco2.genero = "Eulemur";

        macaco3.especie = "P. troglodytes";
        macaco3.nomeCientifico = macaco3.especie;
        macaco3.apelido = "Chimpanzé";
        macaco3.idade = 13;
        macaco3.altura = 1.58f;
        macaco3.peso = 65.64f;
        macaco3.cor = "Marrom";
        macaco3.reino = "Animalia";
        macaco3.filo = "Chordata";
        macaco3.classe = "Mammalia";
        macaco3.ordem = "Primates";
        macaco3.familia = "Hominidae";
        macaco3.genero = "Pan";
        
        macaco4.especie = JOptionPane.showInputDialog(null, "Insira a especie");
        macaco4.nomeCientifico = JOptionPane.showInputDialog(null, "Insira o nome cientifico");
        macaco4.apelido = JOptionPane.showInputDialog(null, "Insira o apelido");
        macaco4.idade = Byte.parseByte(JOptionPane.showInputDialog(null, "Insira a idade"));
        macaco4.altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a altura"));
        macaco4.peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o peso"));
        macaco4.cor = JOptionPane.showInputDialog(null, "Insira a cor");
        macaco4.reino = JOptionPane.showInputDialog(null, "Insira o reino");
        macaco4.filo = JOptionPane.showInputDialog(null, "Insira o filo");
        macaco4.classe = JOptionPane.showInputDialog(null, "Insira a classe");
        macaco4.ordem = JOptionPane.showInputDialog(null, "Insira a ordem");
        macaco4.familia = JOptionPane.showInputDialog(null, "Insira a familia");
        macaco4.genero = JOptionPane.showInputDialog(null, "Insira o genero");
        
        macaco5.especie = JOptionPane.showInputDialog(null, "Insira a especie");
        macaco5.nomeCientifico = JOptionPane.showInputDialog(null, "Insira o nome cientifico");
        macaco5.apelido = JOptionPane.showInputDialog(null, "Insira o apelido");
        macaco5.idade = Byte.parseByte(JOptionPane.showInputDialog(null, "Insira a idade"));
        macaco5.altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a altura"));
        macaco5.peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o peso"));
        macaco5.cor = JOptionPane.showInputDialog(null, "Insira a cor");
        macaco5.reino = JOptionPane.showInputDialog(null, "Insira o reino");
        macaco5.filo = JOptionPane.showInputDialog(null, "Insira o filo");
        macaco5.classe = JOptionPane.showInputDialog(null, "Insira a classe");
        macaco5.ordem = JOptionPane.showInputDialog(null, "Insira a ordem");
        macaco5.familia = JOptionPane.showInputDialog(null, "Insira a familia");
        macaco5.genero = JOptionPane.showInputDialog(null, "Insira o genero");
        
        JOptionPane.showMessageDialog(null, macaco1);
        JOptionPane.showMessageDialog(null, macaco2);
        JOptionPane.showMessageDialog(null, macaco3);
        JOptionPane.showMessageDialog(null, macaco4);
        JOptionPane.showMessageDialog(null, macaco5);

    }

}
