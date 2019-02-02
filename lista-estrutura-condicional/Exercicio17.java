/*Enunciado

17.Solicite o ano de nascimento e apresente o ano escrito por extenso.
Exemplo: 1993 devera apresentar para o usuario "Mil novecentos e noventa e tres"

*/

import javax.swing.JOptionPane;

public class Exercicio17{

    public static void main(String[] args){

        String ano = (JOptionPane.showInputDialog(null, 
            "Digite seu ano de nascimento:", 
            "Escrito por Extenso - Ano", 
            JOptionPane.INFORMATION_MESSAGE
        ));

        if(ano.length() != 4){
            JOptionPane.showMessageDialog(null, "Erro de entrada!", "Erro 001", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        String milExtenso = "";
        String cenExtenso = "";
        String dezExtenso = "";
        String uniExtenso = "";

        char milenio = ano.charAt(0);
        char centena = ano.charAt(1);
        char dezena = ano.charAt(2);
        char unidade = ano.charAt(3);
        
        //milenio
            if (milenio == '1'){milExtenso = "Mil ";}
            else if (milenio == '2'){milExtenso = "Dois mil ";}
            else if (milenio == '3'){milExtenso = "Tres mil ";}
            else if (milenio == '4'){milExtenso = "Quatro mil ";}
            else if (milenio == '5'){milExtenso = "Cinco mil ";}
            else if (milenio == '6'){milExtenso = "Seis mil ";}
            else if (milenio == '7'){milExtenso = "Sete mil ";}
            else if (milenio == '8'){milExtenso = "Oito mil ";}
            else if (milenio == '9'){milExtenso = "Nove mil ";}
            else{
                JOptionPane.showMessageDialog(null, "Erro de entrada!\nIdade nao pode ser extimada no sistema\nVoce eh deus? como esta vivo ainda?", "Erro 002", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        //centena
            if (centena == '1'){
                if(dezena != '0' || unidade != '0') {
                    cenExtenso = "Cento e ";
                }
                else{
                    cenExtenso = "e Cem";
                }
            }
            else if (centena == '2'){
                if(dezena != '0' || unidade != '0') {
                    cenExtenso = "Duzentos e ";
                }
                else{
                    cenExtenso = "e Duzentos";
                }
            }
            else if (centena == '3'){
                if(dezena != '0' || unidade != '0') {
                    cenExtenso = "Trezentos e ";
                }
                else{
                    cenExtenso = "e Trezentos";
                }
            }
            else if (centena == '4'){
                if(dezena != '0' || unidade != '0') {
                    cenExtenso = "Quatrocentos ";                }
                else{
                    cenExtenso = "e Quatrocentos";
                }
            }
            else if (centena == '5'){
                if(dezena != '0' || unidade != '0') {
                    cenExtenso = "Quinhentos e ";
                }
                else{
                    cenExtenso = "e Quinhentos";
                }
            }
            else if (centena == '6'){
                if(dezena != '0' || unidade != '0') {
                    cenExtenso = "Seiscentos e ";
                }
                else{
                    cenExtenso = "e Seiscentos";
                }
            }
            else if (centena == '7'){
                if(dezena != '0' || unidade != '0') {
                    cenExtenso = "Setecentos e ";
                }
                else{
                    cenExtenso = "e Setecentos";
                }
            }
            else if (centena == '8'){
                if(dezena != '0' || unidade != '0') {
                    cenExtenso = "Oitocentos e ";
                }
                else{
                    cenExtenso = "e Oitocentos";
                }
            }
            else if (centena == '9'){
                if(dezena != '0' || unidade != '0') {
                    cenExtenso = "Novecentos e ";
                }
                else{
                    cenExtenso = "e Novecentos";
                }
            }
            else if (centena == '0'){
                if(dezena != '0' || unidade != '0') {
                    cenExtenso = "e ";
                }
                else{
                    cenExtenso = "";
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro de entrada!", "Erro 003", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        //dezena
            if (dezena == '1'){
                if(unidade != '0') {
                    dezExtenso = "";
                }
                else{
                    dezExtenso = "e Dez";
                }
            }
            else if (dezena == '2'){
                if(unidade != '0') {
                    dezExtenso = "Vinte e ";
                }
                else{
                    dezExtenso = "Vinte";
                }
            }
            else if (dezena == '3'){
                if(unidade != '0') {
                    dezExtenso = "Trinta e ";
                }
                else{
                    dezExtenso = "Trinta";
                }
            }
            else if (dezena == '4'){
                if(unidade != '0') {
                    dezExtenso = "Quarenta e ";                
                }
                else{
                    dezExtenso = "Quarenta";
                }
            }
            else if (dezena == '5'){
                if(unidade != '0') {
                    dezExtenso = "Cinquenta e ";
                }
                else{
                    dezExtenso = "Cinquenta";
                }
            }
            else if (dezena == '6'){
                if(unidade != '0') {
                    dezExtenso = "Sessenta e ";
                }
                else{
                    dezExtenso = "Sessenta";
                }
            }
            else if (dezena == '7'){
                if(unidade != '0') {
                    dezExtenso = "Setenta e ";
                }
                else{
                    dezExtenso = "Setenta";
                }
            }
            else if (dezena == '8'){
                if(unidade != '0') {
                    dezExtenso = "Oitenta e ";
                }
                else{
                    dezExtenso = "Oitenta";
                }
            }
            else if (dezena == '9'){
                if(unidade != '0') {
                    dezExtenso = "Noventa e ";
                }
                else{
                    dezExtenso = "Noventa";
                }
            }
            else if (dezena == '0'){
                if(unidade != '0') {
                    dezExtenso = "";
                }
                else{
                    dezExtenso = "";
                }
            }
            else{
            JOptionPane.showMessageDialog(null, "Erro de entrada!", "Erro 004", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            }   

        //unidade
            if (unidade == '1'){
                if(dezena == '1'){uniExtenso = "Onze";}
                else {uniExtenso = "Um";}
            }
            else if (unidade == '2'){
                if(dezena == '1'){uniExtenso = "Doze";}
                else {uniExtenso = "Dois";}
            }
            else if (unidade == '3'){
                if(dezena == '1'){uniExtenso = "Treze";}
                else {uniExtenso = "Tres";}
            }
            else if (unidade == '4'){
                if(dezena == '1'){uniExtenso = "Quatorze (ou Catorze)";}
                else {uniExtenso = "Quatro";}
            }
            else if (unidade == '5'){
                if(dezena == '1'){uniExtenso = "Quinze";}
                else {uniExtenso = "Cinco";}
            }
            else if (unidade == '6'){
                if(dezena == '1'){uniExtenso = "Dezesseis";}
                else {uniExtenso = "Seis";}
            }
            else if (unidade == '7'){
                if(dezena == '1'){uniExtenso = "Dezessete";}
                else {uniExtenso = "Sete";}
            }
            else if (unidade == '8'){
                if(dezena == '1'){uniExtenso = "dezoito";}
                else {uniExtenso = "Oito";}
            }
            else if (unidade == '9'){
                if(dezena == '1'){uniExtenso = "dezenove";}
                else {uniExtenso = "Nove";}
            }
            else if (unidade == '0'){
                if(dezena == '1'){uniExtenso = "";}
                else {uniExtenso = "";}
            }
            else{
            JOptionPane.showMessageDialog(null, "Erro de entrada!", "Erro 005", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            }
        
        JOptionPane.showMessageDialog(null, 
            "Seu ano de nascimento por extenso eh:\n" + 
            milExtenso + cenExtenso + dezExtenso + uniExtenso, 
            "Escrito por Extenso - Ano", JOptionPane.INFORMATION_MESSAGE
        );

        int anoDuvida = Integer.parseInt(ano);

            if (anoDuvida > 2018){
                JOptionPane.showMessageDialog(null, "Voce veio do futuro?", "Uhn...nao pera", JOptionPane.QUESTION_MESSAGE);
            }
            else if(anoDuvida > 2013){
                JOptionPane.showMessageDialog(null, "Como voce sabe ler? eh um prodigio? ou veio do futuro?", "Uhn...nao pera",JOptionPane.QUESTION_MESSAGE);
            }
            else if (anoDuvida < 1900){
                JOptionPane.showMessageDialog(null, "Nossa voce tem mais de 100 anos?\nVoce eh imortal?\nDeus?\nVoltou da terras dos mortos?\nOu viajou para o futuro?", "Uhn..nao pera", JOptionPane.QUESTION_MESSAGE);
            }
            else if(anoDuvida <= 2013){
                anoDuvida = 2018 - anoDuvida;
                JOptionPane.showMessageDialog(null, "Que interessante.\nEntao voce tem/tera: " + anoDuvida + " anos.", "Idade",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro!");
            }
	}
}