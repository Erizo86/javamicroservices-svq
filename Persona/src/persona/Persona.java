package persona;

public class Persona {
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String dni;
	private int edad;
	private String sexo;
	
	public Persona (String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Persona() {}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public static void main (String [] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		persona1.setNombre("Antonio");
		persona1.setApellidos("GC");
		persona2.setNombre("Rafael Luis");
		persona2.setApellidos("GLP");
		
		System.out.println("Nombre de la persona 1 :: " + persona1.getNombre() + " " 
				+ persona1.getApellidos());
		System.out.println("Nombre de la persona 2 :: " + persona2.getNombre() + " "
				+ persona2.getApellidos());
	}
}
