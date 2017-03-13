package br.com.melhorpreco.web.negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;

import br.com.melhorpreco.web.dao.ConexaoMelhorPreco;

public class ProtudoDao extends ConexaoMelhorPreco {

	public boolean isUsuario(HashMap<Long, String> usuario){
		Connection conn  = null;
		PreparedStatement statement = null;
		return false;
	}
}
