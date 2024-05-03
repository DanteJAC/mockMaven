package injectMock;

//Clase principal que usa la dependencia
public class ClasePrincipal {
 private Dependencia dependencia;
	
	 public ClasePrincipal(Dependencia dependencia) {
	     this.dependencia = dependencia;
	 }
	
	 public String usarDependencia() {
	     return dependencia.obtenerMensaje();
	 }
}
