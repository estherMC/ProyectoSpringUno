package es.pildoras.ic;

public class DirectorEmpleados implements Empleados {

	//SPRING-2: Creación campo tipo "CreacionInforme" - tiene que ser una interface
	private CreacionInformes informeNuevo;
	
	//SPRING-4: Aplicamos mismo ejemplo a DirectorEmpleado
	private String email;
	private String nombreEmpresa;
	
	//SPRING-2: Inyección de dependencias por constructor
	public DirectorEmpleados(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la Empresa";
	}

	//SPRING-2: Todos los objetos generaran informes
	@Override
	public String getInforme() {
		return "Informe creado por DirectorEmpleado" + informeNuevo.getInforme();
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
	
	//SPRING-7: Crear método init() --> puede llamarse como queramos
	public void metodoInicial() {
		System.out.println("Dentro del método init. Aquí irían las tareas a ejecutar antes de que el bean esté listo");
	}

	//SPRING-7: Crear método init() --> puede llamarse como queramos
	public void metodoFinal() {
		System.out.println("Dentro del método destroy. Aquí irían las tareas a ejecutar después de utilizar el bean");
	}

	
	//SPRING-7: Crear método destroy()
}
