package br.com.demo.test.java.calculadora;

public class Calculadora {

  public double soma(double valorA, double valorB) {
    return valorA + valorB;
  }

  public double subtrai(double valorA, double valorB) {
    return valorA - valorB;
  }

  public double divide(double valorA, double valorB) {

    if (valorA == 0 || valorB == 0) {
      throw new RuntimeException("Divisão não pode ser feita por zero");
    }

    return valorA / valorB;
  }

  // TODO: Implementar multiplicação
//  public double multiplica(double valorA, double valorB) {
//    return 0.0;
//  }

}
