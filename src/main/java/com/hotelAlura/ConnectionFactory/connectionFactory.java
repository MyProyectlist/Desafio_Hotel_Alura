package com.hotelAlura.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class connectionFactory {
	
	private final String URL = "jdbc:mysql://localhost/hotelAlura";
	private final String USR = "hotelAdmin";
	private final String PWD = "hotelAlura";
	private static connectionFactory instancia; 
	
	public DataSource getDatos() {
		ComboPooledDataSource baseDatos = new ComboPooledDataSource();
		baseDatos.setJdbcUrl(URL);
		baseDatos.setUser(USR);
		baseDatos.setPassword(PWD);
		baseDatos.setMaxPoolSize(10);
		return baseDatos;
	}
	
	public Connection crearConexion() {
		try {
			return this.getDatos().getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static connectionFactory getInstancia() {
		if(instancia == null) {
			instancia = new connectionFactory();
		}
		return instancia;
	}
}
