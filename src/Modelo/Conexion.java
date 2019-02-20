package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private final String base = "Distribuidora";
	private final String user = "root";
	private final String password = "";
	private final String url = "mysql://localhost:3306/" + base;
	private Connection con = null;
	
	public Connection getConexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(this.url, this.user,this.password);
			
		} catch (SQLException e) {
			System.err.println(e);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
}
