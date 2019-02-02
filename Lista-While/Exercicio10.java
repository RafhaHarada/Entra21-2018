/*
Enunciado:

10. Solicite ao usuário um texto e contabilize a quantidade de caracteres que um texto
possui.
Exemplo:
Lorem ipsum da Silva
a = 1
b = 0
c = 0
d = 0
.....
Até o z

*/


import javax.swing.JOptionPane;

public class Exercicio10{

    public static void main(String[] args){

        String palavra = JOptionPane.showInputDialog(null, "Digite uma palavra ou frase.", "Contador de Letras do Alfabeto numa String", JOptionPane.QUESTION_MESSAGE);
        int contador = palavra.length();
        int letra = 0;
        String auxiliar = "";
        //Contador de alfabeto
            int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;
        while(contador > 0){
            auxiliar = "" + palavra.charAt(letra);
            //alfabeto comparativo
                if (auxiliar.equalsIgnoreCase("a")){
                    a = a + 1;
                }
                else if (auxiliar.equalsIgnoreCase("b")){
                    b = b + 1;
                }
                else if (auxiliar.equalsIgnoreCase("c")){
                    c = c + 1;
                }
                else if (auxiliar.equalsIgnoreCase("d")){
                    d = d + 1;
                }
                else if (auxiliar.equalsIgnoreCase("e")){
                    e = e + 1;
                }
                else if (auxiliar.equalsIgnoreCase("f")){
                    f = f + 1;
                }
                else if (auxiliar.equalsIgnoreCase("g")){
                    g = g + 1;
                }
                else if (auxiliar.equalsIgnoreCase("h")){
                    h = h + 1;
                }
                else if (auxiliar.equalsIgnoreCase("i")){
                    i = i + 1;
                }
                else if (auxiliar.equalsIgnoreCase("j")){
                    j = j + 1;
                }
                else if (auxiliar.equalsIgnoreCase("k")){
                    k = k + 1;
                }
                else if (auxiliar.equalsIgnoreCase("l")){
                    l = l + 1;
                }
                else if (auxiliar.equalsIgnoreCase("m")){
                    m = m + 1;
                }
                else if (auxiliar.equalsIgnoreCase("n")){
                    n = n + 1;
                }
                else if (auxiliar.equalsIgnoreCase("o")){
                    o = o + 1;
                }
                else if (auxiliar.equalsIgnoreCase("p")){
                    p = p + 1;
                }
                else if (auxiliar.equalsIgnoreCase("q")){
                    q = q + 1;
                }
                else if (auxiliar.equalsIgnoreCase("r")){
                    r = r + 1;
                }
                else if (auxiliar.equalsIgnoreCase("s")){
                    s = s + 1;
                }
                else if (auxiliar.equalsIgnoreCase("t")){
                    t = t + 1;
                }
                else if (auxiliar.equalsIgnoreCase("u")){
                    u = u + 1;
                }
                else if (auxiliar.equalsIgnoreCase("v")){
                    v = v + 1;
                }
                else if (auxiliar.equalsIgnoreCase("w")){
                    w = w + 1;
                }
                else if (auxiliar.equalsIgnoreCase("x")){
                    x = x + 1;
                }
                else if (auxiliar.equalsIgnoreCase("y")){
                    y = y + 1;
                }
                else if (auxiliar.equalsIgnoreCase("z")){
                    z = z + 1;
            }
            letra ++;
            contador --;
        }
        JOptionPane.showMessageDialog(null, 
            "\nVocê escreveu: " + palavra +
            "\n\nEssa String possui:" + 
            "\na = " + a + "    b = " + b + "    c = " + c + "    d = " + d +
            "\ne = " + e + "    f = " + f + "    g = " + g + "    h = " + h +
            "\ni = " + i + "    j = " + j + "    k = " + k + "    l = " + l +
            "\nm = " + m + "    n = " + n + "    o = " + o + "    p = " + p +
            "\nq = " + q + "    r = " + r + "    s = " + s + "    t = " + t +
            "\nu = " + u + "    v = " + v + "    w = " + w + "    x = " + x +
            "\ny = " + y + "    z = " + z, 
            "Contador de Letras do Alfabeto numa String", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}