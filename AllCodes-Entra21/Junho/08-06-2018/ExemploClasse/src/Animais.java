/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Animais {
    
    public String nomeCientifico, cor, apelido, reino, filo, classe, ordem, familia, genero, especie;
    public float altura, peso;
    public byte idade;
    
    @Override
    public String toString(){
        return "Especie: " + especie
                + "\nNome Cientifico " + nomeCientifico
                + "\nApelido: " + apelido
                + "\nIdade : " + idade 
                + "\nAltura: " + altura
                + "\nPeso : " + peso 
                + "\nCor : " + cor 
                + "\nReino : " + reino 
                + "\nFilo : " + filo 
                + "\nClasse: " + classe
                + "\nOrdem : " + ordem 
                + "\nFamilia: " + familia
                + "\nGenero : " + genero;
    }
}
