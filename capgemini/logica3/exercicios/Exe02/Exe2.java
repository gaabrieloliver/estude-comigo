package estudo.me.capgemini.exercicios;

import java.util.*;
public class Exe2 {
  public static void main(String[] args) {
    /*
     * Faça um algoritmo que receba dois números e ao final mostre a soma,
     * subtração, multiplicação e a divisão
     * dos dois números lidos;
     */
    Scanner in = new Scanner(System.in);

    int A = in.nextInt();
    int B = in.nextInt();

    System.out.println("Soma: "+ (A+B));
    System.out.println("Subtração: "+ (A-B));
    System.out.println("Multiplicação: "+ (A*B));
    System.out.println("Divisão: "+ (A/B));

  }

  
}
