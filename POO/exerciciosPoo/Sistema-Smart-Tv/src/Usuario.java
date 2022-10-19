import java.util.*;
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        System.out.println("=========Smart TV========= ");
        
        System.out.println("Canal atual? "+smartTv.canal);
        /*Eu chamo o método mudarCanal (que possui parâmetro) e aplico o valor de inteiro, que 
        * é o canal.
        */
        smartTv.mudarCanal(13);
        
        
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(02);
        
        smartTv.desligar();
    }
}
