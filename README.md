# TavernaEncantada

📝 Descrição do Projeto – Sistema de Pedidos com Temática RPG

Este projeto consiste em um sistema de pedidos de comida com temática de RPG (Role-Playing Game), desenvolvido na linguagem Java como parte da entrega do Projeto A3. O sistema simula o ambiente de uma taverna medieval, onde clientes fazem pedidos de pratos especiais, como sopas e poções, e o garçom (um personagem do sistema) é responsável por organizar e entregar esses pedidos.

O sistema foi construído com o objetivo de demonstrar, de forma prática, a aplicação de padrões de projeto (Design Patterns) clássicos da programação orientada a objetos. Para isso, foram utilizados os padrões:

- Command, para encapsular os pedidos como objetos e permitir que o garçom execute diferentes tipos de pedidos de forma desacoplada.

- Observer, para notificar personagens do ambiente (como o Taverneiro) sobre novas ações ou pedidos realizados, permitindo uma resposta reativa do sistema.

⚙️ Funcionamento Geral

  1. O cliente faz um pedido, como uma poção ou uma sopa.

  2. Cada tipo de pedido é representado por uma classe concreta que implementa a interface Pedido (Command).

  3. O garçom adiciona os pedidos recebidos a uma lista.

  4. Quando o garçom executa a entrega, todos os pedidos da lista são processados (executados) e uma mensagem é exibida no console.

  5. O Observer entra em ação ao detectar novos pedidos, simulando a notificação de um personagem como o Taverneiro, que reage aos eventos no sistema.

  6. O sistema imprime no console o fluxo das ações, como uma narrativa de jogo RPG.
