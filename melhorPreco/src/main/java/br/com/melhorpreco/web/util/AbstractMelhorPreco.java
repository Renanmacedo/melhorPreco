package br.com.melhorpreco.web.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public abstract class AbstractMelhorPreco {

	/**
	 * O método retorna uma arquivo de configuração com a extensão properties, definido em qualquer lugar.
	 * @return Um <code>Properties</code> com o arquivo de configuração
	 * @throws IOException se o arquivo passado não existe ou o caminho está errado.
	 */
	public Properties obterProperteis(String arquivo) throws IOException{
		Properties properteis = new Properties();
		try(FileInputStream file = new FileInputStream(arquivo)){
			properteis.load(file);
		}catch (IOException e) {
			throw e;
		}
		return properteis;
		
	}
	/**
	 * Metodo que faz com que seja uma conexão seja fechada.
	 * @param resultSet
	 * @param connection
	 * @param preparedStatement
	 */
	public abstract void close(ResultSet resultSet, Connection connection, PreparedStatement prepareStatement);
}
