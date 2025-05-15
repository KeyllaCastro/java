/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enquanto;

/**
 *Faça um programa em Java que utilize o laço de repetição enquanto/while para ler e 
 * imprimir 5 valores de um determinado produto. O programa deve somar os valores e, ao final, 
 * verificar: se o total for maior que 100, aplique um desconto de 10%; caso contrário, aplique 
 * um acréscimo de 2%. A entrada dos valores deve ser feita utilizando a classe Scanner ou JOptionPane
 */
public class Enquanto {
    public static void main(String[] args) {
        int cont = 0;
        while (cont <= 10) {
            if (cont % 2 == 0) {
                System.out.println(cont + " Par");
            } else {
                System.out.println(cont + " Impar");
            }
            cont++; 
        }
    }
}
