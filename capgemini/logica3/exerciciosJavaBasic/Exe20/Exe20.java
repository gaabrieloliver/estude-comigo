package Exe20;
/*A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. 
Até 2000 - 12% e acima de 2000 - 7%. 
O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral; */

import java.util.Scanner;

public class Exe20 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int anoFabricacao = 0;
    float valorVeiculo = 0.0f;
    float porcentagemDesconto = 0.012f;
    float valorDesconto = 0.0f;
    float valorPagar = 0.0f;
    int totalCarrosSemiNovos = 0;
    int totalCarros = 0;
    
    
    char desejaRepetir = 's';

    while (desejaRepetir == 'S' || desejaRepetir == 's'){
      
      System.out.println("Digite o ano do veículo: ");
      anoFabricacao = in.nextInt();
      System.out.println("Valor do veículo: ");
      valorVeiculo = in.nextFloat();
      
      if (anoFabricacao <= 2000){
        porcentagemDesconto = 0.12f;
        totalCarrosSemiNovos++;
      } else {
        porcentagemDesconto = 0.07f;
        totalCarros++;
      }

      valorDesconto = valorVeiculo * porcentagemDesconto;
      valorPagar = valorVeiculo - valorDesconto;

      System.out.println("Deseja fazer mais cadastros? S - SIM / N - NAO");
      desejaRepetir = in.next().charAt(0);

    }
   
    System.out.println("Total de carros com ano até 2000: "+totalCarrosSemiNovos);
    System.out.println("Total geral: "+totalCarros);
    System.out.println("Valor de desconto: "+valorDesconto);
    System.out.println("Valor a ser pago: "+valorPagar);
  }
  
}
