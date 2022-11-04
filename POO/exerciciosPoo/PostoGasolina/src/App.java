public class App {
    public static void main(String[] args) throws Exception {
        BombaCombustivel bomba1 = new BombaCombustivel();

        bomba1.setTipoCombustivel("Gasolina");
        bomba1. setValorPorLitro(6);

        bomba1.abastecerPorValor(30);
        
        
    }
}
