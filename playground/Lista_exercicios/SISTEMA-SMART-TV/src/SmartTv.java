public class SmartTv {
  boolean ligada = false;
  int canal = 0;
  int volume = 25;

  public void ligar(){
    System.out.println("Ligando TV");
    ligada = true;
  }

  public void desligar(){
    System.out.println("Desligando TV");
    ligada = false;
  }
  
  public void mudarCanal(int novoCanal){
    canal = novoCanal;

    if(canal == 13){
      System.out.println("Canal mudado para Globo");
    }else if (canal == 02 || canal == 2){
      System.out.println("Canal mudado para SBT");
    }else if (canal == 06 || canal == 6){
      System.out.println("Canal mudado para RedeTV");
    }
    //um método utilizado com parâmetros é muito legal, parece um input de usuário, porém, eu que
    //aplico o valor do parâmetro na Classe principal, ou seja, na classe Usuario.
  }

  public void aumentarCanal(){
    canal++;
    System.out.println("Canal aumentado: "+canal);
  }
  
  public void diminuirCanal(){
    canal--;
    System.out.println("Canal diminuido: "+canal);
  }

  public void aumentarVolume(){
    volume ++;
    System.out.println("Aumentando o volume para: "+volume);
    //volume = volume + 1;
  }
  
  public void diminuirVolume(){
    volume --;
    System.out.println("Diminuindo o volume para: "+volume);
    //volume = volume - 1;
  }
}
