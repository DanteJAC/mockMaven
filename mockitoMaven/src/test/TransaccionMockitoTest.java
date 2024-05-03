package test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import clasesTransaccion.Transaccion;

public class TransaccionMockitoTest {
    @Mock
    private Transaccion transaccion;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        // inicialización de mocks y preparación de la prueba
    }

    @Test
    @DisplayName("Verificar que la transacción se realiza correctamente")
    void verificarTransaccionExitosa() {
        when(transaccion.realizar()).thenReturn(true);
        assertTrue(transaccion.realizar(), "La transacción debería haberse realizado con éxito");
    }

}
