# Métodos

## Criando uma classe Personagem
Vamos utilizar a criação de um personagem. 

O primeiro de tudo é criarmos uma classe com o nome personagem. Nela iremos colocar tudo o que o personagem tem.

~~~java
public class Personagem {
  String nome;
  int nivel;
  int forca;
}
~~~

Agora vamos criar um personagem utilizando a class Main.

~~~java
public class Main {
  public static void main(String[] args) {

    //criando objeto do tipo Personagem;
    Personagem heroi = new Personagem();
    heroi.nome = "Hércules";
    heroi.nivel = 2; 
    heroi.forca = 16;
  }
~~~
Se eu quisesse criar outro personagem utilizando POO, seria apenas criar outro objeto do tipo Personagem também, por exemplo:

~~~java
Personagem heroi2 = new Personagem();
~~~
</br>

## Mensagem de status do personagem

Vamos pensar que queremos um programa que mostre na tela os Status do Personagem.
Simplificando seria:

~~~java
// "Personagem: <nome> (lvl <nivel>) com <forca> de força."
    System.out.format("Personagem: %s (lvl %d) com %d de força.",heroi.nome,heroi.nivel, heroi.forca);
~~~
</br>

## Problemas em não usar métodos

Agora imagina que precisaríamos imprimir na tela mais outros 3 personagens e também alterar o **nome**, **nivel**, a **força**. Se fizessemos desta forma, o código iria ficar um pouco grande e iria ficar complicado de alterarmos os atributos linha por linha. Como resolver?

</br>

## Criando o método status(void)

Na classe Personagem, vamos criar um método que irá mostrar os Status do personagem, onde o objetivo deste método é mostrar na tela os seus status:

~~~java
public class Personagem {
  String nome;
  int nivel;
  int forca;
  
    public void mostrarStatus(){
    System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
  }
}
~~~

Na classe Main, podemos chamar o método **mostrarStatus()** e ele irá ser executado.

</br>

## Chamando um método

~~~java
heroi.mostrarStatus();
~~~
*Resultado: Personagem: Hércules (lvl 2) com 16 de força.*

Vamos criar agora uma nova **ação** para o nosso Herói. Vamos pensar que ele agora pode atacar. Como faríamos?
Criando um novo método **atacar()**, vejamos:

~~~java
public void atacar(){
    System.out.format("%s atacou e causou %d de dano.\n", nome, forca);
  }
~~~
*Resultado: Hércules atacou e causou 16 de dano.*


Basicamente não mudou muita coisa, criamos um método atacar(), mas que ele só iria mostrar na tela uma mensagem diferente. 

Vamos melhorá-lo. O personagem agora irá atacar algum inimigo, algum objeto e pra isso funcionar precisamos passar essas informações para o método, de quem ele está atacando, ou alguma informação a mais pra ele saber na hora de executar.

</br>

## Criando um método utilizando parâmetros

Conseguiremos fazer isso utilizando os parâmetro. Vamos criar então um parâmetro chamado alvo.

~~~java
//alvo do tipo String
public void atacar(String alvo){
    System.out.format("%s atacou e causou %d de dano.\n", nome, forca);
  }
~~~
**Está meio confuso?** 


Vamos supor que na classe Main, iremos chamar o método atacar(alvo). Quando ele fizer isso, ele vai falar em quê o Herói vai atacar. Então, quem o herói vai atacar? 

*Vamos supor que seja uma Hydra, hehe.* 

~~~java
//chamei um método atacar e passei como argumento uma String "Hydra";
heroi.atacar("Hydra");
~~~

Basicamente estamos dizendo que o nosso Herói vai atacar um alvo que se chama "Hydra".

Pra mostrar na tela, iremos fazer: 
~~~java
public void atacar(String alvo){
    System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, forca);
  }
~~~

Se você chegou até aqui, podemos ir um pouco mais além.

Imagina que o personagem além de atacar alguém, poderá utilizar habilidades. Imagina que o personagem pode dar agora um duplo pulo, ataque com duas espadas, etc.

</br>

## Criando um método com vários parâmetros

Pra isso, vamos **passar uma informação**, que seria a **habilidade** que ele utilizou e para isso utilizaremos mais uma vez os **parâmetros**. 

~~~java
public void atacar(String alvo, String habilidade){
~~~

Vamos pensar o seguinte. Se o Herói utilizar habilidade, ele irá causar x de dano se ele não usou habilidade, ele irá mostrar a mensagem de ataque normalmente. Então perceba que temos condições aqui.

~~~java
public void atacar(String alvo, String habilidade){
  //"" o tamanho (.lenght) é igual 0;
  if (habilidade.length() == 0){
    System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, forca);
  } else {
    System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade,alvo, forca);
  }
}
~~~
Se executarmos dessa forma não iria aparecer nada, pois teríamos que passar o parâmetro na classe Main, dessa forma:

~~~java
heroi.atacar("Hydra","Golpe Duplo");
~~~
*Resultado: Hércules usou 'Golpe Duplo' contra Hydra e causou 16 de dano.*

<br/>

## Criando um método com retorno

No método atacar()...

Imagine que temos uma variável chamada **danoCausado** recebendo o valor de zero. 

~~~java
public void atacar(String alvo, String habilidade){
  int danoCausado = 0;
  //"" o...
}
~~~
Agora vamos criar um método que calcula, que vai verificar o quanto de dano o personagem vai causar no inimigo.

~~~java
public int calcularDano()
~~~
Esse método não pode ser *void* porque ele precisará retornar um valor, que é uma variável inteira. 

- Por exemplo: return 5; significa que está retornando uma variável inteira.

Pensando nos jogos de RPG de mesa, que os personagens possuem uma taxa de sucesso baseado em um dado de 20 faces para atingir seus inimigos, podemos gerar **números aleatórios** que irá representar a taxa de acerto do ataque do personagem.

Conseguiremos fazer isso importando uma biblioteca chamada **Random()**;

~~~java
public int calcularDano() {
  Random gerador = new Random();
  //1...20
  // se nextInt(): 0...19
  // +1 entao nextInt(): 0 => 20
  int dado20Faces = 1 + gerador.nextInt(forca);
  int dano = dado20Faces;

  return dano;
  }
~~~
Se não entendeu, eu explico:

Quando a classe **Main** fizer a chamada do método **calcularDano()**, ele vai executar o cálculo e vai mostrar na tela o valor do **dano retornado**.

**Classe Main**
~~~java
public class Main {
  public static void main(String[] args) {
    Personagem heroi = new Personagem();
    heroi.nome = "Hércules";
    heroi.forca = 16;
    heroi.nivel = 2;
    
    heroi.mostrarStatus();
    heroi.atacar("Hydra","Golpe Duplo");

  }
}
~~~

**Classe Personagem**
~~~java
public class Personagem {
  String nome;
  int nivel;
  int forca;

  // void -> significa que não está retornando nada.
  public void mostrarStatus() {
    System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
  }

  public int calcularDano() {
    Random gerador = new Random();
    // 1...20
    // nextInt(): 0...19
    // nextInt(): 0 => 20
    int dado20Faces = 1 + gerador.nextInt(forca);
    int dano = dado20Faces;
    return dano;
  }

  // método que não retorna nada e recebe um parâmetro alvo que é do tipo String.
  public void atacar(String alvo, String habilidade){
    int danoCausado = calcularDano();
  //"" o tamanho (.lenght) é igual 0;
  if (habilidade.length() == 0){
    System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
  } else {
    System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade,alvo, danoCausado);
  }
}
}
~~~
*Retorna =>
Personagem: Hércules (lvl 2) com 16 de força.
Hércules usou 'Golpe Duplo' contra Hydra e causou 2 de dano.*

**Lembrando que o valor do dano é um valor aleatório dentro da margem de força do personagem**.

</br>

## Desafios
- 1 - Crie uma classe chamada **Celular** e crie **métodos** relacionados a essa classe. Como por exemplo: **ligar, fazer ligação, desligar**.
Também faça a utilização dos **parâmetros**.

- 2 - Adicione novos **métodos** a essa **Classe Personagem** ou crie novas Classes com ações diferentes, **métodos** diferentes.

De qualquer forma, utilize todo o conhecimento aprendido, pratique.
