# 📐 Comparador de Áreas de Triângulos (Fórmula de Heron)

Um programa simples em Java que calcula e compara a área de dois triângulos distintos ($X$ e $Y$) a partir das medidas dos seus três lados, utilizando a **Fórmula de Heron**.

---

## 📌 Sobre o Projeto

O objetivo deste programa é exemplificar a resolução de um problema geométrico clássico em Java de forma estruturada, demonstrando:
- Leitura de dados via console com `Scanner`.
- Configuração de localização (`Locale.US`) para leitura de números com ponto flutuante no padrão com ponto (`.`).
- Aplicação de cálculos matemáticos com a classe `Math` (`Math.sqrt`).
- Estruturas de controle condicional (`if-else`) para comparação de valores.

---

## 🧮 Como Funciona o Cálculo

A área dos triângulos é calculada utilizando a **Fórmula de Heron**, indicada quando se conhece apenas o comprimento dos três lados ($a$, $b$ e $c$):

1. **Semiperímetro ($p$):**
   $$p = \frac{a + b + c}{2}$$

2. **Área:**
   $$\text{Área} = \sqrt{p \cdot (p - a) \cdot (p - b) \cdot (p - c)}$$

---

## 🚀 Como Executar

### Pré-requisitos
- **Java JDK** instalado (versão 8 ou superior).

### Passo a passo

1. **Clone ou baixe o repositório:**
   ```bash
   git clone [https://github.com/seu-usuario/nome-do-repositorio.git](https://github.com/seu-usuario/nome-do-repositorio.git)