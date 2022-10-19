package POO.exerciciosPoo.Celular;
import java.util.*;

public class Celular {
  Scanner in = new Scanner(System.in);
  // Caracteristicas -> atributos
   String nome;
   String sistemaOperacional;
   int espacoArmazenamento;
   float tamanhoTela;
   boolean ligado = true;
 
  public void ligar(){
    if (ligado == false){
      ligado = true;
    }
    System.out.println(ligado);
  }
  
  public void fazerLigacao(String numero){
    System.out.format("\n%s ligou para %s porém não obteve resposta.\n",nome, numero);
  }
  
  public void desligar(){
    if (ligado == true){
      ligado = false;
    }
    System.out.println(ligado);
  }
  
  public void ligarCamera(){
    if (ligado == true){
      System.out.println("Ligar câmera? Sim - S ou Nao - N ");
      char decisao;
      decisao = in.next().charAt(0);
      
      if (decisao == 's' || decisao == 'S'){
        System.out.println("Câmera ligada");
      } else {
        System.out.println("Câmera desligada");
      }

    }
  }
  
  public void status(){
    System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\nLigado? %b", nome, tamanhoTela, espacoArmazenamento, sistemaOperacional,ligado);
  }


}
