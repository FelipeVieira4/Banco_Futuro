# 🏦 Banco Futuro

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)

Projeto desenvolvido durante o curso de **Desenvolvimento de Sistemas no SENAI**, com o objetivo de aplicar conceitos avançados de Programação Orientada a Objetos (POO) e padrões de projeto.

---

## 🎯 Objetivos do Projeto

O foco principal deste desenvolvimento foi a prática de arquitetura de software, explorando:

* **Herança e Polimorfismo:** Implementação de classes para reescrita de métodos (`@Override`), permitindo comportamentos específicos para diferentes tipos de contas ou serviços.
* **Design Patterns:** Utilização do padrão **Abstract Factory** para a criação de famílias de objetos relacionados sem especificar suas classes concretas.
* **Encapsulamento:** Garantia da integridade dos dados bancários.

---

## 🏗️ Arquitetura e Padrões

### Abstract Factory
Neste projeto, o padrão **Abstract Factory** foi utilizado para isolar a lógica de criação de objetos. Isso permite que o sistema seja extensível (por exemplo, criando diferentes "tipos" de bancos ou pacotes de serviços) mantendo o código desacoplado e fácil de manter.

### Herança
As classes foram estruturadas para evitar a duplicação de código. Métodos base definidos na superclasse são especializados nas subclasses para atender regras de negócio específicas de cada modalidade bancária.

---

## 💻 Tecnologias Utilizadas

* **Linguagem:** Java
* **Conceitos:** POO (Programação Orientada a Objetos)
* **Padrão de Projeto:** Abstract Factory

   git clone [https://github.com/FelipeVieira4/Banco_Futuro.git](https://github.com/FelipeVieira4/Banco_Futuro.git)
