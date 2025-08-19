# FórumHub API REST

## 📖 Descrição

Olá, seja bem-vindo(a)!

Este projeto foi desenvolvido como parte do **Challenge Back End da Alura**. O objetivo é criar uma **API REST** que simula a funcionalidade de um fórum, permitindo operações de **criação, consulta, atualização e exclusão (CRUD)** de tópicos.

---

## ⚙️ Funcionalidades da API

A API foi construída utilizando o framework **Spring Boot** e oferece as seguintes funcionalidades:

- 📌 **Criar um novo tópico**  
  Permite que usuários registrem novos tópicos no fórum.

- 📋 **Listar todos os tópicos**  
  Retorna uma lista com todos os tópicos cadastrados.

- 🔍 **Consultar um tópico específico**  
  Busca os detalhes de um tópico a partir de seu ID.

- ✏️ **Atualizar um tópico**  
  Permite modificar o conteúdo de um tópico existente.

- 🗑️ **Deletar um tópico**  
  Remove um tópico da base de dados.

---

## 🛠️ Tecnologias Utilizadas

- **Spring Boot** – Framework principal da aplicação.  
- **Hibernate / JPA** – Mapeamento objeto-relacional.  
- **MySQL** – Banco de dados relacional.  
- **Spring Security** – Implementação de autenticação e autorização.

---

## 🧱 Estrutura do Projeto

O projeto está dividido em camadas, seguindo boas práticas de desenvolvimento:

- **Controller**  
  Define os endpoints e gerencia as requisições HTTP.

- **Repository**  
  Responsável pela comunicação com a base de dados.

- **Model**  
  Contém as entidades que representam as tabelas do banco.

- **DTO (Data Transfer Object)**  
  Facilita e organiza a transferência de dados entre as camadas da aplicação.

---

## 🚀 Passo a Passo

1. Clone o repositório:
   ```bash
   git clone https:https://github.com/Jucianogp/forum-hub
   cd forum-hub

2. Configure o banco de dados no arquivo src/main/resources/application.properties:
   ```bash
    spring.datasource.url=jdbc:mysql://localhost:3306/forum_hub
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=none
    flyway.enabled=true

3. Execute as migrations:
  ```bash
  ./mvnw flyway:migrate
  ```

4. Execute o projeto:
  ```bash
  ./mvnw spring-boot:run
  ```

Após executar o projeto, você pode acessar a documentação da API em:
  ```bash
  http://localhost:8080/swagger-ui.html
  ```
