package prueba.git;

public class Persona {
	private String nombre;
	private int edad;
	private String apellido;
	private int telefono;
	
	/**
	 * Getters y Setters hasta *****
	 * @return
	 */
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
//*****
	
	/**
	 * Metodo ToString
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido + ", telefono=" + telefono
				+ "]";
	}

	/**
	 * Constructor
	 * @param nombre
	 * @param edad
	 * @param apellido
	 * @param telefono
	 */
	
public Persona(String nombre, String apellido, int edad, int telefono) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.apellido = apellido;
	this.telefono = telefono;
}


	 
	 

	
}
