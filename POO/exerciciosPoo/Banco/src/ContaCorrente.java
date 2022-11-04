import java.util.*;
public class ContaCorrente {
  Scanner in = new Scanner(System.in);
  // Atributos da classe
  private int numeroConta;
  private String nome;
  private double saldo;

  // Método construtor
  // <tipo-de-visibilidade> <nomeDaClasse>()
  public ContaCorrente(){
    saldo = 0;
    numeroConta = 000;
    nome = null;
  }

  //Método alterarNome
  public void setNome(){
    System.out.println("Nome: ");
    nome = in.next();
    this.nome = nome;
  }

  public void setNumeroConta(){
    System.out.println("Número conta: ");
    numeroConta = in.nextInt();
    this.numeroConta = numeroConta;
  }

  public void depositar(double valor){
    System.out.println("Valor à depositar");
    System.out.println(valor);
    if (valor < 0){
      System.out.println("Não pode depositar valor menor que zero.");
    } else {
      this.saldo = this.saldo + valor;
    }
  }

  public void sacar(int sacar){
    this.saldo = this.saldo - sacar;
  }

  public void status(){
    System.out.println("\n");
    System.out.println("===STATUS===");
    System.out.println("Correntista: "+this.nome);
    System.out.println("Número conta: "+this.numeroConta);
    System.out.println("Saldo: R$"+this.saldo);
    System.out.println("\n");
  }
  
}
