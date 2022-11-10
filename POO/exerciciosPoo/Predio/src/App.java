public class App {
    public static void main(String[] args) throws Exception {
        Elevador elevadorFav = new Elevador();

        elevadorFav.iniciar(20, 7, 0);

        elevadorFav.entrar(5);
        elevadorFav.subir(6);
        elevadorFav.subir(7);
        elevadorFav.sair(3);

        elevadorFav.status();
    }
}
