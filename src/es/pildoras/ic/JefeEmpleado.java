package es.pildoras.ic;

public class JefeEmpleado implements Empleados{
	
	//SPRING-2: Creación campo tipo "CreacionInforme" - tiene que ser una interface
	private CreacionInformes informeNuevo;
	
	public JefeEmpleado (CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	public String getTareas () {
		
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	}
	
	//SPRING-2: Todos los objetos generaran informes
	@Override
	public String getInforme() {
		return "Informe presentado por el jefe con los arreglos" + informeNuevo.getInforme();
	}

}
