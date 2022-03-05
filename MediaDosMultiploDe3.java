package Exercícios;
import java.util.ArrayList;
import java.util.Scanner;
/* Escrever um programa que receba vários números inteiros no teclado.
E no final imprimir a média dos números múltiplos de 3.
Para sair digitar 0(zero).(DO...WHILE)*/
public class MediaDosMultiploDe3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double num =1.0, media,soma=0.0;
        double verificar =0;
        int cont3=0;
        ArrayList<Double> multiplosDe3=new ArrayList<Double>();
        while(num != 0) {
            System.out.println("Digite um número inteiro: ");
            num = input.nextDouble();
            verificar = num;
            if(num==0){
                continue;
            }
            if (num / (int) verificar != 1) {
                System.out.println("Você só pode digitar números inteiros.\n");
                continue;}
            if (num%3 ==0){
                soma+=num;
                multiplosDe3.add(num);
                cont3++;}
        }
        media = soma/cont3;
        System.out.println("\33[34mTodos os números multiplos de 3 digitados São: \n" + multiplosDe3);
        System.out.println("\33[36mA média de todos os números multiplos de 3 digitados é: " + media );
    }}

