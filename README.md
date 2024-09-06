# Criando um Banco Digital com Java e Orientação a Objetos

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:

“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição). Além disso, o banco oferece também dois serviços adicionais para seus clientes: um Cartão de Crédito, que permite realizar compras com limite de crédito e pagar a fatura utilizando saldo da conta corrente, e um Seguro de Conta, que protege os clientes contra saldo negativo, aplicando automaticamente um valor de seguro caso o saldo da conta fique negativo.”

Na implementação desta solução, utilizamos os principais conceitos da Programação Orientada a Objetos (POO), como abstração, encapsulamento, herança e polimorfismo. As contas são representadas por uma classe abstrata Conta, da qual derivam duas classes concretas: ContaCorrente e ContaPoupanca. Ambas possuem métodos para depositar, sacar e transferir, garantindo a movimentação financeira entre as contas.

O Cartão de Crédito foi implementado como uma classe separada, onde cada cliente pode possuir um cartão vinculado a uma conta, permitindo a realização de compras até um limite pré-definido. As compras realizadas reduzem o limite disponível do cartão, e o pagamento da fatura é feito diretamente da conta corrente do cliente.

Já o Seguro de Conta foi implementado para garantir a segurança financeira dos clientes em situações adversas, como quando o saldo de uma conta fica negativo. Esse seguro deposita automaticamente um valor pré-estabelecido na conta, protegendo o cliente de ficar com saldo negativo e evitando problemas financeiros maiores.

Com essas funcionalidades, o sistema bancário digital proporciona uma experiência mais completa, oferecendo aos clientes não só o gerenciamento básico de suas contas, mas também benefícios adicionais que aumentam a segurança e flexibilidade no uso dos serviços bancários.”

### Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

### Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

### Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

### Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.
