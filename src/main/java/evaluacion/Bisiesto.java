package evaluacion;

public class Bisiesto {
	public String esBisiesto(int anio){
		if (divisibleEntreCuatroyNoPorCien(anio)){
			return "es divisible";
		}
		else{
			return "no es divisible";
		}
	}

	private boolean divisibleEntreCuatroyNoPorCien(int anio) {
		return anio % 4 == 0 && anio % 100 != 0;
	}
	
	public String mostrarAnio(int anio){
		return String.valueOf(anio);
	}
}
