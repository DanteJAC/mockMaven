package testSpy;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import spy.SpyClass;
/*
 * @Spy es una anotación utilizada en el framework de pruebas Mockito que permite crear un “espía” (spy) de un objeto real.
 * Sobrescribe el comportamiento del método para la prueba y luego llama al método real y verifica el comportamiento sobrescrito
 */
@ExtendWith(MockitoExtension.class)
public class SpyTest {
    @Spy
    SpyClass ejemploClase = new SpyClass();

    @Test
    public void testMetodoEjemplo() {
        // Sobrescribe el comportamiento del método para la prueba
        doReturn("Comportamiento simulado").when(ejemploClase).metodoEjemplo();               
        // Llama al método real y verifica el comportamiento sobrescrito
        assertEquals("Comportamiento simulado", ejemploClase.metodoEjemplo());
        
        
        /***************************************************/
        String resultado = ejemploClase.metodoEjemplo();
        System.out.println("El resultado del método metodoEjemplo es: " + resultado);
        /***************************************************/

    }
}

