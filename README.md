# PROGRAMAÇÃO ORIENTADA A OBJETOS

## Descrição do Projeto
<p align="center">Projeto de estudo de Programação Orientada a Objeto, baseado no livro "Aprenda a Programação Orientada a Objetos em 21 Dias - Anthony Sintes</p>

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)


# Semana 1 -  Definindo OO
## Introdução POO

### Vantagens e Objetivos da OO
1. Natural
2. Confiável
3. Reutilizável
4. Manutenível
5. Extensível
6. Oportunos

### Armadilhas do POO

## Encapsulamento 
Os três pilares da POO são: encapsulamento, herança e polimorfismo

É a caracteristica da OO de ocultar partes independentes da implementação. O encapsulamento permite que se construa partes ocultas da implementação do software, qua atinjam uma funcionalidade e ocultam os detalhes de implementação do mundo exterior.

Uma vez encapsulado a entidade pode ser vista como uma caixa preta, onde se sabe o que ela faz pois conhece a interface externa, mas não existe a necessidade de saber o que tem dentro da caixa preta.

![Encapsulamenta - a caixa preta](/img/caixapreta.jpg)

### Por que se deve encapsular?
* Idependência - Poder utilizar o código em qualquer parte.
* Transparência - Permite que se atualiza o compnente, fornece implmentação amis eficiente e ou corrigir erros tudo sem ter a necessidade de alterar outros objetos do programa.
* Não causará efeitos colaterais inesperados entre o objeto e o restante do programa.

### Caracteristicas do Encapsulamento Eficaz
* Abstração
* Ocultação da Implementação
* Divisão de responsabilidades

### Abstração
É o processo de simplificar um problema díficil, simplificar o mundo real e incluir apenas as parters que realmente afetam o problemas (ou a simulação).

### Abstração Eficaz
* Trate o problema como geral e não com especificidade
* Quando confrontar vários problemas diferentes, procure o que for mais comum a todos. Tente ver um conceito e não um caso especifico.
* Não se esqueça que existe um problema a ser resolvido.
* A abstração nem sempre estará aparente.

### TAD - Abstract Data Type - Tipo Abstrato de Dados
TAD é um conjunto de dados e um conjunto de operações sonre dados.
Os TADs permite a definição de novos tipos de linguagem, ocultamento dados internos e o estado, atrás de uma interface bem definida. A interface apresenta o TAD como uma única unidade atômica.

### BadItem x Item
O código existente em day01 foi reescrito em day02_encapsulamneto/baditem, esta reescrita do código nos mostra como ficaria o codigo de uma forma foram do pilar de encapsulamento, notasse que esse código ficou de uma forma mais procedural, forçando que sempre que precise executar o calculo de atualização do preço do item este tenha que ser repetido, além de mudanças siginifcativas forma realizadas em todos os aquivos (neste caso 2 arquivos).
O código reescrito em BadItem não possui a caracteristica de Encapsulamento.

### Dicas e Armadilhas do Encapsulamento
Ao escrever uma classe pode se ter problemas se tentar trabalhar de forma abstrata demais. Pois em um programa vai existir diferentes objetos que se comportam de formas diferentes.

:warning: Não coloque em uma classe mais que o necessário para resolver o problemas.
