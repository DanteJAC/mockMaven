package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import clasesTransaccion.Moneda;

public class MonedaMockitoTest {

    @Mock
    private Moneda moneda;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        // inicialización de mocks y preparación de la prueba
    }

    @Test
    @DisplayName("Verificar código ISO de la moneda")
    void verificarCodigoISO() {
        when(moneda.getCodigoISO()).thenReturn("USD");
        String codigoISO = moneda.getCodigoISO();
        assertEquals("USD", codigoISO, "El código ISO no es correcto");
    }

}