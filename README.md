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
