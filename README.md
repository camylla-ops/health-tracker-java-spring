# Health Tracker Java

## 🚀 Desafio #7DaysOfCode - Alura

Este projeto é desenvolvido como parte do desafio #7DaysOfCode da Alura, focado em consolidar habilidades em Back-end Java, utilizando o framework Spring Boot. O objetivo final é criar uma aplicação completa para gestão de hábitos de saúde (exercícios, refeições e sono).

---

## 💻 Tecnologias (Dia 1: Configuração)

A estrutura inicial foi definida com o Spring Initializr, incluindo as seguintes dependências:

* **Linguagem:** Java 17
* **Framework:** Spring Boot 3.x
* **Build:** Maven
* **Persistência:** Spring Data JPA + H2 Database
* **Web:** Spring Web + Thymeleaf
* **Utilitários:** Lombok, Spring Boot DevTools, Spring Boot Actuator

## **Dia 2: Modelagem de Dados**

* Criação das entidades `Exercicio`, `Refeicao` e `Sono` no pacote `entity`.
* Mapeamento Objeto-Relacional (ORM) usando as anotações `@Entity`, `@Id`, e `@Data` (Lombok) para código limpo.
* Validação do schema gerado pelo Hibernate no console do H2.

##  Dia 3: Camada Repository

- Criação das interfaces `ExercicioRepository`, `RefeicaoRepository` e `SonoRepository`.
- Implementação do padrão **Repository** utilizando `JpaRepository`.
- Integração com o **Spring Data JPA** para geração automática das operações CRUD.
- Validação da configuração por meio dos logs de inicialização da aplicação.

##  Dia 4: Controladores e Rotas Básicas

- Criação dos controladores REST:
  - `ExercicioController`
  - `RefeicaoController`
  - `SonoController`

- Definição das rotas base:
  - `/exercicio`
  - `/refeicao`
  - `/sono`

- Implementação dos endpoints:
  - `GET /listar`
  - `POST /salvar`
  - `PUT /editar/{id}`
  - `DELETE /excluir/{id}`

- Integração dos controllers com a camada Repository.
- Testes dos endpoints utilizando o **Postman**.
