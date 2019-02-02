public class ExemploTernario {
    
    public static void main(String[] args) {

        String nome = "";
        int idade = 10;
        if (idade <= 12){
            nome = "Criança";
        }
        else{
            nome = "Adulto";
        }
        System.out.println(nome);

        idade= 13;

        String nome2 = idade <= 12?"Criança":"Adulto";
        System.out.println(nome2);

        idade = 12;
        System.out.println(idade <= 12?"Criança":"Adulto");

        idade = 61;
        System.out.println(
            idade <= 12?"Criança":
            idade <= 18?"Adolescente":
            idade <= 60?"Adulto":
            "Idoso");
    }
}