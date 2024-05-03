package InjectMocksClassTest;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import injectMock.ClasePrincipal;
import injectMock.Dependencia;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 *@InjectMocks es una anotación de Mockito que se utiliza para crear instancias de clases y 
 *automáticamente inyectar los mocks creados con @Mock (o @Spy) en esta instancia. 
 *Es especialmente útil cuando quieres probar una clase que tiene dependencias: 
 *en lugar de crear e inyectar manualmente cada dependencia, 
 */
@ExtendWith(MockitoExtension.class)
public class ClasePrincipalTest {

    @Mock
    private Dependencia dependencia;

    @InjectMocks
    private ClasePrincipal clasePrincipal;

    @Test
    public void testUsarDependencia() {
        // Configuramos el mock para devolver un mensaje simulado
        when(dependencia.obtenerMensaje()).thenReturn("Mensaje simulado");

        // Llamamos al método que usa la dependencia y verificamos el resultado
        String resultado = clasePrincipal.usarDependencia();
        assertEquals("Mensaje simulado", resultado);
        
        /***************************************************/
        System.out.println("El resultado del método metodoEjemplo es: " + resultado);
        /***************************************************/
    }
}
