package POO.exerciciosPoo.Personagem;

import java.util.Random;

public class Personagem {
  String nome;
  int nivel;
  int forca;

  // void -> significa que não está retornando nada.
  public void mostrarStatus() {
    System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
  }

  public int calcularDano() {
    Random gerador = new Random();
    // 1...20
    // nextInt(): 0...19
    // nextInt(): 0 => 20
    int dado20Faces = 1 + gerador.nextInt(forca);
    int dano = dado20Faces;
    return dano;
  }

  // método que não retorna nada e recebe um parâmetro alvo que é do tipo String.
  public void atacar(String alvo, String habilidade){
    int danoCausado = calcularDano();
  //"" o tamanho (.lenght) é igual 0;
  if (habilidade.length() == 0){
    System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
  } else {
    System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade,alvo, danoCausado);
  }
}
}
