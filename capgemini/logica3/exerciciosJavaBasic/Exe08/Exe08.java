package Exe08;

import java.util.Scanner;

/*Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
disponíveis com o usuário; */

import java.util.*;
public class Exe08 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    float cotacaoDolar = 0.0f;
    float valorReal = 0.0f;
    float conversor;

    System.out.println("Digite o valor da cotação do dólar hoje: ");
    cotacaoDolar = in.nextFloat();
    System.out.println("Valor em R$ para conversão em US$: ");
    valorReal = in.nextFloat();

    conversor = valorReal/5;

    System.out.printf("\tReal R$ "+valorReal+"  ->\tDólar US$ "+conversor+"\n");
  }

}
