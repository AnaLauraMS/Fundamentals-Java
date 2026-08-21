# 💰 Banco Java

Projeto desenvolvido em **Java** com o objetivo de praticar os fundamentos da linguagem, criando uma simulação simples de um sistema bancário executado via terminal.

O projeto permite ao usuário realizar operações básicas de uma conta bancária através de um menu interativo.

---

## 🚀 Funcionalidades

- ✅ Consultar saldo da conta
- ✅ Realizar depósitos
- ✅ Realizar saques
- ✅ Validação de valores informados
- ✅ Menu interativo utilizando estrutura de repetição
- ✅ Encerramento do sistema pelo usuário

---

## 🖥️ Exemplo de execução

```text
=========================
        BANCO JAVA
=========================

1 - Consultar saldo
2 - Depositar
3 - Sacar
4 - Sair

Escolha uma opção: 1

Seu saldo é: R$ 1000.00
```

---

## 🛠️ Tecnologias utilizadas

- Java 17+
- IntelliJ IDEA
- Git
- GitHub

---

## 📚 Conceitos praticados

Durante o desenvolvimento deste projeto foram aplicados conceitos fundamentais da linguagem Java:

- Variáveis e tipos de dados
- Entrada de dados utilizando `Scanner`
- Estruturas condicionais:
  - `if`
  - `else if`
  - `else`
- Estrutura de repetição:
  - `while`
- Operadores matemáticos:
  - `+=`
  - `-=`
- Formatação de saída utilizando `printf`
- Validação de dados de entrada
- Controle de fluxo do programa

---

## 🧠 Regras do sistema

### 💳 Consulta de saldo

O usuário pode consultar o saldo atual da conta.

Exemplo:

```text
Saldo atual: R$ 1000.00
```

---

### 💵 Depósito

O usuário informa um valor para adicionar à conta.

Regras:

- O valor deve ser maior que zero.
- Após um depósito válido, o saldo é atualizado.

Exemplo:

```text
Saldo inicial: R$ 1000.00

Depósito: R$ 200.00

Novo saldo: R$ 1200.00
```

---

### 💸 Saque

O usuário informa um valor para retirar da conta.

Regras:

- O valor deve ser maior que zero.
- O saque só é permitido quando existe saldo suficiente.
- O saldo é atualizado após um saque realizado.

Exemplo:

```text
Saldo inicial: R$ 1000.00

Saque: R$ 300.00

Novo saldo: R$ 700.00
```

Caso o valor solicitado seja maior que o saldo disponível:

```text
Saldo insuficiente.
```

---

## 🔄 Fluxo do programa

```text
Início

   ↓

Exibe menu

   ↓

Usuário escolhe uma opção

   ↓

Executa operação escolhida

   ↓

Retorna ao menu

   ↓

Usuário escolhe opção 4

   ↓

Encerrar programa
```

---

## ▶️ Como executar o projeto

### Pré-requisitos

- Java JDK 17 ou superior instalado
- Uma IDE Java (IntelliJ IDEA recomendada)

### Executando

1. Clone o repositório:

```bash
git clone https://github.com/AnaLauraMS/java-fundamentos.git
```

2. Abra o projeto na IDE.

3. Execute o arquivo:

```text
Main.java
```

4. Utilize o menu pelo terminal.

---

## 📌 Próximas melhorias

Este projeto será evoluído futuramente aplicando novos conceitos de Java:

- [ ] Criar uma classe `Conta` utilizando Programação Orientada a Objetos
- [ ] Separar responsabilidades em diferentes classes
- [ ] Criar múltiplas contas bancárias
- [ ] Implementar histórico de transações
- [ ] Adicionar testes automatizados
- [ ] Implementar persistência de dados

---

## 👩‍💻 Autora

**Ana Laura Martins Souto**

Estudante de Desenvolvimento de Sistemas Multiplataforma.

Atualmente estudando Java, Banco de Dados e Desenvolvimento Backend.

🔗 GitHub:
[https://github.com/AnaLauraMS](https://github.com/AnaLauraMS)
