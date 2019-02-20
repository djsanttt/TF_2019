package Modelo;

public abstract class Persona {
	
	private String nombre;
	private String apellido;
	private int dni;
	
	
	public Persona(String nombre, String apellido, int dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
	}

	public String getApellido() {
		return apellido;
	}
	public int getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
