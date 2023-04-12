package com.mycompany.desafio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Maria
 */
public class Desafio {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        List<String> listaBandas = new ArrayList<>();
        
        String nome;
        int cod;
        int indice;
        
        System.out.println("BEM BINDO(A), VAMOS FAZER UMA LISTA DE BANDAS?");
        
        do{
            System.out.println("====================================================\n");
            System.out.println("Informe o que deseja fazer conforme a tabela\n");
            System.out.println("| 1 - ADICIONAR BANDA         |");
            System.out.println("| 2 - REMOVER BANDA           |");
            System.out.println("| 3 - MOSTRAR LISTA COMPLETA  |");
            System.out.println("| 4 - ORDENAR LISTA           |");
            System.out.println("| 5 - EXCLUIR LISTA COMPLETA  |\n");
            cod = ler.nextInt();
        
            switch (cod){
                case 1:
                    System.out.println("====================================================\n");
                    System.out.println("Digite o nome da banda que deseja adicionar a lista:");
                    ler.nextLine();
                    nome = ler.nextLine();
                    listaBandas.add(nome);
                    System.out.println("Banda adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("====================================================\n");
                    System.out.println("Digite o índice da banda que deseja remover:");
                    indice = ler.nextInt();
                    if(indice >= 0 && indice < listaBandas.size()){
                        listaBandas.remove(indice);
                        System.out.println("\nBanda removida!");
                    }else{
                        System.out.println("\nÍndice inválido!");
                    }
                    break;
                case 3:
                    System.out.println("====================================================\n");
                    System.out.println("***** LISTA DAS BANDAS *****");
                    for(int i = 0; i < listaBandas.size(); i++){
                        System.out.println(listaBandas.get(i));
                    }
                    break;
                case 4:
                    System.out.println("====================================================\n");
                    listaBandas.sort(null);
                    System.out.println("***** LISTA ORDENADA DAS BANDAS *****\n" + listaBandas); 
                    
                    break;
                case 5:
                    System.out.println("====================================================\n");
                    listaBandas.clear();
                    System.out.println("Lista removida!");
                    System.out.println("\nPROGRAMA ENCERRADO!");
                    break;
                default:
                    System.out.println("====================================================\n");
                    System.out.println("Opção inválida!");
                    break;
            }        
        }while (cod != 5);    
    }
}