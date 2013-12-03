package evaluacion;

public class Bisiesto {
	public String esBisiesto(int anio){
		if (divisibleEntreCuatrocientosyCien(anio)){
			return "es bisiesto";
		}
		else{
			if (divisibleEntreCuatroyNoPorCien(anio)){
				return "es bisiesto";
			}
			else{
				return "no es bisiesto";
			}
		}
	}

	private boolean divisibleEntreCuatrocientosyCien(int anio) {
		return anio % 400 == 0 && anio % 100 == 0;
	}

	private boolean divisibleEntreCuatroyNoPorCien(int anio) {
		return anio % 4 == 0 && anio % 100 != 0;
	}
	
	public String mostrarAnio(int anio){
		return String.valueOf(anio);
	}
}
