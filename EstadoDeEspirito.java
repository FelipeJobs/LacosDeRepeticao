package Exercícios;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (
1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
calcule e mostre: (WHILE)
•	o número de pessoas calmas;
•	o número de mulheres nervosas;
•	o número de homens agressivos;
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos;
•	o número de pessoas calmas com menos de 18 anos.*/
public class EstadoDeEspirito {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int idade, pesquisados = 0,sexo,estado;
        int contcalma=0, contnervosa=0, contagressiva=0,contoutros=0,cont40=0,cont18=0;
        while (pesquisados<150){
            pesquisados++;
            System.out.print("\33[34mQual o seu sexo:\n"+ "1= Feminino\n" + "2= Masculino\n" + "3= Outros\n" + "Escolha: ");
            sexo = input.nextInt();
            if(sexo <1 || sexo >3){
                System.out.println("\33[31mA opção escolhida está inválida tente novamente...\n");
                pesquisados--;
                Thread.sleep(1000);
                continue;}
            System.out.print("Qual a sua idade? ");
            idade = input.nextInt();
            System.out.print("Qual o seu sexo:\n"+ "1= Calma\n" + "2= Nervosa\n" + "3= Agressiva\n" + "Escolha: ");
            estado = input.nextInt();
            if (estado == 1){
                contcalma++;}
            if (sexo == 1 && estado==2){
                contnervosa++;}
            if (sexo == 2 && estado ==3){
                contagressiva++;}
            if (sexo == 3 && estado == 1){
                contoutros++;}
            if (idade > 40 && estado==2){
                cont40++;}
            if (idade < 18 && estado==1){
                cont18++;}
            Thread.sleep(1000);
            System.out.println();
            }
        System.out.println("\33[32mO número total de pessoas calmas é: " + contcalma);
        System.out.println("\33[33mO número de mulheres nervosas é: " + contnervosa);
        System.out.println("\33[34mO número de homens agressivos é: " + contagressiva);
        System.out.println("\33[35mO número de outros calmos é: " + contoutros);
        System.out.println("\33[36mO número de pessoas nervosas com mais de 40 anos é: " + cont40);
        System.out.println("\33[37mO número de pessoas calmas com menos de 18 anos é: " + cont18);
    }}

