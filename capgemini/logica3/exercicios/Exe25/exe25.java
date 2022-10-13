package Lista_exercicios;

/*Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
maior, e uma mensagem que são diferentes; */

import java.util.Scanner;

public class exe25 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    boolean diferentes;
    int[] arrayNumeros = new int [2];
    
    for (int i = 0; i < arrayNumeros.length; i++){
      System.out.println("Digite o número "+(i+1));
      arrayNumeros[i] = in.nextInt();

    }

    diferentes = arrayNumeros[0] != arrayNumeros[1] ? true : false;

    if (diferentes == true){
      System.out.println("São diferentes");
      if (arrayNumeros[0] > arrayNumeros[1]){
        System.out.println(arrayNumeros[0]+" é maior que "+arrayNumeros[1]);
      } else {
        System.out.println(arrayNumeros[1]+" é maior que "+arrayNumeros[0]);
      }
    } else {
      System.out.println("São iguais");
    }
  }
}
