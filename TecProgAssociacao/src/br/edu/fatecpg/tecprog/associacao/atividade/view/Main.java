package br.edu.fatecpg.tecprog.associacao.atividade.view;

import br.edu.fatecpg.tecprog.associacao.atividade.model.*;

public class Main {
	public static void main(String[] args) {

		Empresa emp1 = new Empresa("Fatec", "Educação", "13:10 - 18:30");

		emp1.registrarCliente(0, new Cliente("Carlos", "crdantasjr@gmail.com", 254.20));
		emp1.registrarCliente(1, new Cliente("Carolina", "carolina@email.com", 300.00));
		emp1.registrarCliente(2, new Cliente("Rubia", "rubia@email.com", 180.50));

		emp1.adicionarFuncionario("Carolina", "Chefe", 7000.00);
		emp1.adicionarFuncionario("Danilo", "Analista", 4500.00);
		emp1.adicionarFuncionario("Pedro", "Desenvolvedor", 5200.00);

		System.out.println(emp1);

		System.out.println("\n--- Clientes ---");
		System.out.println(emp1.apresentarClientes());

		emp1.exibirFuncionarios();
		System.out.println("");
		emp1.calcularFolhaSalarial();
	}
}