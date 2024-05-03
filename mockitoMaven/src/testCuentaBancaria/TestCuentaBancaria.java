package testCuentaBancaria;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import cuentaBancaria.CuentaBancaria;

/*
¿Qué es?:
Es una metodología de programación en la que se escriben primero las pruebas, normalmente unitarias, 
y después se escribe el código fuente de tal manera que supere dichos tests. 
Una vez llegados a este punto, se refactoriza el código escrito. 	
Al hacerlo así, se consigue mejorar la calidad del software final y, además, se reducen los costes de mantenimiento.

*/
public class TestCuentaBancaria {

	@Test
	public void saldoinIcialDeberiaSerCero() {
		CuentaBancaria cuenta = new CuentaBancaria();
		assertEquals(0, cuenta.getSaldo());
		
        /***************************************************/
        int resultado = cuenta.getSaldo();
        System.out.println("El resultado del método metodoEjemplo es: " + resultado);
        /***************************************************/
	}
	
	@Test
	public void depositarDeberiaAumentarElSaldo() {
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.depositar(100);
		assertEquals(100, cuenta.getSaldo());
		
        /***************************************************/
        int resultado = cuenta.getSaldo();
        System.out.println("El resultado del método metodoEjemplo es: " + resultado);
        /***************************************************/
	}
	
	@Test
	public void retirarDeberiaReducirElSaldo() {
		CuentaBancaria cuenta = new CuentaBancaria(200);
		cuenta.retirar(50);
		assertEquals(150, cuenta.getSaldo());
		
        /***************************************************/
        int resultado = cuenta.getSaldo();
        System.out.println("El resultado del método metodoEjemplo es: " + resultado);
        /***************************************************/
	}
	
}
