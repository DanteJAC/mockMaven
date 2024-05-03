package testCaptor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import captor.CaptorClass;

import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 *@Captor es una anotación de Mockito que se utiliza para crear un ArgumentCaptor de forma declarativa. 
 *Un ArgumentCaptor se usa para capturar los argumentos que se pasan a los métodos cuando se invocan, 
 *lo que es especialmente útil cuando quieres realizar aserciones adicionales sobre los valores de los argumentos en tus pruebas. 
 */

@ExtendWith(MockitoExtension.class)
public class CaptorTest {
	  @Mock
	    private CaptorClass miClase;

	    @Captor
	    private ArgumentCaptor<Integer> argumentCaptor;

	    @Test
	    public void testMetodo() {
	        // Llamada al método que queremos probar
	        miClase.metodo(10);

	        // Verificación de que el método fue llamado con el argumento correcto
	        Mockito.verify(miClase).metodo(argumentCaptor.capture());

	        // Aserción sobre el valor capturado
	        assertEquals(Integer.valueOf(10), argumentCaptor.getValue(), "El argumento capturado debería ser 10");
	        
	        /***************************************************/
	        int resultado = argumentCaptor.getValue();
	        System.out.println("El resultado del método metodoEjemplo es: " + resultado);
	        /***************************************************/
	    }
	}
