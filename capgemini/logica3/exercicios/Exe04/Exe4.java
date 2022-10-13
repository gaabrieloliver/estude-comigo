package estudo.me.capgemini.exercicios;

import java.util.Scanner;

/*Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês; */

public class Exe4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String nome;
    float vendasEfetuadas;
    float salario;
    double aumento;

    System.out.println("Nome do vendedor: ");
    nome = in.next();
    System.out.println("Salário fixo: ");
    salario = in.nextFloat();
    System.out.println("Vendas efetuadas no mês: ");
    vendasEfetuadas = in.nextFloat();

    aumento = salario + (vendasEfetuadas * 1.15);
    System.out.println();

    System.out.println("Nome: "+nome);
    System.out.println("Salário fixo: "+salario);
    System.out.println("Vendas efetuadas neste mês: "+vendasEfetuadas);
    System.out.println("Salário final no mês com 15% sobre as vendas efetuadas: "+aumento);


  }
  
}
