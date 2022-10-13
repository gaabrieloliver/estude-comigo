package estudo.me.capgemini.exercicios;

/*Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
total percorrida pelo automóvel e o total de combustível gasto; */

import java.util.*;
public class Exe3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    float totalCombustivelGasto;
    float distanciaTotal;
    float consumoMedio;

    System.out.println("Distancia total percorrida: ");
    distanciaTotal = in.nextFloat();
    System.out.println("Total de combustível gasto: ");
    totalCombustivelGasto = in.nextFloat();

    consumoMedio = distanciaTotal / totalCombustivelGasto;

    System.out.println("Consumo médio por KM rodado: "+ consumoMedio);
  }
}