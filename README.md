# Programação Funcional com a Linguagem Clojure

Repositório da disciplina **Programação Funcional** (Código: `ECM969`) — Instituto Mauá de Tecnologia (IMT), em parceria com a USCS – Universidade Municipal de São Caetano do Sul.

> **Course:** Functional Programming
> **Materia:** Programación Funcional

---

## Sobre a Disciplina

Esta disciplina apresenta os fundamentos e a prática do **paradigma de programação funcional**, um dos pilares mais relevantes da engenharia de software moderna. Diferentemente do paradigma imperativo — centrado em estados mutáveis e sequências de comandos —, a programação funcional trata a computação como a **avaliação de funções matemáticas**, evitando efeitos colaterais e dados mutáveis.

Essa abordagem tem ganhado destaque crescente na indústria por favorecer:

- **Previsibilidade e confiabilidade**: funções puras e transparência referencial tornam o comportamento do código mais fácil de raciocinar, testar e depurar.
- **Concorrência e paralelismo**: a imutabilidade dos dados elimina uma classe inteira de bugs relacionados a condições de corrida, tornando o paradigma funcional especialmente adequado a sistemas distribuídos e multithread.
- **Composabilidade**: o uso extensivo de funções de alta ordem (*higher order functions*) permite construir sistemas complexos a partir de peças pequenas, simples e reutilizáveis.
- **Qualidade e manutenibilidade de código**: menos estado compartilhado significa menos acoplamento e menos efeitos colaterais inesperados em sistemas de grande escala.

**Clojure**, um dialeto moderno do Lisp que roda sobre a JVM (e também em ambientes JavaScript via ClojureScript), é a linguagem escolhida para a aplicação prática desses conceitos. Sua sintaxe minimalista baseada em expressões simbólicas (*s-expressions*), seu forte enfoque em imutabilidade e estruturas de dados persistentes, e sua interoperabilidade nativa com o ecossistema Java fazem dela uma ferramenta poderosa tanto para o aprendizado dos fundamentos teóricos quanto para o desenvolvimento de aplicações reais — sendo inclusive adotada por empresas de tecnologia de ponta, como o Nubank, em sistemas de missão crítica.

## Professor

**Prof. Dr. Aparecido V. de Freitas**

- Doutor e Mestre em Engenharia da Computação pela EPUSP – Escola Politécnica da USP
- Especialização em Engenharia de Software pela EPUSP
- Engenharia Plena pela Escola de Engenharia Mauá
- Bacharel em Matemática pela Fundação Santo André
- 15 anos como Supervisor de TI na Volkswagen do Brasil
- Especialista nas plataformas IBM i (desde 1993) e IBM Mainframe (15 anos)
- Professor da USCS desde a primeira turma do curso de Ciência da Computação (1989); Gestor dos cursos de Computação da USCS (2000–2013 e 2020–2021)
- Ex-professor de Engenharia de Computação, CC e SI na Escola de Engenharia Mauá; ex-professor na Universidade Metodista e na Fundação Santo André
- Certificações internacionais ISTQB (CTFL, CTFL-AT, CPRE)
- Especialista do Conselho Estadual de Educação – SP

**Contato:**
- 📧 aparecidovfreitas@gmail.com
- 📧 aparecido.freitas@online.uscs.edu.br
- 📱 (11) 9 9199-1040

## Ementa

Introdução ao Paradigma Funcional. Linguagens puramente funcionais. Abordagem multiparadigma. Paradigma Funcional comparado a outros paradigmas de programação. Noções de Cálculo Lambda. Programação Orientada a Dado. Construção de programas com funções. Manuseio de listas. Imutabilidade de dados. Higher order functions. Funções como argumentos. Transparência referencial. Aplicações com o emprego de linguagens funcionais. Projeto com a linguagem Clojure.

## Modalidade de Ensino

Aula de Laboratório – Presencial

## Conhecimentos Prévios

- Conceitos de Algoritmos e Estruturas de Dados
- Conceitos de Lógica de Programação
- Conceitos de Programação Orientada a Objetos

## Competências Desenvolvidas

1. Projetar APIs com o emprego de Programação Funcional
2. Construir algoritmos computacionais com o emprego da linguagem Clojure

## Objetivos

**Conhecimentos**
- C1. Compreender os diversos conceitos presentes em Linguagens Funcionais
- C2. Compreender as diferenças do Paradigma Funcional em relação aos paradigmas clássicos
- C3. Capacitar o estudante na utilização da sintaxe das Linguagens Funcionais

**Habilidades**
- H1. Identificar as vantagens da utilização de Linguagens Funcionais
- H2. Distinguir conceitualmente os vários Paradigmas de Programação
- H3. Desenvolver programas em Linguagens Funcionais

**Atitudes**
- A1. Apresentar iniciativa, desenvoltura e pró-atividade na elaboração das atividades relativas ao processo de criação e utilização de programas codificados em Linguagens Funcionais

## Metodologia Didática

O curso é ministrado em Laboratório de Computação, com ambientes de compilação e interpretação de Linguagens Funcionais. Utiliza-se a plataforma **MOODLE** para armazenamento de atividades, questionários e simulados, com o objetivo de acompanhar e verificar a evolução da aprendizagem ao longo do semestre. A estratégia ativa de aprendizagem adotada é o **Project Based Learning (PBL)**, na qual os conceitos teóricos são consolidados por meio do desenvolvimento de um projeto prático completo.

## Projeto Aplicado: Sistema Valderrama

Como projeto central da disciplina, os alunos desenvolvem uma **aplicação completa de gestão para um luthier de violões artesanais** (José Valderrama), aplicando na prática os conceitos de programação funcional estudados em sala — imutabilidade, funções puras, composição de funções e manipulação funcional de dados.

O projeto é dividido em duas grandes frentes:

### 1. Site Institucional
Página pública de apresentação do luthier e de seu trabalho, contemplando:
- Home, apresentação do luthier e do processo de construção artesanal
- Catálogo de violões, tarrachas e opções de afinação
- **Calculadora de trastes**: ferramenta interativa que aplica a fórmula acústica `d_n = L × (1 − 1/2^(n/12))` para calcular o espaçamento de cada traste a partir da escala do instrumento — um exemplo direto de aplicação de funções matemáticas puras
- Canal de contato e agendamento de visitas/orçamentos

### 2. Sistema Administrativo (Back-office)
Painel interno para gestão do negócio, protegido por autenticação, contemplando:
- **Dashboard** central de navegação
- **Gestão de Clientes**: cadastro e consulta
- **Gestão de Encomendas**: acompanhamento dos pedidos em construção
- **Controle de Pagamentos**: mensalidades e parcelas
- **Registro de Entregues**: histórico de pedidos finalizados
- **Violão Padrão**: definição de valores default (dimensões, madeiras, acabamentos) para preenchimento automático de novas encomendas
- **Relatórios**: geração de relatórios por cliente, relatório geral de encomendas, relatório financeiro de entradas e relatório de pendências financeiras

Esse projeto integrador serve como estudo de caso para demonstrar como os princípios da programação funcional — dados imutáveis, funções como cidadãs de primeira classe e pipelines de transformação de dados — se traduzem em um sistema real de controle de produção e gestão financeira.

## Bibliografia

**Básica**
- SEBESTA, Robert W. *Conceitos de linguagem de programação*. 9. ed. Porto Alegre: Bookman, 2011. ISBN 9788577807918.
- WINSTON, Patrick Henry; HORN, Berthold Klaus Paul. *LISP*. 3. ed. Reading: Addison-Wesley, 1989. ISBN 0201083191.

**Complementar**
- STEELE JR., Guy L. *Common Lisp: the language*. 2. ed. Digital Press, 1990. ISBN 1-55558-041-6.

## Contribuição da Disciplina

O paradigma funcional de programação representa um componente importante na área de Desenvolvimento de Software, uma vez que trata a computação como avaliação de funções, evitando dados mutáveis. Linguagens funcionais enfatizam as sucessivas chamadas de funções, em contraste com a programação imperativa, que enfatiza mudanças no estado do programa.

---

*Instituto Mauá de Tecnologia (IMT) — em parceria com a USCS – Universidade Municipal de São Caetano do Sul.*