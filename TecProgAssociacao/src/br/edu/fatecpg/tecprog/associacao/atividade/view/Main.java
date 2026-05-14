package br.edu.fatecpg.tecprog.associacao.atividade.view;

import br.edu.fatecpg.tecprog.associacao.atividade.model.*;

public class Main {
	public static void main(String[] args) {

		Cliente c1 = new Cliente("Carlos", "crdantasjr@gmail.com", 254.20);
		Empresa emp1 = new Empresa("Fatec", "Educação", "13:10 - 18:30");
		Funcionario func1 = new Funcionario("Carolina", "Chefe", "Tecnologia");
		System.out.println(emp1);

		emp1.registrarCliente(0, c1);
		emp1.registrarCliente(1, c1);
		emp1.registrarCliente(2, c1);
		
		System.out.println(emp1.apresentarClientes());
	}
}
