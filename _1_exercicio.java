//Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
// Fazer um algoritmo que calcule e escreva:
       // a. a maior e a menor altura do grupo;
       // b. média de altura dos homens;
       // c. o número de mulheres.

import  java.util.*;
public class _1_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
         int sexo, qtMulheres=0, qtHomens=0;
         double altura, somaH = 0, mediaHomens = 0, maior =0, menor= 10;

         for(int i = 1; i <= 10; i++){
             System.out.print("Escolha o sexo: (1 = MULHER) e (2 = HOMEM): ");
             sexo = leia.nextInt();
             System.out.print("Ok! Digite sua altura: ");
             altura = leia.nextDouble();
             if (sexo == 1){
                 qtMulheres++;
             } else if (sexo == 2){
                 qtHomens++;
                 somaH += altura;
             } else {
                 System.out.println("Opção inválida!");
             }
             System.out.println("========================");

             if (altura > maior){
                 maior = altura;
             } else if(altura < menor){
                 menor = altura;
             }
         }

         mediaHomens = somaH/qtHomens;

        System.out.println("A maior altura é: " + maior);
        System.out.println("A menor altura é: " + menor);
        System.out.println("A média da altura dos homens é igua à: " + mediaHomens);
        System.out.println("O número de mulheres é: " + qtMulheres);
    }
}
