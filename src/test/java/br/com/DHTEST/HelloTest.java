package br.com.DHTEST;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    // Definindo o método como uma aplicação
    // de teste unitário JUnit
    @Test
    public void estrutura() {

        // Cenário de teste
        int numero1 = -10, numero2 = 20;

        // Execução do teste
        int resultado = numero1 + numero2;

        // Verificação do teste
        Assert.assertEquals(resultado,30);
    }

}
