package cursoEmVideo.POO.aula04;

public class Aula04 {
  public static void main(String[] args) {
    /*Criando caneta */
    Caneta c1 = new Caneta("BIC", "Azul",0.4f);
    c1.status();

    Caneta c2 = new Caneta("COMPACT", "Vermelho", 0.6f);
    c2.status();
    
    /*c1.setModelo("BIC"); //método acessor pra acessar o private.
    //c1.modelo = "BIC"; //só consigo alterar diretamente quando o atributo estiver public.

    c1.setPonta(0.5f); // método acessor pra acessar o private.
    //c1.ponta = 0.5; // só consigo alterar diretamente quando o atributo estiver public.

    System.out.println("Tenho uma caneta "+ c1.getModelo() + " de ponta "+ c1.getPonta());*/

  }
}
