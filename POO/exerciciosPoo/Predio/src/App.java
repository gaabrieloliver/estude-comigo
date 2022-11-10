public class App {
    public static void main(String[] args) throws Exception {
        Elevador elevadorFav = new Elevador();
        
        elevadorFav.iniciar(20, 7, 0);
        
        elevadorFav.status();

        elevadorFav.subir(5);

    }
}
