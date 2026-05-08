package br.edu.fatecpg.tecprog.associacao.atividade.model;

public class Cliente {
	private String nome;
	private String email;
	private double mensalidadePaga;

	public Cliente(String nome, String email, double mensalidadePaga) {
		this.nome = nome;
		this.email = email;
		this.mensalidadePaga = mensalidadePaga;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getMensalidadePaga() {
		return mensalidadePaga;
	}

	public void setMensalidadePaga(double mensalidadePaga) {
		this.mensalidadePaga = mensalidadePaga;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", mensalidadePaga=" + mensalidadePaga + "]";
	}

}
