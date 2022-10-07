package br.edu.eteczl.projetojavacombanco.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static String nomedobanco = "bancoaulajava";
	private static String host = "localhost";
	private static String port = "3306";
	private static String usuario = "root";
	private static String senha = "";
	private static Connection conn;
	
	public static Connection getInstance() {
		// jdbc:mysql//localhost:3306/bancoaulajava
		
		String url = "jdbc:mysql://" + Conexao.host + ":" + Conexao.port + "/" + Conexao.nomedobanco;
		
		if (Conexao.conn != null) {
			
			return Conexao.conn;
			
		}else {
		
		try {
			Conexao.conn = DriverManager.getConnection(url, Conexao.usuario, Conexao.senha);
			return Conexao.conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	}
}
