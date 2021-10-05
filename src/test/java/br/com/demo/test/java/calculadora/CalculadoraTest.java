package br.com.demo.test.java.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraTest {

  private Calculadora calculadora;

  @BeforeEach
  void setup() {
    calculadora = new Calculadora();
  }

  @Test
  @DisplayName("Deve somar valores")
  void deveSomarValores() {
    assertEquals(3, calculadora.soma(1.0, 2.0));
    assertEquals(5.2, calculadora.soma(5.2, 0.0));
    assertEquals(14, calculadora.soma(7.0, 7.0));
    assertEquals(10, calculadora.soma(3.0, 7.0));
  }

  @Test
  @DisplayName("Deve subtrair valores")
  void deveSubtrairValores() {
    assertEquals(5, calculadora.subtrai(10, 5));
    assertEquals(70, calculadora.subtrai(100, 30));
    assertEquals(50, calculadora.subtrai(51, 1));
    assertEquals(1, calculadora.subtrai(57, 56));
  }

  @Test
  @DisplayName("Deve dividir valores")
  void deveDividirValores() {
    assertEquals(2, calculadora.divide(8, 4));
    assertEquals(25, calculadora.divide(100, 4));
    assertEquals(8, calculadora.divide(40, 5));
  }

  @Test
  @DisplayName("Deve retornar erro caso valores da divisão sejam zero")
  void deveRetornarErroCasoValoresDaDivisaoSejamZero() {

    var runtimeException1 = assertThrows(RuntimeException.class,
            () -> calculadora.divide(0, 5),
            "Exceção esperada, porém não ocorreu"
    );

    assertEquals(runtimeException1.getMessage(), "Divisão não pode ser feita por zero");

    var runtimeException2 = assertThrows(RuntimeException.class,
            () -> calculadora.divide(2, 0),
            "Exceção esperada, porém não ocorreu"
    );

    assertEquals(runtimeException2.getMessage(), "Divisão não pode ser feita por zero");
  }

}