package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void assercaoAgrupada() {
        Pessoa pessoa = new Pessoa("Ítalo", "Maciel");

        assertAll("Asserções de pessoa",
                () -> assertEquals("Ítalo", pessoa.getNome()),
                () -> assertEquals("Maciel", pessoa.getSobrenome()));

    }

}