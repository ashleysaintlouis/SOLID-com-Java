package br.com.alura.rh.service.validation.reajusteTributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {
    BigDecimal valor();
    LocalDate data();
}
