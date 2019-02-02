/*Enunciado

7.Solicite um número e apresente as seguintes informações:
    a.Se ele é par ou ímpar ou neutro;
    b.Se ele é negativo ou positivo;
    c.Se ele é um número maior que 10;
    d.Se ele é um número menor ou igual a 50;
    e.Se ele é um número menor que -10;
    f.Se ele é um número maior ou igual a 30;
    g.Se ele é um número diferente de 1;


*/

import javax.swing.JOptionPane;

public class Exercicio7{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
        
        String a = " ";
        String b = " ";
        String c = " ";
        String d = " ";
        String e = " ";
        String f = " ";
        String g = " ";

        if (numero % 2 == 0 && numero != 0) {
        a = "Seu numero eh par.\n";
        }
        else if (numero % 2 != 0 && numero != 0) {
        a = "Seu numero eh impar.\n";
        }
        else{
        a = "Seu numero nao eh par nem impar.\n";
        }

        if (numero > 0) {
        b = "Seu numero eh positivo.\n";
        }
        else{
        b = "Seu numero eh negativo.\n";
        }
    
        if (numero > 10){
        c = "Seu numero eh maior que 10.\n";
        }
        else{
        c = "Seu numero nao eh maior que 10.\n";
        }
    
        if (numero <= 50){
        d = "Seu numero eh menor ou igual a 50.\n";
        }
        else {
        d = "Seu numero nao eh menor ou igual a 50.\n";
        }
    
        if (numero < -10){
        e = "Seu numero eh menor que -10.\n";
        }
        else {
        e = "Seu numero nao eh menor que -10.\n";
        }
    
        if (numero >= 30){
        f = "Seu numero eh maior ou igual a 30.\n";
        }
        else {
        f = "Seu numero nao eh maior ou igual a 30.\n";
        }
    
        if (numero == 1){
        g = "Seu numero eh igual a 1.\n";
        }
        else{
        g = "Seu numero eh diferente de 1.\n";
        }

    JOptionPane.showMessageDialog(null, 
    "O numero que voce digitou foi: " + numero + 
    "\n\n" + 
    a + 
    b + 
    c + 
    d + 
    e + 
    f + 
    g);
        
        }
    
}