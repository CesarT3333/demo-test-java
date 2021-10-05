package br.com.demo.test.java.mokito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class MensagensTest {

  @Mock
  private Mensagens mensagens;

  @BeforeEach
  void setup() {
    MockitoAnnotations.openMocks(this);

    when(mensagens.mensagemErro()).thenReturn("Erro");
    when(mensagens.mensagemSucesso()).thenReturn("Sucesso");
  }

  @Test
  @DisplayName("Deve alterar valor de mensagens")
  void deveMocarMensagemDeErro() {
    assertEquals("Erro", mensagens.mensagemErro());
    assertEquals("Sucesso", mensagens.mensagemSucesso());
  }

}