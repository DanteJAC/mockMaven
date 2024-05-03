package testSimulator;

/*
 * when().thenReturn()
	Los objetos simulados (mocks) pueden devolver diferentes valores según los argumentos pasados a un método. 
	La cadena de métodos when(…​.).thenReturn(…​.) se utiliza para especificar un valor de retorno para una 
	llamada de método con parámetros predefinidos.
 */

//Clase de prueba para Matematica

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import Simulator.Matematica;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * MockitoExtension.class, esta extensión se encarga de inicializar los objetos simulados (mocks) anotados con @Mock 
 * antes de que se ejecuten las pruebas. Esto significa que no necesitas llamar a MockitoAnnotations.openMocks(this) 
 * manualmente en tu método setUp, ya que MockitoExtension lo hará automáticamente por ti.
 */
@ExtendWith(MockitoExtension.class)
public class MatematicaTest {

    @Mock
    private Matematica matematica;

  // Recoradar que estos son método que se ejecuta antes de cada prueba
    @BeforeEach
    public void setUp() {
        // No es necesario inicializar los mocks manualmente con MockitoExtension
    	// ya que esta inicializada en la primear etapa antes de la clase
    	
    	/*
    	 * MockitoAnnotations.openMocks(this) es una llamada de método en el framework 
    	 * de pruebas Mockito que se utiliza para inicializar campos anotados con @Mock, @Spy, @Captor, y @InjectMocks
    	 * 
    	 */
    }
 // Recordar que el metodo @Test se agrega en cada metodo de la clase
    @Test
    public void testSumar() {
    // Configuración del objeto simulado para que devuelva 100 cuando se llame al método sumar con los argumentos 0 y 0
        when(matematica.sumar(0, 0)).thenReturn(100);
     // Llamada al método sumar y almacenamiento del resultado
        int resultado = matematica.sumar(0, 0);
     // Verificación de que el resultado es el esperado
        assertEquals(100, resultado, "El resultado de la suma debería ser 100");
    }

    @Test
    public void testRestar() {
     // Configuración del objeto simulado para que devuelva 4 cuando se llame al método restar con los argumentos 0 y 0
        when(matematica.restar(0, 0)).thenReturn(4);
     // Llamada al método restar y almacenamiento del resultado
        int resultado = matematica.restar(0, 0);
     // Verificación de que el resultado es el esperado
        assertEquals(4, resultado, "El resultado de la resta debería ser 4");
    }
}