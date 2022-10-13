package Exe22;

/*Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
de venda de cada produto, amédia de preço de custo e do preço de venda; */

import java.util.*;
public class exe22 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String nomeProduto;
    double precoCusto;
    double precoVenda;
    double totalCusto = 0;
    double totalVenda = 0;
    int i;

    
    for(i = 0; i < 10; i++){
      
      System.out.println("Digite o nome do produto: ");
      nomeProduto = in.nextLine();
      System.out.println("Preco de custo: ");
      precoCusto = in.nextDouble();
      System.out.println("Preco de Venda: ");
      precoVenda = in.nextDouble();

      totalCusto = totalCusto + precoCusto;
      totalVenda = totalVenda + precoVenda;

      if (precoCusto > precoVenda){
        System.out.println("Prejuízo");
      } else if (precoVenda > precoCusto){
        System.out.println("Lucro");
      } else if (precoCusto == precoVenda){
        System.out.println("Empate");
      }
      System.out.println(nomeProduto + ", preço de custo = " + precoCusto + ", preço de venda = " +precoVenda);

    }
    
    System.out.println("A média do preço do custo é de: "+ (totalCusto/i));
    System.out.println("A média do preço de venda é de: "+ (totalVenda/i));

  }
  
}
