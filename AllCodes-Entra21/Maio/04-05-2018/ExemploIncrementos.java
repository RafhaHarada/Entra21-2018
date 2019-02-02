public class ExemploIncrementos {
    
    public static void main(String[] args) {

        int numero = 0;

        while (numero < 5) {
            System.out.print(numero + ";");
            numero ++;
        }
        System.out.println();
        
        while (numero >= 0) {
            System.out.print(numero + ";");
            numero --;
        }
        System.out.println();
        
        numero = 2;
        while (numero <= 32) {
            System.out.print(numero + ";");
            numero *= 2;
        }
        System.out.println();
        
        while (numero > 1) {
            numero /= 4;
            System.out.print(numero + ";");
        }
        System.out.println();

        numero = 3;

        while (numero <= 100000) {
            System.out.print(numero + ";");
            numero *= numero;
        }
        System.out.println();
        

    }
}