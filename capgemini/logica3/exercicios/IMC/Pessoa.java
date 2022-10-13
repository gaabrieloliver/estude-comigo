package IMC;

public class Pessoa {
  /* - Aqui dentro eu tenho que colocar quais as informações pra resolver o problema do IMC;
  - Preciso apenas destes dois atributos pois apenas estes são necessários para resolver o problema;
  - Private / Public são modificadores de acesso;
  */
  private float peso;
  private float altura;

  /* Método construtor não acontece quando ele é chamado, mas quando é instanciado;
   * Ele é executado indepedentemente;
   * As vezes não é necessário, apenas quando precisa de um valor DEFAULT, que teram que ser informados no Main. Por exemplo: Existe alguém que tenha peso 0? Então, isso eu posso aplicar no DEFAULT;
    */
  public Pessoa(float p, float a){
    this.peso = p; //O atributo peso recebe (=) o parâmetro p;
    this.altura = a; //O atributo altura recebe (=) o paramêtro a;
  }
  
  /* Os nomes dos métodos devem ser sempre no infinitivo
   * calcular, atacar, andar, correr;*/
  public float calcularIMC(){
    float imc = peso / (altura*altura);
    /*Como o meu método calcularIMC me dá um retorno do tipo float, 
    eu preciso informar aqui abaixo */
    return imc;
  }

  /*Getters and Setters são métodos de acesso */
  public void setPeso(float p) {
    this.peso = p;
  }

  public float getPeso() {
    return peso;
  }

  public void setAltura(float a) {
    this.altura = a;
  }

  public float getAltura() {
    return altura;
  }


}
