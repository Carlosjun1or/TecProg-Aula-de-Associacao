package br.edu.fatecpg.tecprog.associacao.atividade.view;

import br.edu.fatecpg.tecprog.associacao.atividade.model.*;

public class Main {
	public static void main(String[] args) {

		Cliente c1 = new Cliente("Carlos", "crdantasjr@gmail.com", 254.20);
		Empresa emp1 = new Empresa("Fatec", "Educação", "13:10 - 18:30");
		Funcionario func1 = new Funcionario("Carolina", "Chefe", "Tecnologia");
		emp1.setCliente(c1);
		emp1.setFuncionario(func1);

		System.out.println(emp1);
		System.out.println(emp1.getCliente().getEmail());
		System.out.println(emp1.getFuncionario().getCargo());
		
	}
}
