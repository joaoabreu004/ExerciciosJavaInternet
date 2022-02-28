// Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço
//unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total
//a pagar (total a pagar = total - desconto), sabendo-se que:

//- Se quantidade <= 5 o desconto será de 2%
//- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
// - Se quantidade > 10 o desconto será de 5%

import java.util.*;
public class _2_exercicio {
    public static void main(String[] args) {
        String produto;
        double precoUnitario, total, totalPagamento =0 ;
        double doisDesconto = 2.0/100.0, tresDesconto = 3.0/100.0, cincoDesconto = 5.0/100.0;
        int qtdAdiquirida;

        Scanner leia = new Scanner(System.in);

        System.out.print("Qual o seu produto?: ");
        produto = leia.nextLine();
        System.out.print("Quantidade adquirida: ");
        qtdAdiquirida = leia.nextInt();
        System.out.print("Preço unitário: ");
        precoUnitario = leia.nextDouble();

        total = precoUnitario * qtdAdiquirida;

        if (qtdAdiquirida <= 5){
            totalPagamento = total - (doisDesconto * total);
        } else if (qtdAdiquirida > 5 && qtdAdiquirida <= 10){
            totalPagamento = total - (tresDesconto * total);
        } else if(qtdAdiquirida > 10){
            totalPagamento = total = (cincoDesconto * total);
        }

        System.out.println("Total: R$" + total);
        System.out.println("Total a pagar R$:" + totalPagamento);
    }
}
