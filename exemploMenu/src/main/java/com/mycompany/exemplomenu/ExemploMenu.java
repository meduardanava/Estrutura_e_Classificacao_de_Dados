package com.mycompany.exemplomenu;

import javax.swing.JOptionPane;

public class ExemploMenu {

    public static void main(String[] args) {
        
        int opcao = -1;
        
        while(opcao != 0){
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro Alunos\n"
                    + "2 - Cadastro Professores\n"
                    + "3 - Cadastro de Disciplinas\n"
                    + "4 - Cadastro de Turmas\n"
                    + "0 - Sair"));
        
            switch(opcao){
                case 1:
                    cadastrarAluno();
                break;
                case 2:
                    cadastrarProfessor();
                break;
                case 3:
                    cadastrarDisciplina();
                break;
                case 4:
                    cadastrarTurma();
                break;
                case 0:
                    //Sair do laço de repetição
                break;    
                default:               
                    break;
            }
        }
    }
    
    public static void cadastrarAluno(){
        JOptionPane.showMessageDialog(null, "Entrou no cadastro de alunos.");
    }
    
    public static void cadastrarProfessor(){
        JOptionPane.showMessageDialog(null, "Entrou no cadastro de professores.");
    }
     
    public static void cadastrarDisciplina(){
        JOptionPane.showMessageDialog(null, "Entrou no cadastro de disciplinas.");
    }
    
    public static void cadastrarTurma(){
        JOptionPane.showMessageDialog(null, "Entrou no cadastro de turmas.");
    }
}
