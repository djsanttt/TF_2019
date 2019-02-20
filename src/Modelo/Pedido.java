package Modelo;

import java.util.ArrayList;

public class Pedido {
	
	private int id;
	private boolean estado; // false  En progreso true Completado
	private ArrayList<Producto> productos;
	
	public Pedido(int id, boolean estado) {
		this.id=id;
		this.estado=estado;
		this.productos= new ArrayList<>();
	}

	
	
}
