package Exercícios;
import java.util.ArrayList;
import java.util.Scanner;
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com
menos de 21 anos. Total de pessoas com mais de 50 anos.
O programa termina quando idade for =-99. (WHILE)*/
public class LerIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont =0;
        double idade;
        ArrayList<Double> idades = new ArrayList<Double>();
        int cont50=0,cont21=0;
        System.out.println("\33[31mO programa vai parar quando você digitar -99\n");
        while(true){
            System.out.print("Qual é a " + (cont+1) + "º idade? ");
            idade = input.nextDouble();
            if(idade == -99){
                break;}
            if(idade < 21){
                cont21++;}
            if(idade > 50){
                cont50++;}
            idades.add(idade);
            cont ++;
        }
        System.out.println("\33[32mAs idades digitadas foram\n" +idades);
        System.out.println("\33[34mO total de pessoas que tem menos de 21 anos são: " + cont21);
        System.out.println("\33[36mO total de pessoas com mais de 50 anos são: " + cont50);
    }}
