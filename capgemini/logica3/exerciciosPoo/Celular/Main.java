package capgemini.logica3.exerciciosPoo.Celular;

public class Main {
  public static void main(String[] args) {
    // Iphone 12, tela de 6.1, 256gb
    // Galaxy Note 20 Ultra, tela de 6.9", 256gb
    // Xiaomi Mi 11 Pro, tela de 6.81", 128gb
    // <tipoVariavel> nomeVariavel = valor;

    Celular iosCelular01 = new Celular();
    iosCelular01.nome = "Iphone 12";
    iosCelular01.sistemaOperacional = "iOS";
    iosCelular01.tamanhoTela = 6.1f;
    iosCelular01.espacoArmazenamento = 256;

    Celular androidCelular01 = new Celular();
    androidCelular01.nome = "Galaxy Note 20 Ultra";
    androidCelular01.sistemaOperacional = "Android";
    androidCelular01.tamanhoTela = 6.9f;
    androidCelular01.espacoArmazenamento = 256;

    androidCelular01.desligar();
    androidCelular01.ligar();
    androidCelular01.status();
    

  }

}