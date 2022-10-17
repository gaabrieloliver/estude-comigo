package capgemini.logica3.exerciciosPoo.Celular;

public class Celular {
  // Caracteristicas -> atributos
  private String nome;
  private String sistemaOperacional;
  private int espacoArmazenamento;
  private float tamanhoTela;
  private boolean ligado = true;
 
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
    System.out.println(nome);
    System.out.println(sistemaOperacional);
    System.out.println(espacoArmazenamento);
    System.out.println(tamanhoTela);
    System.out.println(ligado);
  }


}
