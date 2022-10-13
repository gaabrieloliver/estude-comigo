package IMC;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    /*leitores */
    Scanner in = new Scanner(System.in);

    //Como utilizo o método Contrutor e lá eu coloquei p e a como DEFAULT, ele pede aqui os valores.
    Pessoa pessoa1 = new Pessoa(65.00f,1.65f);

    /*execução código */
    System.out.println("Digite o peso da pessoa: ");
    pessoa1.setPeso(in.nextFloat());
    System.out.println("Digite a altura da pessoa: ");
    pessoa1.getAltura();

    System.out.printf("IMC: "+pessoa1.calcularIMC());

  }
  
}
