package es.pildoras.ic;

public class SecretarioEmpleado implements Empleados {

	//SPRING-3: Creamos campo para poder realizar inyección por setter
	private CreacionInformes informeNuevo;
	
	
	//SPRING-4: Creamos campo para poder realizar inyección de campos
	private String email;

	//SPRING-4: Creamos campo para poder realizar inyección de campos
	private String nombreEmpresa;
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	
	//SPRING-2: Todos los objetos generaran informes
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el Secretario " + informeNuevo.getInforme();
	}


	//SPRING-3: Creación setter para inyección de dependencias
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	

}
