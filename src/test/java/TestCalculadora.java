// pacote

// biblioteca

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import com.iterasys.Main;

public class TestCalculadora {
    // atributos

    // funcoes e método

    @Test
    public void testSomar() {
        // AAA - Arrange / Act / Assert
        // CEV - Configura / Executa / Valida

        // Configura
        // Dados de Entrada
        float num1 = 10;
        float num2 = 8;
        // Dados de Saída / Resultado Esperado

        float resultadoEsperado = 18;

        // Executa
        float resultadoAtual = Main.somar(num1, num2);

        // valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @Test
    public void testSubtrair() {
        // AAA - Arrange / Act / Assert
        // CEV - Configura / Executa / Valida

        // Configura
        // Dados de Entrada
        float num1 = 25;
        float num2 = 14;
        // Dados de Saída / Resultado Esperado

        float resultadoEsperado = 11;

        // Executa
        float resultadoAtual = Main.subtrair(num1, num2);

        // valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testMultiplicar() {
        // AAA - Arrange / Act / Assert
        // CEV - Configura / Executa / Valida

        // Configura
        // Dados de Entrada
        float num1 = 15;
        float num2 = 3;
        // Dados de Saída / Resultado Esperado

        float resultadoEsperado = 45;

        // Executa
        float resultadoAtual = Main.multiplicar(num1, num2);

        // valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testDividir() {
        int num1 = 27;
        int num2 = 3;
        String resultadoEsperado = "9";

        String resultadoAtual = Main.dividirTry(num1, num2);
        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @Test
    public void testeDividirPorZero() {
        int num1 = 7;
        int num2 = 0;
        String resultadoEsperado = "Divisão por zero não é permitida.";

        String resultadoAtual = Main.dividirTry(num1, num2);
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    // _______________________________________________//

    // DDT: Data Driven Testing ----> Teste Direcionado à Dados
    // Popular: Teste com massa

    @ParameterizedTest
    @CsvSource(value = {
            "15, 25, 40.0",
            "0, 12, 12.0",
            "-5, 9, 4.0",
            "-7, -8, -15",
            "0.5, 3.7, 4.2"

    }, delimiter = ',')

    public void testSomarDDT(float num1, float num2, float resultadoEsperado) {
        // AAA - Arrange / Act / Assert
        // CEV - Configura / Executa / Valida

        // Configura
        // Os dados de entrada e o resultado esperado são lifos da massa de teste acima
        // DDT

        // Executa
        float resultadoAtual = Main.somar(num1, num2);

        // valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }
    
    @ParameterizedTest
    @CsvFileSource(resources = "csv/somar.csv", numLinesToSkip = 1, delimiter = ',')
    public void testeSomarCSV(float num1, float num2, float resultadoEsperado) {
        // AAA - Arrange / Act / Assert
        // CEV - Configura / Executa / Valida

        // Configura
        // Os dados de entrada e o resultado esperado são lifos da massa de teste acima
        // DDT

        // Executa
        float resultadoAtual = Main.somar(num1, num2);

        // valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }

}
