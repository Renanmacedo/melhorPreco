package br.com.melhorpreco.web.application;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class ApplicationWebConfiguration extends ResourceConfig{
	 public ApplicationWebConfiguration() {
		 packages("br.com.melhorpreco.web.controller");
	}
}
