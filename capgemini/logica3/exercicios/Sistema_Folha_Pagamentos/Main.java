package Sistema_Folha_Pagamentos;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    
    Vendedor v = new Vendedor();
    Motorista m = new Motorista();
    
    v.setNome("Gabriel");
    v.setSalario(100.0f);
    v.setCpf("23723424");
    v.setDataNascimento(new Date());
    v.setComissaoPorItem(10.0f);
    v.setTotalItensVendidos(10);
    
    System.out.println("O salário do vendedor é: "+ v.calcularSalario());

    m.getSalario();
    m.getNome();
  } 
    
}
