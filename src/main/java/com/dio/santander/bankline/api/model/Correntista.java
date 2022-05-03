package com.dio.santander.bankline.api.model;

public class Correntista {
	private int id;
	private String cpf;
	private String nome;
	private Conta conta;
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeString() {
		return nome;
	}
	public void setNomeString(String nomeString) {
		this.nome = nomeString;
	}
	
}
