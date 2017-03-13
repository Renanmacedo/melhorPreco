package br.com.melhorpreco.web.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public abstract class AbstractMelhorPreco {

	/**
	 * O m�todo retorna uma arquivo de configura��o com a extens�o properties, definido em qualquer lugar.
	 * @return Um <code>Properties</code> com o arquivo de configura��o
	 * @throws IOException se o arquivo passado n�o existe ou o caminho est� errado.
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
	 * Metodo que faz com que seja uma conex�o seja fechada.
	 * @param resultSet
	 * @param connection
	 * @param preparedStatement
	 */
	public abstract void close(ResultSet resultSet, Connection connection, PreparedStatement prepareStatement);
}
