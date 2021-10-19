package br.com.demo.test.java.imposto;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnviadorEmailTest {

  private EnviadorEmail enviadorEmail;

  @BeforeEach
  void setup() {
    enviadorEmail = new EnviadorEmail();
  }

  @Test
  @DisplayName("Deve logar mensagem com o valor informado")
  void deveLogarMensagemComOValorInformado() {
    var logEsperado = "Enviando email com o valor: 14.3";
    var logCaptor = LogCaptor.forClass(EnviadorEmail.class);

    enviadorEmail.envia(14.3);

    assertEquals(logCaptor.getInfoLogs().get(0), logEsperado);
  }
}