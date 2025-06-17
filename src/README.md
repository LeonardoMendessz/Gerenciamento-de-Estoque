# 📦 Gerenciador de Estoque - Java + JDBC + MySQL

Projeto de Gerenciamento de Estoque feito para praticar Programação Orientada a Objetos junto com Banco de Dados - JDBC + MySql

---

## 🛠️ Tecnologias usadas:

- Java 
- MySQL
- JDBC (conector MySQL)
- IntelliJ IDEA (IDE que usei)
- Terminal / Console

---

## 📋 O que o projeto faz:

Um sistema de estoque no Terminal que serve para:

- Adicionar produtos ao banco de dados
- Listar os produtos cadastrados
- Deletar produtos pelo ID
- Sair do sistema

Tudo rodando direto no terminal e conectando ao banco MySQL.

---

## 🧱 Estrutura do projeto:

- **Produto.java** → Classe Produto com atributos (id, nome, preço)
- **ProdutoDAO.java** → Classe de acesso ao banco com métodos: inserir, listar e deletar
- **ConexaoDAO.java** → Faz a conexão com o banco
- **Main.java** → Onde fica o menu de navegação e a interação com o usuário

---

## ✅ Objetivo desse projeto:

Meu objetivo com esse projeto foi:

- Praticar a criação de classes com POO
- Aprender a usar JDBC para inserir, consultar e deletar dados no MySQL
- Treinar a estruturação de um pequeno sistema de CRUD
- Treinar Descrição de Readme
- Criar meu primeiro projetinho Java com banco pra colocar no GitHub 🎉


---

## 🚀 Como rodar o projeto:

1. Clone o repositório
2. Configure seu banco MySQL:
    - Crie o banco chamado `estoque`
    - Crie a tabela `produto` com os campos: `id (int)`, `nome (varchar)`, `preco (double)`
    - Lembrando que o ID é setado pelo usuario e não como Auto incrementação
3. Ajuste o usuário e senha da sua conexão no arquivo `ConexaoDAO.java`
4. Compile e execute o projeto

---

## 👨‍💻 Status:

✅ Finalizado (por enquanto... futuras melhorias virão 😄)

