package es.pildoras.ic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//SPRING-6: Creaci�n clase para demostrar uso Singleton vs Prototype
public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {

		//Carga XML configuraci�n
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

		//Petici�n de beans al contenedor Spring
		SecretarioEmpleado Juan = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		SecretarioEmpleado Mar�a = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println("Juan: " + Juan);

		System.out.println("Mar�a: " + Mar�a);
		
		if (Mar�a == Juan) System.out.println("Apuntan al mismo objeto");
		else System.out.println("Apuntan a diferente objeto");

	}

}
