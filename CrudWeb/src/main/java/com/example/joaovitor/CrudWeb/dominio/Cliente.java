package com.example.joaovitor.CrudWeb.dominio;

public class Cliente {
	private Integer cod_cliente;
	private String cpf, nome_cliente, endereco, data_nasc, email, telefone;

	public Cliente(Integer cod_cliente, String cpf, String nome_cliente, String endereco, String data_nasc,
			String email, String telefone) {
		super();
		this.cod_cliente = cod_cliente;
		this.cpf = cpf;
		this.nome_cliente = nome_cliente;
		this.endereco = endereco;
		this.data_nasc = data_nasc;
		this.email = email;
		this.telefone = telefone;
	}

	public Cliente(String cpf, String nome_cliente, String endereco, String data_nasc, String email, String telefone) {
		super();
		this.cpf = cpf;
		this.nome_cliente = nome_cliente;
		this.endereco = endereco;
		this.data_nasc = data_nasc;
		this.email = email;
		this.telefone = telefone;
	}

	public Cliente() {
		super();
	}

	public Integer getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(Integer cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
