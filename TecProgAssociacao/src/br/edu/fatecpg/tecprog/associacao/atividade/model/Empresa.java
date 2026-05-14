package br.edu.fatecpg.tecprog.associacao.atividade.model;

public class Empresa {
	private String nome;
	private String ramo;
	private String horarioAtendimento;
	private Cliente[] cliente;
	private Funcionario[] funcionario;

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

	public void registrarCliente(int i, Cliente cliente) {
		this.cliente[i] = cliente;
	}

	public Cliente buscarCliente(int i) {
		return this.cliente[i];
	}

	public void registrarFuncionario(int i, Funcionario funcionario) {
		this.funcionario[i] = funcionario;
	}

	public Funcionario buscarFuncionario(int i) {
		return this.funcionario[1];
	}

	public String apresentarClientes() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(this.cliente[i] != null ? this.cliente[i].toString() : "-");
			sb.append("\n");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", ramo=" + ramo + ", horarioAtendimento=" + horarioAtendimento + "]";
	}

}
