package es.pildoras.ic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		/*INI - SE SUSTITUTE POR SPRING-1
		//Creación de objetos tipo Empleado
		Empleados empleado1 = new SecretarioEmpleado();
		
		//Uso de los objetos creados
		System.out.println(empleado1.getTareas());
		*/
		
		//SPRING-1: Se crea contexto Spring
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//SPRING-1: Obtenemos de Spring el bean correspondiente indicando la interface
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		//SPRING-1: Usamos el bean correspondiente
		System.out.println(Juan.getTareas());
		
		//SPRING-2: Obtenemos el informe
		System.out.println(Juan.getInforme());
		
		//SPRING-3: Usamos el bean correspondiente
//		Empleados Maria = contexto.getBean("miSecretarioEmpleado", Empleados.class);
		//SPRING-4: Cambiamos de tipo Empleados a SecretarioEmpleado
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Maria.getInforme());
		
		//SPRING-4: Demostración facilidad de creación:
		SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		//SPRING-4: Usamos el campo correspondiente
		//No se podría hacer: Maria.getEmail() o Maria.getNombreEmpresa() --> ya que Maria es tipo interface de Empleados. Lo modificamos.
		System.out.println("Email: " + Maria.getEmail());
		System.out.println("Nombre Empresa: " + Maria.getNombreEmpresa());
		System.out.println("Email Pablo: " + Pablo.getEmail());
		
		//SPRING-4: Demostración facilidad de creación:
		DirectorEmpleados Pepito = contexto.getBean("miDirectorEmpleado", DirectorEmpleados.class);	
		System.out.println("Nombre Empresa Juan: " + Pepito.getNombreEmpresa());
		
		//SPRING-1: Cerramos contexto
		contexto.close();
		
	}
	

}
