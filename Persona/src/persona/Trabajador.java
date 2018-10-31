package persona;

public class Trabajador extends Persona {
	private String LugarTrabajo;
	private String NumSS;
	
	public Trabajador (String IT, String nSS, String nombre, String apellidos) {
		super(nombre, apellidos);
		LugarTrabajo = IT;
		NumSS = nSS;
	}

	public String getLugarTrabajo() {
		return LugarTrabajo;
	}

	public void setLugarTrabajo(String lugarTrabajo) {
		LugarTrabajo = lugarTrabajo;
	}

	public String getNumSS() {
		return NumSS;
	}

	public void setNumSS(String numSS) {
		NumSS = numSS;
	}
	
	
}
