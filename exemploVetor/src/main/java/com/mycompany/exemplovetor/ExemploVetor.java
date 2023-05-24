package com.mycompany.exemplovetor;

import javax.swing.JOptionPane;

public class ExemploVetor {

    public static void main(String[] args) {
        
        String[] vetorNomes = new String[5];
        
        vetorNomes[0] = "Juca";
        vetorNomes[1] = "Jose";
        
        for(int i = 0; i < vetorNomes.length; i++){
            String nome = JOptionPane.showInputDialog("Informe um nome");
            vetorNomes[i] = nome;
        }
        
        String msg = "Nome inseridos no vetor : \n";
        for(int i = 0; i < vetorNomes.length; i++){
            msg += "posição ["+i+"] => "+vetorNomes[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
