package br.com.alura.rh.service.validation.reajusteTributacao;

import java.math.BigDecimal;

public interface ReajusteTributavel extends Reajuste {
    BigDecimal valorImpostoDeRenda();
}
