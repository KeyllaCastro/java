package atividade;
import java.util.Scanner;
public class Atividade {
    public static void main(String[] args) {
/* 1. Construa um algoritmo para somar dois números digitados 
        pelo usuário e multiplicar o resultado
pelo primeiro.*/
    Scanner X = new Scanner(System.in);
    System.out.println("Digite o primeiro valor: ");
    int valor1 = X.nextInt();
    System.out.println("Digite o segundo valor: ");
    int valor2 = X.nextInt();
    
    int resultado = valor1 + valor2;
    System.out.println("O valor da soma e " + resultado);
    }
}
