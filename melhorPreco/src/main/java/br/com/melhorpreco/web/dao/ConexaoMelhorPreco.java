package br.com.melhorpreco.web.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import br.com.melhorpreco.web.util.AbstractMelhorPreco;

public class ConexaoMelhorPreco extends AbstractMelhorPreco{
	private Connection conexao = null;
	public Connection getConnection() throws Exception{
		try {
			Properties properties = obterProperteis("./properties/dados.properties");		
			Class.forName(properties.getProperty("prop.server.drive"));
			conexao = DriverManager.getConnection(properties.getProperty("prop.server.url")
					+properties.getProperty("prop.server.localhost")
					+properties.getProperty("prop.server.base"), 
					properties.getProperty("prop.server.user"),
					properties.getProperty("prop.server.password"));
			return conexao;
		} catch (IOException | ClassNotFoundException | SQLException e) {
			throw e;
		}
		
	}
	@Override
	public void close(ResultSet resultSet, Connection connection, PreparedStatement prepareStatement) {
		try {
			if(resultSet != null){
				resultSet.close();
			}
			if(connection != null){
				connection.close();
			}
			if(prepareStatement != null){
				prepareStatement.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
