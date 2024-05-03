package testSuite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import InjectMocksClassTest.ClasePrincipalTest;
import testSimulator.MatematicaTest;
import testSpy.SpyTest;


@Suite
@SelectClasses({MatematicaTest.class, SpyTest.class, ClasePrincipalTest.class})
public class PruebasSuite {

}
/*
 * Las Test Suites en JUnit son colecciones de casos de prueba que se agrupan para ejecutarse como una sola entidad. 
 * Una suite de prueba permite organizar y ejecutar múltiples casos de prueba en secuencia o paralelamente, 
 * lo que facilita la ejecución y el análisis de pruebas en conjunto. 
 * En resumen, una suite de prueba es una clase que actúa como contenedor para casos de prueba JUnit
 * 
 * Características principales:
 * - Agrupación de Casos de Prueba
 * - Orden de Ejecución
 * - Reusabilidad
 * - Separación de Pruebas
 * 
 * Ejecutar la suite de prueba, y JUnit ejecutará todos los casos de prueba enumerados en la suite.
 * 
 * // Anotación para indicar que esta clase es una suite de pruebas
 *	@RunWith(Suite.class)
 *	Es utilizada en JUnit 4 para indicar que una clase debe ejecutarse utilizando un corredor de pruebas específico
 */