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
        int acao=9;
        
        while(acao != 0){
            for(int i=0; acao!=0; i++){
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
                            }else{
                                i++;
                            }
                        }
                }else if(acao==2){
                    System.out.println("\n");
                    for(i=0;vetor[i]!= null; i++){
                        System.out.println("->"+vetor[i]);
                    }
                    System.out.println("\n");
                }else if(acao==3){
                    System.out.println("\nDigite o nome que você deseja procurar:\n");
                    String y; 
                    BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
                    y = reader2.readLine();
                    for(i=0; i<vetor.length; i++){
                        if(vetor[i] == y){
                            System.out.println("Esse nome está no vetor " + i);
                        }
                    }
                }else if(acao==4){
                    for(i=0; vetor[i]!=null; i++){
                        System.out.println("Vetor " + i + "->" + vetor[i]);
                    }
                    int x = 0;
                    System.out.println("\nQual vetor você deseja excluir? \n*Digite apenas o número*");
                    Scanner ler2= new Scanner(System.in);
                    x = ler2.nextInt();
                    vetor[x] = null;
                    for(i=x; vetor[i]==null && vetor[i+1]!=null; i++){
                        vetor[i] = vetor[i+1];
                        vetor[i+1] = null;
                    }
                    System.out.println("\n");
                }else if (acao==0){
                    System.out.println("\nObrigado por tudo. \nVolte sempre! \n");
                    acao=0;
                }else{
                    System.out.println("\nEsta ação é invalida! \nTente outro número\n");
                }
            }
        }
    }  
}