package es.pildoras.ic;

//SPRING-2: Creamos la clase Informe que tendrán todos los objetos tipo Empleados
public class Informe implements CreacionInformes {

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Esta es la presentación del informe";
	}

}
