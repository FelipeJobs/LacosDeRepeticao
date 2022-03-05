package Exercícios;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um número
igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE) */
public class LeiaAteSer0 {
    public static void main(String[] args) {
        double num =1,soma =0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Digite um número qualquer: ");
            num = input.nextDouble();
            soma+=num;
        }while (num !=0);
        System.out.println("\33[34mA soma de todos os números digitados é: " + soma);
    }
}
