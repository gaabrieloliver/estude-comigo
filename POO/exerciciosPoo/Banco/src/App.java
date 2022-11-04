public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente c1 = new ContaCorrente();

        c1.setNome();
        c1.setNumeroConta();
        c1.depositar(500);
        c1.sacar(20);

        c1.status();

    }
}
