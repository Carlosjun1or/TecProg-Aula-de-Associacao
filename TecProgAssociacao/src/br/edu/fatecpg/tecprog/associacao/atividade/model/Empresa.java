package br.edu.fatecpg.tecprog.associacao.atividade.model;

public class Empresa {
	private String nome;
	private String ramo;
	private String horarioAtendimento;
	private Cliente cliente;
	private Funcionario funcionario;

	public Empresa(String nome, String ramo, String horarioAtendimento) {
		this.nome = nome;
		this.ramo = ramo;
		this.horarioAtendimento = horarioAtendimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public String getHorarioAtendimento() {
		return horarioAtendimento;
	}

	public void setHorarioAtendimento(String horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", ramo=" + ramo + ", horarioAtendimento=" + horarioAtendimento + "]";
	}

}
