package br.edu.eteczl.projetojavacombanco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.edu.eteczl.projetojavacombanco.persistencia.Conexao;

public class App 
{
    public static void main( String[] args )
    {
    	Connection instanciaDeConexaoValida = Conexao.getInstance();
    	System.out.println(instanciaDeConexaoValida);
    	
    	try {
			Statement stnt = instanciaDeConexaoValida.createStatement();
			ResultSet rs = stnt.executeQuery("select * from cliente");
			
			while(rs.next()) {
				String n = rs.getString("nome");
				System.out.println(n);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	Connection segundcone = Conexao.getInstance();
    	System.out.println(segundcone);
    }
}
