
/**
 *
 * @author Alunos
 */
public class Pessoa {
    
    //Atributos significa caracteristica
    public String nome,sobrenome, cpf;
    public byte idade;
    public float peso, altura;
    public char sexo;
    
    @Override
    public String toString(){
        return "\nNome = " + nome +
                "\nSobrenome: " + sobrenome +
                "\nIdade = " +  idade +
                "\nSexo = " + sexo +
                "\nPeso = " + peso +
                "\nAltura = " + altura +
                "\nCPF = " + cpf;
                }
}
