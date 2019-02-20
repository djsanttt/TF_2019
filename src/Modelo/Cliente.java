package Modelo;

public class Cliente extends Persona {
	
	private String direccion;
	private String codigo_postal;
	

	public Cliente(String nombre, String apellido, int dni,String direccion, String cp) {
		super(nombre, apellido, dni);
		this.direccion=direccion;
		this.codigo_postal=cp;
		
	}
	
	public String getCodigo_postal() {
		return codigo_postal;
	}
	
	public String getDireccion() {
		return direccion;
	}
}
