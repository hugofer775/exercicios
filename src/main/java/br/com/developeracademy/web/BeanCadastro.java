package br.com.developeracademy.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.developeracademy.model.Cadastro;

@ManagedBean (name = "bCadastro")
@RequestScoped

public class BeanCadastro implements Serializable {

	private static final long serialVersionUID = 1L;
	private Cadastro cadastro = new Cadastro();
	
	
	public String actionSalvar() {
		return "index";
	}
	
	public Cadastro getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	
	
}
