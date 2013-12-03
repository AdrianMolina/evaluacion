package evaluacion;

public class Bisiesto {
	public String esBisiesto(int anio){
		if (anio % 4 == 0){
			return "es divisible";
		}
		else{
			return String.valueOf(anio);
		}
	}
}
