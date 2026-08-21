# 📐 Comparador de Áreas de Triângulos (Introdução à POO)

Uma versão refatorada em Java para cálculo e comparação de áreas de dois triângulos ($X$ e $Y$) utilizando a **Fórmula de Heron**, agora introduzindo conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

---

## 📌 Sobre o Projeto

Este projeto demonstra os primeiros passos na transição do paradigma puramente imperativo/estruturado para a Orientação a Objetos. A principal evolução consiste na representação de uma entidade do mundo real por meio de uma classe dedicada.

### Conceitos aplicados:
- **Criação de Entidades:** Definição da classe `Triangle` para agrupar os atributos dos lados (`a`, `b`, `c`).
- **Instanciação de Objetos:** Criação de instâncias distintas (`x` e `y`) na memória heap com a palavra-chave `new`.
- **Organização em Pacotes:** Separação das responsabilidades entre o pacote de entidades (`entities`) e o de execução (`application`).

---

## 🏗️ Estrutura do Projeto

```text
src/
├── application/
│   └── Program.java      # Ponto de entrada (main), leitura de dados e controle de fluxo
└── entities/
    └── Triangle.java     # Definição dos atributos do triângulo (a, b, c)