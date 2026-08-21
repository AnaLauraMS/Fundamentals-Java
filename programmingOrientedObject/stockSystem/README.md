# 📦 Sistema de Estoque de Produtos (Stock System)

Um programa em Java focado em conceitos de **Programação Orientada a Objetos (POO)** para gerenciamento básico de estoque, permitindo cadastrar produtos, calcular valores totais e atualizar quantidades disponíveis em estoque.

---

## 📌 Sobre o Projeto

Este módulo tem como objetivo demonstrar a modelagem de entidades do mundo real em classes Java, aplicando princípios fundamentais da Orientação a Objetos:
- **Entidades e Atributos:** Criação da classe `Product` para encapsular nome, preço e quantidade em estoque.
- **Interação com Usuário:** Leitura e processamento de dados via console com `Scanner`.
- **Organização em Camadas:** Separação lógica entre a execução (`application`) e a regra de negócio/entidades (`entities`).

---

## 🏗️ Estrutura do Projeto

```text
stockSystem/
└── src/
    ├── application/
    │   └── Program.java      # Classe principal com o fluxo de execução e interação via console
    └── entities/
        └── Product.java      # Classe que representa o produto e seus atributos