package br.com.alura.rh.service.validation.reajusteTributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Tributavel implements ReajusteTributavel {
    private BigDecimal valor;
    private LocalDate data;
    private BigDecimal valorImpostoDeRenda;

    public Tributavel(BigDecimal valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }
    @Override
    public BigDecimal valor() {
        return valor;
    }
    @Override
    public LocalDate data() {
        return data;
    }
    @Override
    public BigDecimal valorImpostoDeRenda() {
        return valor.multiply(new BigDecimal("0.01"));
    }

}
