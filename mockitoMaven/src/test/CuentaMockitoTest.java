package test;
/*
 * ¿Qué es el Mocking?:
	Es una técnica utilizada en las pruebas 
	unitarias para simular el comportamiento de 
	objetos reales cuando la unidad que se está probando tiene dependencias externas. 
	
	Las simulaciones, o mocks, se utilizan en lugar de los objetos reales.
	
	El objetivo de los mocks es aislar y se consentran  en el código que 
	se está probando y no en el comportamiento o estado de las dependencias externas.

 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import clasesTransaccion.Cuenta;

public class CuentaMockitoTest {

    @Mock
    private Cuenta cuenta;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        // inicialización de mocks y preparación de la prueba
    }

    @Test
    @DisplayName("Verificar saldo inicial de la cuenta")
    void verificarSaldoInicial() {
        when(cuenta.getSaldo()).thenReturn(1000.0);
        double saldo = cuenta.getSaldo();
        assertEquals(1000.0, saldo, "El saldo inicial no es correcto");
        
        /***************************************************/
        System.out.println("El resultado del método verificarSaldoInicial es: " + saldo);
        /***************************************************/
    }
}

