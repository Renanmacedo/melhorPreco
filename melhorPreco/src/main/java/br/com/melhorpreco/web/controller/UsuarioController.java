package br.com.melhorpreco.web.controller;

import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("user")
public class UsuarioController {

@GET
@QueryParam("")
public HashMap<Long, String> acesso(){
	HashMap<Long, String> acesso = new HashMap<Long, String>();  
	return acesso;
}

}
