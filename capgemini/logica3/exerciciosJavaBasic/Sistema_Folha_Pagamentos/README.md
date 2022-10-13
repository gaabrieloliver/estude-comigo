# Herança
Neste pequeno projeto, pude aprender em como podemos utlizar a Herança para deixar o nosso código mais enxuto e evitar que gere códigos repetidos nas classes.

<p><h2> Quando utilizar Herança? </h1>
Sempre que observamos uma corelação entre as classes. 
Por exemplo:</p>

- Quando identificamos o termo "tipo de"; O vendedor é um tipo de funcionario.

- Gerente, Motorista, Atendente e Vendedor, são tipos de Funcionários.

Outro exemplo é:

- Missão Impossível, Carga Explosiva, Busca Implacável, todos estes são filmes de ação.

<h2> Como fazer? </h2>
<p>Utilizando a ideia de Funcionários, devemos nos perguntar quais são as informações, de forma geral, que qualquer Funcionário tenha.
Podemos citar alguns:</p>

- nome, cpf, data de nascimento, salario; 

~~~java
public class Funcionario {
  private String nome;
  private String cpf;
  private Date dataNascimento;
  private float salario;
}
~~~
<p>Estes são atributos que se espera ter em uma Classe de Funcionario.</p>

<h2>Elaborando</h2>
<p>
Apesar de Vendedor, Motorista estarem juntos em um quadro de funcionários, são funções diferentes.
</p>
<p>
Um Vendedor não precisa ter CNH na sua funcionalidade e nem o Motorista precisaria ter um total de itens vendidos, mas, ambos são funcionários de uma respectiva empresa.
</p>

Então para que possamos utilizar todas as informações da Classe Funcionario nas Classes Motorista e Vendedor é apenas utilizar o comando **extends** após o nome da Classe.

**Estrutura de classe Vendedor**

~~~java
public class Vendedor extends Funcionario {
  private int totalItensVendidos;
  private float comissaoPorItem;
}
~~~

**Estrutura de classe Motorista**

~~~java
public class Motorista extends Funcionario {
  private String CNH;
  private float comissaoPorItem;
}
~~~

Então é como se fosse duas pecinhas de lego, uma peça chamada **Vendedor** e outra **Motorista** e juntassemos. 

Ou seja, quando pego a **Classe Vendedor** e aplico a herança através do **extends** ela basicamente vai pegar os atributos, métodos da **classe Funcionario** + os atributos e métodos da própria **classe Vendedor**, a mesma lógica se aplica a **classe Motorista**.

Então por exemplo, como faríamos para calcular o salário do **Vendedor**?

Pegamos o salario base que está na classe **Funcionario** + o **totalItensVendidos** * **comissaoPorItem**, que está na classe Vendedor.

Pense que estamos trabalhando com Herança e ela tem a sua hierarquia, neste caso Funcionario e Vendedor. 

Como Funcionario é a classe maior e Vendedor vem depois, para pegarmos um atributo da classe de cima precisamos utilizar o **super()**.
- super() = Superior, ou seja, que permite pegar da classe superior. "Olha, estou criando um Vendedor, mas quero que ele tenha tudo que um funcionário tem";

~~~java
public Vendedor(){
    super();
  }
  
  public float calcularSalario(){
    return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
  }
~~~

