import java.util.*;
public class BombaCombustivel {
  Scanner in = new Scanner(System.in);

  private String tipoCombustivel;
  private double valorPorLitro;
  private double qntdCombustivel;
  
  //Método construtor
  public BombaCombustivel(){
    valorPorLitro = 4.86;
    qntdCombustivel = 0;
    
  }

  //Altera o tipo do combustível;
  public void setTipoCombustivel(String tipoCombustivel) {
    this.tipoCombustivel = tipoCombustivel;
  }

  //Altera o valor do litro do combustível;
  public void setValorPorLitro(double valorPorLitro) {
    this.valorPorLitro = valorPorLitro;
  }

  //Altera a quantidade de combustível restante na bomba
  public void setQntdCombustivel(double qntdCombustivel) {
    this.qntdCombustivel = qntdCombustivel;
  }
  
  //Informa o valor a ser abastecido e mostra a quantidade de litros que foi colocado no veículo;
  public void abastecerPorValor(double valor){
    System.out.println("\n");
    this.qntdCombustivel = this.qntdCombustivel + (valor / valorPorLitro);
    System.out.println("Valor a ser pago R$ "+ valor);
    System.out.printf("Litros colocado no veículo: "+this.qntdCombustivel+" litros");
  }
  
  //Informa a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente;
  public void abastecerPorLitro(double litro){
    System.out.println("\n");
    this.qntdCombustivel = this.qntdCombustivel + (litro * valorPorLitro);
    System.out.println("Litros colocado no veículo: "+ litro);
    System.out.println("Valor a ser pago: R$ "+this.qntdCombustivel);
  }
  
}
