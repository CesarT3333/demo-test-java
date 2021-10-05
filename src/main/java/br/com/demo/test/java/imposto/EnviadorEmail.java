package br.com.demo.test.java.imposto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnviadorEmail {

  private static final Logger LOG = LoggerFactory.getLogger(EnviadorEmail.class);

  public void envia(double valor) {
    LOG.info("Enviando email com o valor: " + valor);
  }
}
