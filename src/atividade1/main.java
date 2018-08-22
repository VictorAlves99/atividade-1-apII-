package atividade1;

//@author victor.maoliveira

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

 
public class main {

    public static void main(String[] args) throws IOException {
        String[] vetor = new String[50];
        Scanner ler= new Scanner(System.in);
        int acao;
        
        while(vetor[49] == null){
            for(int i=0; i<vetor.length; i++){
                System.out.println("O que deseja fazer agora? \n1-Adicionar um novo nome \n2-Apresentar os nomes \n3-Pesquisar um nome \n4-Remover um nome \n0-Sair");
                System.out.println("");
                acao = ler.nextInt();
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                if(acao==1){
                        while(vetor[i] == null){
                            if(vetor[i] == null){
                               System.out.println("\nDigite o nome:");
                               vetor[i] = reader.readLine();
                               System.out.println("\n");
                            } else {
                                i++;
                            } 
                        }
                }else if(acao==2){
                    System.out.println("\n");
                    for(i=0; vetor[i]!= null; i++){
                        System.out.println("->"+vetor[i]);
                    }
                    System.out.println("\n");
                }else if(acao==3){

                }else if(acao==4){

                }else if (acao==0){
                    System.out.println("Obrigado por tudo. \nVolte sempre!");
                }else{
                    System.out.println("Esta ação é invalida!\n");
                }
            }
        }
    }  
}
