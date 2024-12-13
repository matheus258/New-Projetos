
# Sistema de Biblioteca - Livraria

Este projeto implementa um sistema de gerenciamento de biblioteca com controle de usuários, livros, empréstimos e autenticação via JWT. O sistema permite que os usuários sejam autenticados com tokens temporários, e os empréstimos de livros sejam registrados. Desenvolvido com **Java Spring Boot**, **JWT**, **MySQL** e **JPA**.

## 🚀 Funcionalidades

- **Autenticação de Usuários:** Sistema de login com **JWT** para autenticação de usuários com diferentes permissões de acesso.
- **Controle de Livros:** Gerenciamento de livros com cadastro, consulta e validações.
- **Controle de Empréstimos:** Registro de empréstimos de livros, com data de devolução.
- **Permissões de Acesso:** Diferenciação de acessos entre **ADMIN**, **FUNCIONARIO** e **USER**.

## 📋 Requisitos

Antes de executar o projeto, certifique-se de que você tem os seguintes requisitos instalados:

- **Java 17 ou superior**
- **Maven**
- **MySQL**

## 🔑 Sistema de Login e Controle de Usuários

O sistema de autenticação é realizado via **JWT**. Ele permite três tipos de usuários com diferentes permissões:

- **ADMIN:** Acesso completo a livros, empréstimos e usuários.
- **FUNCIONARIO:** Acesso a livros e empréstimos.
- **USER:** Acesso somente a livros e empréstimos.

## 🛠 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **JWT** (JSON Web Token) para autenticação
- **JPA/Hibernate**
- **MySQL**
- **Maven**

## 📄 Endpoints

### 1. **Autenticação (Login)**

- **POST /auth/login**

  Realiza o login e gera um token JWT para o usuário.

  **Exemplo de requisição:**
  ```json
  {
    "login": "admin",
    "senha": "senha123"
  }
  ```

  **Exemplo de resposta:**
  ```json
  {
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
  }
  ```

### 2. **Controle de Livros**

- **GET /livros**  
  Lista todos os livros cadastrados.

  **Exemplo de resposta:**
  ```json
  [
    {
      "id": 1,
      "titulo": "Java para Iniciantes",
      "autor": "John Doe",
      "isbn": "123456789",
      "anoPublicado": 2022
    },
    {
      "id": 2,
      "titulo": "Spring Boot na Prática",
      "autor": "Jane Smith",
      "isbn": "987654321",
      "anoPublicado": 2021
    }
  ]
  ```

- **POST /livros**  
  Adiciona um novo livro.

  **Exemplo de requisição:**
  ```json
  {
    "titulo": "O Guia do Programador",
    "autor": "Arthur Clark",
    "isbn": "1122334455",
    "anoPublicado": 2020
  }
  ```

  **Exemplo de resposta:**
  ```json
  {
    "id": 3,
    "titulo": "O Guia do Programador",
    "autor": "Arthur Clark",
    "isbn": "1122334455",
    "anoPublicado": 2020
  }
  ```

### 3. **Controle de Empréstimos**

- **GET /emprestimos**  
  Lista todos os empréstimos registrados.

  **Exemplo de resposta:**
  ```json
  [
    {
      "id": 1,
      "usuarioId": 2,
      "livroId": 1,
      "dataEmprestimo": "2024-12-01",
      "dataDevolucao": "2024-12-15"
    }
  ]
  ```

- **POST /emprestimos**  
  Realiza um novo empréstimo de livro.

  **Exemplo de requisição:**
  ```json
  {
    "usuarioId": 2,
    "livroId": 1,
    "dataEmprestimo": "2024-12-01",
    "dataDevolucao": "2024-12-15"
  }
  ```

  **Exemplo de resposta:**
  ```json
  {
    "id": 1,
    "usuarioId": 2,
    "livroId": 1,
    "dataEmprestimo": "2024-12-01",
    "dataDevolucao": "2024-12-15"
  }
  ```

### 4. **Controle de Usuários**

- **GET /usuarios**  
  Lista todos os usuários cadastrados.

  **Exemplo de resposta:**
  ```json
  [
    {
      "id": 1,
      "nome": "Admin User",
      "email": "admin@biblioteca.com",
      "papel": "ADMIN"
    },
    {
      "id": 2,
      "nome": "Funcionario User",
      "email": "funcionario@biblioteca.com",
      "papel": "FUNCIONARIO"
    }
  ]
  ```

- **POST /usuarios**  
  Adiciona um novo usuário.

  **Exemplo de requisição:**
  ```json
  {
    "nome": "Novo Usuario",
    "email": "novo@usuario.com",
    "senha": "senha123",
    "papel": "USER"
  }
  ```

  **Exemplo de resposta:**
  ```json
  {
    "id": 3,
    "nome": "Novo Usuario",
    "email": "novo@usuario.com",
    "papel": "USER"
  }
  ```

## 📂 Estrutura do Projeto

- **src/main/java/com/bibliotecasystem/biblioteca/controller/**  
  - **AuthenticationController.java**: Controlador de autenticação com JWT.
  - **LivroController.java**: Controlador de livros.
  - **EmprestimoController.java**: Controlador de empréstimos.
  - **UsuarioController.java**: Controlador de usuários.

## 💡 Configuração do Banco de Dados

Crie um banco de dados MySQL com o nome `biblioteca` e configure a conexão no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

## 🎯 Permissões de Usuário

O sistema tem três tipos de usuários com permissões específicas:

- **ADMIN**: Acesso total a livros, usuários e empréstimos.
- **FUNCIONARIO**: Acesso a livros e empréstimos.
- **USER**: Acesso limitado apenas a livros e empréstimos.

Cada tipo de usuário tem permissões diferenciadas, sendo controladas pelo sistema de autenticação JWT.

## 📄 Considerações Finais

Este é um sistema básico de biblioteca para fins de estudo e prática com **Spring Boot**, **JWT** e **MySQL**. O projeto pode ser expandido com mais funcionalidades, como filtros de pesquisa, geração de relatórios e integração com outras tecnologias.
