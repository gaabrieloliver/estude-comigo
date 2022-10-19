package POO.exerciciosPoo.Personagem;

public class App {
  public static void main(String[] args) {
    Personagem heroi = new Personagem();
    heroi.nome = "Hércules";
    heroi.forca = 16;
    heroi.nivel = 2;
    
    heroi.mostrarStatus();
    heroi.atacar("Hydra","Golpe Duplo");

  }
}
