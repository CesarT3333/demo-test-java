package br.com.demo.test.java.imposto;

import br.com.demo.test.java.calculadora.Calculadora;

public class CalculadorImposto {

  private final Calculadora calculadora;
  private final EnviadorEmail enviadorEmail;

  public CalculadorImposto(Calculadora calculadora, EnviadorEmail enviadorEmail) {
    this.calculadora = calculadora;
    this.enviadorEmail = enviadorEmail;
  }

  public void executa(double valor) {
    valor = calculadora.soma(valor, 5.0);
    valor = calculadora.subtrai(valor, 2.0);
    enviadorEmail.envia(valor);
  }
}
