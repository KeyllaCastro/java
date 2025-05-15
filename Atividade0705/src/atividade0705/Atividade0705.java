package atividade0705;
/*
 *Faça um programa em Java que utilize o laço de repetição enquanto/while para ler e 
 * imprimir 5 valores de um determinado produto. O programa deve somar os valores e, ao final, 
 * verificar: se o total for maior que 100, aplique um desconto de 10%; caso contrário, aplique 
 * um acréscimo de 2%. A entrada dos valores deve ser feita utilizando a classe Scanner ou JOptionPane
 */
import java.util.Scanner;

public class Atividade0705 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        /*Variavel produto*/
        double total = 0;
        double produto = 0;
        double desc = 0;
        int cont= 0;
        
        /* imprimir 5 valores de um determinado produto.*/
        while (cont<=5) {
                System.out.println(cont+ " ");
                System.out.println("Digite o valor do produto:");
                produto = x.nextDouble();
                System.out.println("produto" + cont + " valor:");
                total = total + produto;
                cont++; 
            }  
        System.out.println("O valor total do produto"+ total);
        if(total >100){
            desc = total+ ((total/100)*10);
            System.out.println("O valor total com desconto: "+ desc);
        }else{ 
            desc = total+ ((total/100)*2);
            System.out.println("O valor total com desconto: "+ desc);
        }
            
            
        
    }
}