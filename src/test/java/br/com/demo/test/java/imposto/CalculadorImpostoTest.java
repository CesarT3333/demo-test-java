package br.com.demo.test.java.imposto;

import br.com.demo.test.java.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class CalculadorImpostoTest {

  @InjectMocks
  private CalculadorImposto calculadorImposto;

  @Spy
  private Calculadora calculadora;

  @Spy
  private EnviadorEmail enviadorEmail;

  @Captor
  private ArgumentCaptor<Double> somaArgumentCaptor;

  @Captor
  private ArgumentCaptor<Double> subtracaoArgumentCaptor;

  @Captor
  private ArgumentCaptor<Double> enviadorEmailArgumentCaptor;

  @BeforeEach
  void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  @DisplayName("Deve calcular o imposto")
  void deveCalcularOImposto() {
    calculadorImposto.executa(10);

    verify(calculadora, times(1))
            .soma(somaArgumentCaptor.capture(), anyDouble());

    verify(calculadora, times(1))
            .subtrai(subtracaoArgumentCaptor.capture(), anyDouble());

    verify(enviadorEmail, times(1))
            .envia(enviadorEmailArgumentCaptor.capture());

    assertEquals(10, somaArgumentCaptor.getValue());
    assertEquals(15, subtracaoArgumentCaptor.getValue());
    assertEquals(enviadorEmailArgumentCaptor.getValue(), 13.0);

  }

}