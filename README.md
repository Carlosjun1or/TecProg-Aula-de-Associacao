# 🏢 Associação entre Classes em Java

Atividade desenvolvida na **FATEC Praia Grande** para a aula de **Técnicas de Programação** com foco nos conceitos de **Associação e Composição** entre classes da Programação Orientada a Objetos (POO).

## 📋 Sobre o Projeto

Este projeto implementa um `Sistema de Gestão Empresarial` que demonstra na prática os conceitos de associação e composição entre classes em Java.

O objetivo principal é aplicar conceitos como:
*   **Associação entre Classes:** Relacionamento entre `Empresa` e `Cliente`, onde a empresa conhece seus clientes.
*   **Composição:** Relacionamento entre `Empresa` e `Funcionario`, onde os funcionários fazem parte da empresa.
*   **Arrays de Objetos:** Gerenciamento de coleções de objetos com tamanho fixo.
*   **Encapsulamento:** Atributos privados com acesso controlado via getters e setters.
*   **Separação entre Model e View:** Organização do código em camadas distintas para lógica de negócio e interface com o usuário.

## 🚀 Tecnologias Utilizadas

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)<br>
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)

## 📁 Estrutura do Projeto

```
src/
└── br/
    └── edu/
        └── fatecpg/
            └── tecprog/
                └── associacao/
                    └── atividade/
                        ├── model/
                        │   ├── Empresa.java
                        │   ├── Cliente.java
                        │   └── Funcionario.java
                        └── view/
                            └── Main.java
```

## 🧱 Modelagem Orientada a Objetos

### 🔹 Parte 1 — Associação: Empresa e Cliente

**Enunciado:** Crie uma classe `Cliente` com os atributos `nome` e `email`. Modifique a classe `Empresa` para ter um array de até 10 clientes.

| Classe | Atributos | Descrição |
| --- | --- | --- |
| **Cliente** | `nome`, `email`, `mensalidadePaga` | Representa um cliente da empresa |
| **Empresa** | `clientes[]` (máx. 10) | Associação com até 10 clientes |

**Métodos implementados em `Empresa`:**

| Método | Descrição |
| --- | --- |
| `registrarCliente(int i, Cliente c)` | Registra um cliente na posição informada |
| `buscarCliente(int i)` | Retorna o cliente da posição informada |
| `apresentarClientes()` | Exibe todos os clientes cadastrados |

---

### 🔹 Parte 2 — Composição: Empresa e Funcionário

**Enunciado:** Modifique a classe `Empresa` para incluir um array de até 5 funcionários. Implemente métodos para adicionar, exibir e calcular a folha salarial.

| Classe | Atributos | Descrição |
| --- | --- | --- |
| **Funcionario** | `nome`, `cargo`, `setor`, `salario` | Representa um funcionário da empresa |
| **Empresa** | `funcionarios[]` (máx. 5) | Composição com até 5 funcionários |

**Métodos implementados em `Empresa`:**

| Método | Descrição |
| --- | --- |
| `adicionarFuncionario(String nome, String cargo, double salario)` | Cria e adiciona um funcionário à lista |
| `exibirFuncionarios()` | Exibe o nome e cargo de cada funcionário |
| `calcularFolhaSalarial()` | Calcula e exibe o total gasto em salários |

## 👤 Autor

| Nome |
| --- |
| [**Carlos Roberto**](https://github.com/Carlosjun1or) |
