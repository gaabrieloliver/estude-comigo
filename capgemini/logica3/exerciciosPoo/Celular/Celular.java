package capgemini.logica3.exerciciosPoo.Celular;

public class Celular {
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
  
  public void fazerLigacao(){
    
  }
  
  public void desligar(){
    if (ligado == true){
      ligado = false;
    }
    System.out.println(ligado);
  }
  
  public void ligarCamera(){
    
  }
  
  public void status(){
    System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\nLigado? %b", nome, tamanhoTela, espacoArmazenamento, sistemaOperacional,ligado);
  }


}
