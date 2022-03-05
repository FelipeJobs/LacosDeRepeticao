package Exercícios;
import java.util.Arrays;
import java.util.Scanner;
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
public class Ler10Numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int par=0,impar=0;
        int lista[] = new int [10];
        for(int cont = 0,num; cont<10;cont++){
            System.out.print("Digite o " + (cont +1) + "º número: ");
            num = input.nextInt();
            lista[cont] = num;
            if(num% 2 == 0){
                par++;}
            else{
                impar++;}
        }
        System.out.println("\33[32mOs 10 números digitados foram:" + Arrays.toString(lista));
        System.out.println("\33[34mForam digitados " + par + " números pares.");
        System.out.println("\33[36mForam digitados " + impar + " números ímpares.");
    }}
