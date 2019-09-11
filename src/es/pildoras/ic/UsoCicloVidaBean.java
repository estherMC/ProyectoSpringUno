package es.pildoras.ic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {

		//SPRING-7: Demostrar uso de ciclo de vida. Deberá llamarse antes y después del bean informeNuevo.
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");

		Empleados Juan = contexto.getBean("miDirectorEmpleado", Empleados.class);
		
		System.out.println(Juan.getInforme());
		
		contexto.close();
	}

}
