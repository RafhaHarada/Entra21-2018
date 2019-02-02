/*Enunciado

23.Solicitar ao usuário todas as quatro notas de cada disciplina abaixo:
    Disciplinas:
        ->Português;
        ->Matemática;
        ->Inglês;
        ->Biologia;
        ->Química;
        ->Física;
        ->Sociologia;
        ->Filosofia;
        ->Geografia;
        ->História;
        ->Educação Física.
        
    Realizar a média das notas de cada disciplina e apresentar como um boletim, após
    apresentar o boletim deve-se apresentar os seguintes tópicos abaixo:
        ->O nome e a média da matéria com maior média;
        ->O nome e a média da matéria com menor média;
        ->O nome e a nota da matéria com a maior nota;
        ->O nome e a nota da matéria com a menor nota;
        ->Apresentar a média das médias do aluno:
        
        -Caso a média das médias seja inferior a 2.0 apresenta uma mensagem que o
        aluno deve se empenhar muito mais;
        -Caso a média das médias seja inferior a 5.0 apresente uma mensagem que o
        aluno deve se empenhar um pouco mais;
        -Caso a média das médias seja inferior a 8.0 apresente uma mensagem que o
        aluno deve se empenhar porém não muito;
        -Caso a média das médias seja inferior a 10.0 apresente uma mensagem que
        o aluno tem o direito a um dia de descanso.

*/
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio23t{

    public static void main(String[] args){
    
        //->Português
            String notaTextoP = JOptionPane.showInputDialog(null, 
                "Digite as quatro notas da matéria:" + 
                "\n\nObs: utilize o formato 'nota 1;nota 2;nota 3;nota 4'" + 
                "\nSeparando os numeros por ';'", 
                "Notas da Materia: Português", 
                JOptionPane.QUESTION_MESSAGE
                );
            String auxP[] = notaTextoP.split(";");
            double nota1P = Double.parseDouble(auxP[0]);
            double nota2P = Double.parseDouble(auxP[1]);
            double nota3P = Double.parseDouble(auxP[2]);
            double nota4P = Double.parseDouble(auxP[3]);
            double mediaP = (nota1P+nota2P+nota3P+nota4P)/4;
            if (nota1P < 0 || nota1P > 10 || nota2P < 0 || nota2P > 10 || nota3P < 0 || nota3P > 10 || nota4P < 0 || nota4P > 10){
                JOptionPane.showMessageDialog(null, "Erro de entrada - Numero inserido < 0 ou > 10", "Erro 401", JOptionPane.ERROR_MESSAGE);System.exit(0);System.exit(0);
            }//Anular erros

        //->Matemática
            String notaTextoM = JOptionPane.showInputDialog(null, 
                "Digite as quatro notas da matéria:" + 
                "\n\nObs: utilize o formato 'nota 1;nota 2;nota 3;nota 4'" + 
                "\nSeparando os numeros por ';'", 
                "Notas da Materia: Matemática", 
                JOptionPane.QUESTION_MESSAGE
                );
            String auxM[] = notaTextoM.split(";");
            double nota1M = Double.parseDouble(auxM[0]);
            double nota2M = Double.parseDouble(auxM[1]);
            double nota3M = Double.parseDouble(auxM[2]);
            double nota4M = Double.parseDouble(auxM[3]);
            double mediaM = (nota1M+nota2M+nota3M+nota4M)/4;
            if (nota1M < 0 || nota1M > 10 || nota2M < 0 || nota2M > 10 || nota3M < 0 || nota3M > 10 || nota4M < 0 || nota4M > 10){
                JOptionPane.showMessageDialog(null, "Erro de entrada - Numero inserido < 0 ou > 10", "Erro 401", JOptionPane.ERROR_MESSAGE);System.exit(0);
            }//Anular erros
        //->Inglês
            String notaTextoI = JOptionPane.showInputDialog(null, 
                "Digite as quatro notas da matéria:" + 
                "\n\nObs: utilize o formato 'nota 1;nota 2;nota 3;nota 4'" + 
                "\nSeparando os numeros por ';'", 
                "Notas da Materia: Inglês", 
                JOptionPane.QUESTION_MESSAGE
                );
            String auxI[] = notaTextoI.split(";");
            double nota1I = Double.parseDouble(auxI[0]);
            double nota2I = Double.parseDouble(auxI[1]);
            double nota3I = Double.parseDouble(auxI[2]);
            double nota4I = Double.parseDouble(auxI[3]);
            double mediaI = (nota1I+nota2I+nota3I+nota4I)/4;
            if (nota1I < 0 || nota1I > 10 || nota2I < 0 || nota2I > 10 || nota3I < 0 || nota3I > 10 || nota4I < 0 || nota4I > 10){
                JOptionPane.showMessageDialog(null, "Erro de entrada - Numero inserido < 0 ou > 10", "Erro 401", JOptionPane.ERROR_MESSAGE);System.exit(0);
            }//Anular erros
        //->Biologia
            String notaTextoB = JOptionPane.showInputDialog(null, 
                "Digite as quatro notas da matéria:" + 
                "\n\nObs: utilize o formato 'nota 1;nota 2;nota 3;nota 4'" + 
                "\nSeparando os numeros por ';'", 
                "Notas da Materia: Biologia", 
                JOptionPane.QUESTION_MESSAGE
                );
            String auxB[] = notaTextoB.split(";");
            double nota1B = Double.parseDouble(auxB[0]);
            double nota2B = Double.parseDouble(auxB[1]);
            double nota3B = Double.parseDouble(auxB[2]);
            double nota4B = Double.parseDouble(auxB[3]);
            double mediaB = (nota1B+nota2B+nota3B+nota4B)/4;
            if (nota1B < 0 || nota1B > 10 || nota2B < 0 || nota2B > 10 || nota3B < 0 || nota3B > 10 || nota4B < 0 || nota4B > 10){
                JOptionPane.showMessageDialog(null, "Erro de entrada - Numero inserido < 0 ou > 10", "Erro 401", JOptionPane.ERROR_MESSAGE);System.exit(0);
            }//Anular erros
        //->Química
            String notaTextoQ = JOptionPane.showInputDialog(null, 
                "Digite as quatro notas da matéria:" + 
                "\n\nObs: utilize o formato 'nota 1;nota 2;nota 3;nota 4'" + 
                "\nSeparando os numeros por ';'", 
                "Notas da Materia: Química", 
                JOptionPane.QUESTION_MESSAGE
                );
            String auxQ[] = notaTextoQ.split(";");
            double nota1Q = Double.parseDouble(auxQ[0]);
            double nota2Q = Double.parseDouble(auxQ[1]);
            double nota3Q = Double.parseDouble(auxQ[2]);
            double nota4Q = Double.parseDouble(auxQ[3]);
            double mediaQ = (nota1Q+nota2Q+nota3Q+nota4Q)/4;
            if (nota1Q < 0 || nota1Q > 10 || nota2Q < 0 || nota2Q > 10 || nota3Q < 0 || nota3Q > 10 || nota4Q < 0 || nota4Q > 10){
                JOptionPane.showMessageDialog(null, "Erro de entrada - Numero inserido < 0 ou > 10", "Erro 401", JOptionPane.ERROR_MESSAGE);System.exit(0);
            }//Anular erros
        //->Física
            String notaTextoFS = JOptionPane.showInputDialog(null, 
                "Digite as quatro notas da matéria:" + 
                "\n\nObs: utilize o formato 'nota 1;nota 2;nota 3;nota 4'" + 
                "\nSeparando os numeros por ';'", 
                "Notas da Materia: Física", 
                JOptionPane.QUESTION_MESSAGE
                );
            String auxFS[] = notaTextoFS.split(";");
            double nota1FS = Double.parseDouble(auxFS[0]);
            double nota2FS = Double.parseDouble(auxFS[1]);
            double nota3FS = Double.parseDouble(auxFS[2]);
            double nota4FS = Double.parseDouble(auxFS[3]);
            double mediaFS = (nota1FS+nota2FS+nota3FS+nota4FS)/4;
            if (nota1FS < 0 || nota1FS > 10 || nota2FS < 0 || nota2FS > 10 || nota3FS < 0 || nota3FS > 10 || nota4FS < 0 || nota4FS > 10){
                JOptionPane.showMessageDialog(null, "Erro de entrada - Numero inserido < 0 ou > 10", "Erro 401", JOptionPane.ERROR_MESSAGE);System.exit(0);
            }//Anular erros
        //->Sociologia
            String notaTextoS = JOptionPane.showInputDialog(null, 
                "Digite as quatro notas da matéria:" + 
                "\n\nObs: utilize o formato 'nota 1;nota 2;nota 3;nota 4'" + 
                "\nSeparando os numeros por ';'", 
                "Notas da Materia: Sociologia", 
                JOptionPane.QUESTION_MESSAGE
                );
            String auxS[] = notaTextoS.split(";");
            double nota1S = Double.parseDouble(auxS[0]);
            double nota2S = Double.parseDouble(auxS[1]);
            double nota3S = Double.parseDouble(auxS[2]);
            double nota4S = Double.parseDouble(auxS[3]);
            double mediaS = (nota1S+nota2S+nota3S+nota4S)/4;
            if (nota1S < 0 || nota1S > 10 || nota2S < 0 || nota2S > 10 || nota3S < 0 || nota3S > 10 || nota4S < 0 || nota4S > 10){
                JOptionPane.showMessageDialog(null, "Erro de entrada - Numero inserido < 0 ou > 10", "Erro 401", JOptionPane.ERROR_MESSAGE);System.exit(0);
            }//Anular erros
        //->Filosofia
            String notaTextoFL = JOptionPane.showInputDialog(null, 
                "Digite as quatro notas da matéria:" + 
                "\n\nObs: utilize o formato 'nota 1;nota 2;nota 3;nota 4'" + 
                "\nSeparando os numeros por ';'", 
                "Notas da Materia: Filosofia", 
                JOptionPane.QUESTION_MESSAGE
                );
            String auxFL[] = notaTextoFL.split(";");
            double nota1FL = Double.parseDouble(auxFL[0]);
            double nota2FL = Double.parseDouble(auxFL[1]);
            double nota3FL = Double.parseDouble(auxFL[2]);
            double nota4FL = Double.parseDouble(auxFL[3]);
            double mediaFL = (nota1FL+nota2FL+nota3FL+nota4FL)/4;
            if (nota1FL < 0 || nota1FL > 10 || nota2FL < 0 || nota2FL > 10 || nota3FL < 0 || nota3FL > 10 || nota4FL < 0 || nota4FL > 10){
                JOptionPane.showMessageDialog(null, "Erro de entrada - Numero inserido < 0 ou > 10", "Erro 401", JOptionPane.ERROR_MESSAGE);System.exit(0);
            }//Anular erros
        //->Geografia
            String notaTextoG = JOptionPane.showInputDialog(null, 
                "Digite as quatro notas da matéria:" + 
                "\n\nObs: utilize o formato 'nota 1;nota 2;nota 3;nota 4'" + 
                "\nSeparando os numeros por ';'", 
                "Notas da Materia: Geografia", 
                JOptionPane.QUESTION_MESSAGE
                );
            String auxG[] = notaTextoG.split(";");
            double nota1G = Double.parseDouble(auxG[0]);
            double nota2G = Double.parseDouble(auxG[1]);
            double nota3G = Double.parseDouble(auxG[2]);
            double nota4G = Double.parseDouble(auxG[3]);
            double mediaG = (nota1G+nota2G+nota3G+nota4G)/4;
            if (nota1G < 0 || nota1G > 10 || nota2G < 0 || nota2G > 10 || nota3G < 0 || nota3G > 10 || nota4G < 0 || nota4G > 10){
                JOptionPane.showMessageDialog(null, "Erro de entrada - Numero inserido < 0 ou > 10", "Erro 401", JOptionPane.ERROR_MESSAGE);System.exit(0);
            }//Anular erros
        //->História
            String notaTextoH = JOptionPane.showInputDialog(null, 
                "Digite as quatro notas da matéria:" + 
                "\n\nObs: utilize o formato 'nota 1;nota 2;nota 3;nota 4'" + 
                "\nSeparando os numeros por ';'", 
                "Notas da Materia: História", 
                JOptionPane.QUESTION_MESSAGE
                );
            String auxH[] = notaTextoH.split(";");
            double nota1H = Double.parseDouble(auxH[0]);
            double nota2H = Double.parseDouble(auxH[1]);
            double nota3H = Double.parseDouble(auxH[2]);
            double nota4H = Double.parseDouble(auxH[3]);
            double mediaH = (nota1H+nota2H+nota3H+nota4H)/4;
            if (nota1H < 0 || nota1H > 10 || nota2H < 0 || nota2H > 10 || nota3H < 0 || nota3H > 10 || nota4H < 0 || nota4H > 10){
                JOptionPane.showMessageDialog(null, "Erro de entrada - Numero inserido < 0 ou > 10", "Erro 401", JOptionPane.ERROR_MESSAGE);System.exit(0);
            }//Anular erros
        //->Educação Física
            String notaTextoEF = JOptionPane.showInputDialog(null, 
                "Digite as quatro notas da matéria:" + 
                "\n\nObs: utilize o formato 'nota 1;nota 2;nota 3;nota 4'" + 
                "\nSeparando os numeros por ';'", 
                "Notas da Materia: Educação Física", 
                JOptionPane.QUESTION_MESSAGE
                );
            String auxEF[] = notaTextoEF.split(";");
            double nota1EF = Double.parseDouble(auxEF[0]);
            double nota2EF = Double.parseDouble(auxEF[1]);
            double nota3EF = Double.parseDouble(auxEF[2]);
            double nota4EF = Double.parseDouble(auxEF[3]);
            double mediaEF = (nota1EF+nota2EF+nota3EF+nota4EF)/4;
            if (nota1EF < 0 || nota1EF > 10 || nota2EF < 0 || nota2EF > 10 || nota3EF < 0 || nota3EF > 10 || nota4EF < 0 || nota4EF > 10){
                JOptionPane.showMessageDialog(null, "Erro de entrada - Numero inserido < 0 ou > 10", "Erro 401", JOptionPane.ERROR_MESSAGE);System.exit(0);
            }//Anular erros

        
        double []media = {mediaP,mediaM,mediaI,mediaB,mediaQ,mediaFS,mediaS,mediaFL,mediaG,mediaH,mediaEF
        };//Medias Maior/Menor e suas materias
            String materiaMediaMaior = "";
            String materiaMediaMenor = "";
            double mediaMaior = 0;
            double mediaMenor = 100;
            for(int i = 0; i < media.length; i++){
                if (media[i] > mediaMaior){
                    mediaMaior = media[i];//Maior media
                    if (i == 0){
                        materiaMediaMaior = "Português;";
                        }
                        else if (i == 1){
                            materiaMediaMaior = "Matemática;";
                        }
                        else if (i == 2){
                            materiaMediaMaior = "Inglês;";
                        }
                        else if (i == 3){
                            materiaMediaMaior = "Biologia;";
                        }
                        else if (i == 4){
                            materiaMediaMaior = "Química";
                        }
                        else if (i == 5){
                            materiaMediaMaior = "Física;";
                        }
                        else if (i == 6){
                            materiaMediaMaior = "Sociologia;";
                        }
                        else if (i == 7){
                            materiaMediaMaior = "Filosofia;";
                        }
                        else if (i == 8){
                            materiaMediaMaior = "Geografia;";
                        }
                        else if (i == 9){
                            materiaMediaMaior = "História";
                        }
                        else if (i == 0){
                        materiaMediaMaior = "Educação Física;";
                        }
                }
                if (media[i] < mediaMenor){
                    mediaMenor = media[i];//Menor media
                    if (i == 0){
                        materiaMediaMenor = "Português;";
                        }
                        else if (i == 1){
                            materiaMediaMaior = "Matemática;";
                        }
                        else if (i == 2){
                            materiaMediaMaior = "Inglês;";
                        }
                        else if (i == 3){
                            materiaMediaMaior = "Biologia;";
                        }
                        else if (i == 4){
                            materiaMediaMaior = "Química";
                        }
                        else if (i == 5){
                            materiaMediaMaior = "Física;";
                        }
                        else if (i == 6){
                            materiaMediaMaior = "Sociologia;";
                        }
                        else if (i == 7){
                            materiaMediaMaior = "Filosofia;";
                        }
                        else if (i == 8){
                            materiaMediaMaior = "Geografia;";
                        }
                        else if (i == 9){
                            materiaMediaMaior = "História";
                        }
                        else{
                        materiaMediaMaior = "Educação Física;";
                    }
                }
            }

        double []notas = {
            nota1P,nota2P,nota3P,nota4P,
            nota1M,nota2M,nota3M,nota4M,
            nota1I,nota2I,nota3I,nota4I,
            nota1B,nota2B,nota3B,nota4B,
            nota1Q,nota2Q,nota3Q,nota4Q,
            nota1FS,nota2FS,nota3FS,nota4FS,
            nota1S,nota2S,nota3S,nota4S,
            nota1FL,nota2FL,nota3FL,nota4FL,
            nota1G,nota2G,nota3G,nota4G,
            nota1H,nota2H,nota3H,nota4H,
            nota1EF,nota2EF,nota3EF,nota4EF
        };//Notas Maior/Menor e suas materias
            String materiaNotaMaior = "";
            String materiaNotaMenor = "";
            double notaMaior = 0;
            double notaMenor = 100;
            for(int i = 0; i < notas.length; i++){
                if (notas[i] > notaMaior){
                    notaMaior = notas[i];//Maior nota
                    if (i <= 3){
                        materiaNotaMaior = "Português;";
                        }
                        else if (i <= 7){
                            materiaNotaMaior = "Matemática;";
                        }
                        else if (i <= 11){
                            materiaNotaMaior = "Inglês;";
                        }
                        else if (i <= 15){
                            materiaNotaMaior = "Biologia;";
                        }
                        else if (i <= 19){
                            materiaNotaMaior = "Química";
                        }
                        else if (i <= 23){
                            materiaNotaMaior = "Física;";
                        }
                        else if (i <= 27){
                            materiaNotaMaior = "Sociologia;";
                        }
                        else if (i <= 31){
                            materiaNotaMaior = "Filosofia;";
                        }
                        else if (i <= 35){
                            materiaNotaMaior = "Geografia;";
                        }

                        else if (i <= 39){
                            materiaNotaMaior = "História";
                        }
                        else{
                        materiaNotaMaior = "Educação Física;";
                    }
                }
                if (notas[i] < notaMenor){
                    notaMenor = notas[i];//Menor nota
                    if (i <= 3){
                        materiaNotaMenor = "Português;";
                        }
                        else if (i <= 7){
                            materiaNotaMenor = "Matemática;";
                        }
                        else if (i <= 11){
                            materiaNotaMenor = "Inglês;";
                        }
                        else if (i <= 15){
                            materiaNotaMenor = "Biologia;";
                        }
                        else if (i <= 19){
                            materiaNotaMenor = "Química";
                        }
                        else if (i <= 23){
                            materiaNotaMenor = "Física;";
                        }
                        else if (i <= 27){
                            materiaNotaMenor = "Sociologia;";
                        }
                        else if (i <= 31){
                            materiaNotaMenor = "Filosofia;";
                        }
                        else if (i <= 35){
                            materiaNotaMenor = "Geografia;";
                        }
                        
                        else if (i <= 39){
                            materiaNotaMenor = "História";
                        }
                        else{
                        materiaNotaMenor = "Educação Física;";
                    }
                }
            }
        
        double mediaMedia = (mediaB + mediaEF + mediaFL + mediaFS + mediaG + mediaH + mediaI + mediaM + mediaP + mediaQ + mediaS)/11;
            String mensagem = "";
            if (mediaMedia < 2){
                mensagem = "O aluno deve se empenhar muito mais.";
            }
            else if (mediaMedia < 5){
                mensagem = "O aluno deve se empenhar um pouco mais.";
            }
            else if (mediaMedia < 8){
                mensagem = "O aluno deve se empenhar, porém não muito.";
            }
            else{
                mensagem = "O aluno tem o direito a um dia de descanso.";
        }//Media das medias e suas respectivas mensagens

        JOptionPane.showMessageDialog(null,
            "MATERIAS               1ªNOTA 2ªNOTA 3ªNOTA 4ªNOTA MÉDIA" + 
            "\nPortuguês              " + nota1P + "     " + nota2P + "     " + nota3P + "     " + nota4P + "    " + String.format("%.2f", mediaP) +
            "\nMatemática             " + nota1M + "     " + nota2M + "     " + nota3M + "     " + nota4M + "    " + String.format("%.2f", mediaM) +
            "\nInglês                 " + nota1I + "     " + nota2I + "     " + nota3I + "     " + nota4I + "    " + String.format("%.2f", mediaI) +
            "\nBiologia               " + nota1B + "     " + nota2B + "     " + nota3B + "     " + nota4B + "    " + String.format("%.2f", mediaB) +
            "\nQuímica                " + nota1Q + "     " + nota2Q + "     " + nota3Q + "     " + nota4Q + "    " + String.format("%.2f", mediaQ) +
            "\nFísica                 " + nota1FS + "     " + nota2FS + "     " + nota3FS + "     " + nota4FS + "    " + String.format("%.2f", mediaFS) +
            "\nSociologia             " + nota1S + "     " + nota2S + "     " + nota3S + "     " + nota4S + "    " + String.format("%.2f", mediaS) +
            "\nFilosofia              " + nota1FL + "     " + nota2FL + "     " + nota3FL + "     " + nota4FL + "     " + String.format("%.2f", mediaFL) +
            "\nGeografia              " + nota1G + "     " + nota2G + "     " + nota3G + "     " + nota4G + "    " + String.format("%.2f", mediaG) +
            "\nHistória               " + nota1H + "     " + nota2H + "     " + nota3H + "     " + nota4H + "    " + String.format("%.2f", mediaH) +
            "\nEducação Física        " + nota1EF + "     " + nota2EF + "     " + nota3EF + "     " + nota4EF + "     " + String.format("%.2f", mediaEF) + 
            "\n\nMédia das médias: " + String.format("%.2f", mediaMedia) +
            "\n\nMaior média em: " + materiaMediaMaior + "\nCom nota: " + String.format("%.2f", mediaMaior) +
            "\n\nMenor média em: " + materiaMediaMenor + "\nCom nota: " + String.format("%.2f", mediaMenor) +
            "\n\nMaior nota em: " + materiaNotaMaior + "\nCom nota: " + String.format("%.2f", notaMaior) +
            "\n\nMenor nota em: " + materiaNotaMenor + "\nCom nota: " + String.format("%.2f", notaMenor) +
            "\n\nStatus atual: " + mensagem,
            "Boletim Escolar",
            JOptionPane.INFORMATION_MESSAGE
        );//Boletim
    }

}