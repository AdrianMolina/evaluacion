package evaluacion;

public class Bisiesto {
	public String esBisiesto(int anio){
		if (anio % 4 == 0 && anio % 100 != 0){
			return "es divisible";
		}
		else{
			return String.valueOf(anio);
		}
	}
	
	public String mostrarAnio(int anio){
		return String.valueOf(anio);
	}
}
