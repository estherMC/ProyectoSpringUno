package es.pildoras.ic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//SPRING-6: Creación clase para demostrar uso Singleton vs Prototype
public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {

		//Carga XML configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

		//Petición de beans al contenedor Spring
		SecretarioEmpleado Juan = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		SecretarioEmpleado María = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println("Juan: " + Juan);

		System.out.println("María: " + María);
		
		if (María == Juan) System.out.println("Apuntan al mismo objeto");
		else System.out.println("Apuntan a diferente objeto");

	}

}
