package br.com.developeracademy.model;

import java.io.Serializable;

public class Cadastro implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	private String password2;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

}
