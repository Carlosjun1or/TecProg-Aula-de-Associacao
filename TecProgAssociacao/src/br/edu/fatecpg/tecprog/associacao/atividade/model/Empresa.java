package br.edu.fatecpg.tecprog.associacao.atividade.model;

public class Empresa {
	private String nome;
	private String ramo;
	private String horarioAtendimento;
	private Cliente[] clientes;
	private Funcionario[] funcionarios;
	// private int totalClientes = 0;
	private int totalFuncionarios = 0;

	public Empresa(String nome, String ramo, String horarioAtendimento) {
		this.nome = nome;
		this.ramo = ramo;
		this.horarioAtendimento = horarioAtendimento;
		this.clientes = new Cliente[10];
		this.funcionarios = new Funcionario[5];
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
		this.clientes[i] = cliente;
		// totalClientes++;
	}

	public Cliente buscarCliente(int i) {
		return this.clientes[i];
	}

	public void registrarFuncionario(int i, Funcionario funcionario) {
		this.funcionarios[i] = funcionario;
	}

	public Funcionario buscarFuncionario(int i) {
		return this.funcionarios[i];
	}

	public void adicionarFuncionario(String nome, String cargo, double salario) {
		if (totalFuncionarios < 5) {
			this.funcionarios[totalFuncionarios] = new Funcionario(nome, cargo, salario);
			totalFuncionarios++;
		} else {
			System.out.println("Limite de funcionários atingido.");
		}
	}

	public void exibirFuncionarios() {
		System.out.println("=== Funcionários de " + this.nome + " ===");
		for (int i = 0; i < totalFuncionarios; i++) {
			System.out.println(funcionarios[i]);
		}
	}

	public void calcularFolhaSalarial() {
		double total = 0;
		for (int i = 0; i < totalFuncionarios; i++) {
			total += funcionarios[i].getSalario();
		}
		System.out.printf("Folha salarial total: R$ %.2f%n", total);
	}

	public String apresentarClientes() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(this.clientes[i] != null ? this.clientes[i].toString() : "-");
			sb.append("\n");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", ramo=" + ramo + ", horarioAtendimento=" + horarioAtendimento + "]";
	}
}