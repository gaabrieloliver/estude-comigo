public class Elevador {
  private int andarAtual;
  private int totalAndares;
  private int capacidadeElevador;
  private int qntdPessoasNoElevador;

//Método construtor;
public Elevador (){
  this.setAndarAtual(andarAtual);
  this.setTotalAndares(totalAndares);
  this.setCapacidadeElevador(capacidadeElevador);
}

  public int getAndarAtual() {
    return andarAtual;
  }
  
  private void setAndarAtual(int andarAtual) {
    this.andarAtual = andarAtual;
  }
  
  public int getTotalAndares() {
    return totalAndares;
  }
  
  private void setTotalAndares(int totalAndares) {
    this.totalAndares = totalAndares;
  }

  public int getCapacidadeElevador() {
    return capacidadeElevador;
  }
  
  private void setCapacidadeElevador(int capacidadeElevador) {
    this.capacidadeElevador = capacidadeElevador;
  }


  public int getQntdPessoasNoElevador(){
    if (qntdPessoasNoElevador < 0){
      qntdPessoasNoElevador = 0;
    }
    return qntdPessoasNoElevador;
  }

  public void setQntdPessoasNoElevador(int qntdPessoas){
    this.qntdPessoasNoElevador = qntdPessoas;
  }
  //Método que recebe como parâmetros a capacidade do elevador e o total de andares no prédio(os elevadores sempre começam no térreo e vazio);
  public void iniciar(int capacidadeElevador, int totalAndares, int andarAtual){
    this.capacidadeElevador = capacidadeElevador;
    this.totalAndares = totalAndares;
    this.andarAtual = andarAtual;
    System.out.println("Elevador FAV iniciado");

  }

  //Método que acrescenta uma pessoa no elevador(só deve acrescentar se ainda houve espaço);
  public void entrar(int qntdPessoas){
    
    if (qntdPessoas > getCapacidadeElevador()){
      System.out.println("Não tem espaço no elevador");
    }else{
      this.qntdPessoasNoElevador += qntdPessoas;
      System.out.println("Entrou "+this.qntdPessoasNoElevador+" pessoas.");
    }
  }

  //Método que remove pessoas do elevador se houve pessoas dentro dele;
  public void sair(int qntdPessoas){
    if (this.qntdPessoasNoElevador > 0 && qntdPessoas > 0){
      this.qntdPessoasNoElevador -= qntdPessoas;
      System.out.println("Saiu "+qntdPessoas+" pessoas e ficam "+this.qntdPessoasNoElevador);
    }else {
      System.out.println("Ninguém saiu");
    }
  }

  //Método que sobe andares, não deve subir se já estiver no último andar;
  public void subir(int andar){
    
    if (andar < this.andarAtual || andar > this.totalAndares){
      System.out.println("Andar inválido");
    } else {
      this.andarAtual = andar;
      System.out.println("Elevador subiu para o "+this.andarAtual+"° andar");
    }
  }

  //Método que desce andares, não deve descer se já estiver no térreo;
  public void descer(int andar){

    if (andar > this.andarAtual || andar > this.totalAndares) {
      System.out.println("Andar inválido");
    } else {
      this.andarAtual = andar;
      System.out.println("Elevador desceu para o " + this.andarAtual + "° andar");
    }
  }

  public void status (){
    System.out.println("\n");
    System.out.println("Capacidade do elevador: "+getCapacidadeElevador());
    System.out.println("Total de andares: "+getTotalAndares());
    System.out.println("Andar atual: "+getAndarAtual());
    
    if (getAndarAtual() == 0) 
      System.out.println("Andar atual: Térreo");
    

    System.out.println("Quantidade de pessoas no elevador: " + getQntdPessoasNoElevador());
    System.out.println("\n");

  }
}