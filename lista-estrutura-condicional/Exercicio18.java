/*Enunciado

18.Solicite para o usuário a hora de nascimento e apresente por extenso.
Exemplo: 19:03:29 deverá apresentar para o usuário “dezenove horas, três minutos e vintee nove segundos”.

*/

import javax.swing.JOptionPane;

public class Exercicio1{

    public static void main(String[] args){

        String hora = (JOptionPane.showInputDialog(null, 
            "Digite a hora de seu nascimento:\nObs: use o formato: hhmmss / sem pontos ou separacao.", 
            "Escrito por Extenso - Hora", 
            JOptionPane.INFORMATION_MESSAGE
        ));

        if(hora.length() != 6){
            JOptionPane.showMessageDialog(null, "Erro de entrada!", "Erro 001", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        String dezHExtenso = "";
        String uniHExtenso = "";
        String dezMExtenso = "";
        String uniMExtenso = "";

        char dezenaHora = hora.charAt(0);
        char unidadeHora = hora.charAt(1);
        char dezenaMinuto = hora.charAt(2);
        char unidadeMinuto = hora.charAt(3);
        char dezenaSegundo = hora.charAt(4);
        char unidadeSegundo = hora.charAt(5);
        
        //dezenaHora
            if (dezenaHora == '1'){dezHExtenso = "";}
            else if (dezenaHora == '2'){
                if(unidadeHora != '0'){
                    dezHExtenso = "Vinte e ";
                }
                else{
                    dezHExtenso = "Vinte horas ";
                }
            }
            else if (dezenaHora == '0'){dezHExtenso = "";}
            else{
                JOptionPane.showMessageDialog(null, "Erro de entrada!", "Erro 002", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        //unidadeHora
            if (unidadeHora == '1'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Cento e ";
                }
                else{
                    uniHExtenso = "e Cem";
                }
            }
            else if (unidadeHora == '2'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Duzentos e ";
                }
                else{
                    uniHExtenso = "e Duzentos";
                }
            }
            else if (unidadeHora == '3'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Trezentos e ";
                }
                else{
                    uniHExtenso = "e Trezentos";
                }
            }
            else if (unidadeHora == '4'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Quatrocentos ";                }
                else{
                    uniHExtenso = "e Quatrocentos";
                }
            }
            else if (unidadeHora == '5'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Quinhentos e ";
                }
                else{
                    uniHExtenso = "e Quinhentos";
                }
            }
            else if (unidadeHora == '6'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Seiscentos e ";
                }
                else{
                    uniHExtenso = "e Seiscentos";
                }
            }
            else if (unidadeHora == '7'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Setecentos e ";
                }
                else{
                    uniHExtenso = "e Setecentos";
                }
            }
            else if (unidadeHora == '8'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Oitocentos e ";
                }
                else{
                    uniHExtenso = "e Oitocentos";
                }
            }
            else if (unidadeHora == '9'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Novecentos e ";
                }
                else{
                    uniHExtenso = "e Novecentos";
                }
            }
            else if (unidadeHora == '0'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "e ";
                }
                else{
                    uniHExtenso = "";
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro de entrada!", "Erro 003", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        //dezenaMinuto
            if (dezenaMinuto == '1'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "";
                }
                else{
                    dezMExtenso = "e Dez";
                }
            }
            else if (dezenaMinuto == '2'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "Vinte e ";
                }
                else{
                    dezMExtenso = "Vinte";
                }
            }
            else if (dezenaMinuto == '3'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "Trinta e ";
                }
                else{
                    dezMExtenso = "Trinta";
                }
            }
            else if (dezenaMinuto == '4'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "Quarenta e ";                
                }
                else{
                    dezMExtenso = "Quarenta";
                }
            }
            else if (dezenaMinuto == '5'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "Cinquenta e ";
                }
                else{
                    dezMExtenso = "Cinquenta";
                }
            }
            else if (dezenaMinuto == '6'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "Sessenta e ";
                }
                else{
                    dezMExtenso = "Sessenta";
                }
            }
            else if (dezenaMinuto == '0'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "";
                }
                else{
                    dezMExtenso = "";
                }
            }
            else{
            JOptionPane.showMessageDialog(null, "Erro de entrada!", "Erro 004", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            }   

        //unidadeMinuto
            if (unidadeHora == '1'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Cento e ";
                }
                else{
                    uniHExtenso = "e Cem";
                }
            }
            else if (unidadeHora == '2'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Duzentos e ";
                }
                else{
                    uniHExtenso = "e Duzentos";
                }
            }
            else if (unidadeHora == '3'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Trezentos e ";
                }
                else{
                    uniHExtenso = "e Trezentos";
                }
            }
            else if (unidadeHora == '4'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Quatrocentos ";                }
                else{
                    uniHExtenso = "e Quatrocentos";
                }
            }
            else if (unidadeHora == '5'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Quinhentos e ";
                }
                else{
                    uniHExtenso = "e Quinhentos";
                }
            }
            else if (unidadeHora == '6'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Seiscentos e ";
                }
                else{
                    uniHExtenso = "e Seiscentos";
                }
            }
            else if (unidadeHora == '7'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Setecentos e ";
                }
                else{
                    uniHExtenso = "e Setecentos";
                }
            }
            else if (unidadeHora == '8'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Oitocentos e ";
                }
                else{
                    uniHExtenso = "e Oitocentos";
                }
            }
            else if (unidadeHora == '9'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "Novecentos e ";
                }
                else{
                    uniHExtenso = "e Novecentos";
                }
            }
            else if (unidadeHora == '0'){
                if(dezena != '0' || unidadeMinuto != '0') {
                    uniHExtenso = "e ";
                }
                else{
                    uniHExtenso = "";
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro de entrada!", "Erro 003", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        //dezenaSegundo
            if (dezenaMinuto == '1'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "";
                }
                else{
                    dezMExtenso = "e Dez";
                }
            }
            else if (dezenaMinuto == '2'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "Vinte e ";
                }
                else{
                    dezMExtenso = "Vinte";
                }
            }
            else if (dezenaMinuto == '3'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "Trinta e ";
                }
                else{
                    dezMExtenso = "Trinta";
                }
            }
            else if (dezenaMinuto == '4'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "Quarenta e ";                
                }
                else{
                    dezMExtenso = "Quarenta";
                }
            }
            else if (dezenaMinuto == '5'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "Cinquenta e ";
                }
                else{
                    dezMExtenso = "Cinquenta";
                }
            }
            else if (dezenaMinuto == '6'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "Sessenta e ";
                }
                else{
                    dezMExtenso = "Sessenta";
                }
            }
            else if (dezenaMinuto == '0'){
                if(unidadeMinuto != '0') {
                    dezMExtenso = "";
                }
                else{
                    dezMExtenso = "";
                }
            }
            else{
            JOptionPane.showMessageDialog(null, "Erro de entrada!", "Erro 004", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            }   

        //unidadeSegundo
            if (unidadeMinuto == '1'){
                uniMExtenso = "Um";
            }
            else if (unidadeMinuto == '2'){
                uniMExtenso = "Dois";
            }
            else if (unidadeMinuto == '3'){
                uniMExtenso = "Tres";
            }
            else if (unidadeMinuto == '4'){
                uniMExtenso = "Quatro";
            }
            else if (unidadeMinuto == '5'){
                uniMExtenso = "Cinco";
            }
            else if (unidadeMinuto == '6'){
                uniMExtenso = "Seis";
            }
            else if (unidadeMinuto == '7'){
                uniMExtenso = "Sete";
            }
            else if (unidadeMinuto == '8'){
                uniMExtenso = "Oito";
            }
            else if (unidadeMinuto == '9'){
                uniMExtenso = "Nove";
            }
            else if (unidadeMinuto == '0'){
                uniMExtenso = "";
            }
            else{
            JOptionPane.showMessageDialog(null, "Erro de entrada!", "Erro 005", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            }
        
        JOptionPane.showMessageDialog(null, 
            "Sua hora de nascimento por extenso eh:\n" + 
            dezHExtenso + uniHExtenso + dezMExtenso + uniMExtenso + dezSExtenso + uniSExtenso, 
            "Escrito por Extenso - Ano", JOptionPane.INFORMATION_MESSAGE
        );

	}

}