// 1. Calculadora de Geometria:
//    - Crie uma classe `Forma` que tenha métodos para calcular a área e o perímetro.
//    - Crie subclasses para formas geométricas como `Retângulo`, `Círculo`, `Triângulo`, etc., cada uma com métodos para calcular sua área e perímetro específicos.

class Forma {
    calcularArea() {}
    calcularPerimetro() {}
}

class Retangulo extends Forma {
    constructor(base, altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    calcularArea() {
        return this.base * this.altura;
    }

    calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
}

const retangulo = new Retangulo(5, 5);
console.log("Área do retângulo:", retangulo.calcularArea());
console.log("Perímetro do retângulo:", retangulo.calcularPerimetro()); //Área do retângulo: 25 // Perímetro do retângulo: 20

class Circulo extends Forma {
    constructor(raio) {
        super();
        this.raio = raio;
    }

    calcularArea() {
        return Math.PI * this.raio ** 2;
    }

    calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }
}

const circulo = new Circulo(10);
console.log("Área do círculo:", circulo.calcularArea());
console.log("Perímetro do círculo:", circulo.calcularPerimetro());
//Área do círculo: 314.1592653589793 //Perímetro do círculo: 62.83185307179586

class Triangulo extends Forma {
    constructor(base, altura, lado1, lado2, lado3) {
        super();
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    calcularArea() {
        return (this.base * this.altura) / 2;
    }

    calcularPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }
}

const triangulo = new Triangulo(5, 4, 3, 4, 5);
console.log("Área do triângulo:", triangulo.calcularArea());
console.log("Perímetro do triângulo:", triangulo.calcularPerimetro()); // Área do triângulo: 10 // Perímetro do triângulo: 12

// 2. Jogo da Velha:
//    - Crie uma classe `JogoDaVelha` que represente o tabuleiro e as regras do jogo.
//    - Implemente métodos para marcar uma posição no tabuleiro, verificar se há um vencedor e reiniciar o jogo.

const tabuleiro = [
    ['', '', ''],
    ['', '', ''],
    ['', '', '']
];

function mostrarTabuleiro() {
    for (let linha = 0; linha < 3; linha++) {
        let linhaAtual = '';
        for (let coluna = 0; coluna < 3; coluna++) {
            linhaAtual += tabuleiro[linha][coluna] + ' ';
        }
        console.log(linhaAtual);
    }
}

function marcarPosicao(jogador, linha, coluna) {
    if (tabuleiro[linha][coluna] === '') {
        tabuleiro[linha][coluna] = jogador;
        mostrarTabuleiro();
    } else {
        console.log('Essa posição já está ocupada. Escolha outra.');
    }
}

function verificarVencedor() {
    // Verificar linhas e colunas
    for (let i = 0; i < 3; i++) {
        if (tabuleiro[i][0] !== '' && tabuleiro[i][0] === tabuleiro[i][1] && tabuleiro[i][1] === tabuleiro[i][2]) {
            return tabuleiro[i][0]; // Retorna o jogador vencedor
        }
        if (tabuleiro[0][i] !== '' && tabuleiro[0][i] === tabuleiro[1][i] && tabuleiro[1][i] === tabuleiro[2][i]) {
            return tabuleiro[0][i]; // Retorna o jogador vencedor
        }
    }
    // Verificar diagonais
    if (tabuleiro[0][0] !== '' && tabuleiro[0][0] === tabuleiro[1][1] && tabuleiro[1][1] === tabuleiro[2][2]) {
        return tabuleiro[0][0]; // Retorna o jogador vencedor
    }
    if (tabuleiro[0][2] !== '' && tabuleiro[0][2] === tabuleiro[1][1] && tabuleiro[1][1] === tabuleiro[2][0]) {
        return tabuleiro[0][2]; // Retorna o jogador vencedor
    }
    return null;
}

function reiniciarJogo() {
    for (let linha = 0; linha < 3; linha++) {
        for (let coluna = 0; coluna < 3; coluna++) {
            tabuleiro[linha][coluna] = '';
        }
    }
    mostrarTabuleiro();
}

// Chamar as funções para iniciar a jogada
reiniciarJogo();
marcarPosicao('X', 0, 0);
const vencedor = verificarVencedor(); 
mostrarTabuleiro();
reiniciarJogo(); 

// 3. Gestão de Contatos:
//    - Crie uma classe `Contato` com propriedades como nome, telefone e email.
//    - Crie uma classe `Agenda` que possa adicionar, remover e pesquisar contatos.

class Contato{
    constructor(nome, telefone, email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
}

class Agenda {
    constructor() {
        this.contatos = [];
    }

    adicionarContato(contato) {
        this.contatos.push(contato);
    }

    removerContato(nome) {
        this.contatos = this.contatos.filter(contato => contato.nome !== nome);
    }

    pesquisarContato(nome) {
        return this.contatos.find(contato => contato.nome === nome);
    }

    listarContatos() {
        return this.contatos;
    }
}

const agenda = new Agenda();

const pessoa1 = new Contato('Jorge', '11 9999-8888', 'jorge@dominio.com')
const pessoa2 = new Contato('Fabricio', '22 8888-7777', 'fabricio@dominio.com');

agenda.adicionarContato(pessoa1); // FUNÇÃO PARA ADICIONAR CONTATO
agenda.adicionarContato(pessoa2);

console.log('Contatos na agenda:', agenda.listarContatos()); // FUNÇÃO PARA LISTAR OS CONTATOS
//Contatos na agenda: [Contato {nome: 'Jorge', telefone: '11 9999-8888', email: 'jorge@dominio.com'} Contato {nome: 'Fabricio', telefone: '22 8888-7777', email: 'fabricio@dominio.com'}]

agenda.removerContato('Jorge'); // FUNÇÃO PARA REMOVER CONTATO

console.log('Contatos na agenda', agenda.listarContatos());
//Contato {nome: 'Fabricio', telefone: '22 8888-7777', email: 'fabricio@dominio.com'}]

const contatoEncontrado = agenda.pesquisarContato('Fabricio'); // FUNÇÃO PARA PESQUISAR O CONTATO

console.log('Contato encontrado:', contatoEncontrado);
// Contato encontrado: Contato {nome: 'Fabricio', telefone: '22 8888-7777', email: 'fabricio@dominio.com'}



// 4. Sistema Bancário:
//    - Crie uma classe `ContaBancaria` com propriedades como saldo e número da conta.
//    - Implemente métodos para depositar, sacar e verificar o saldo da conta.

class ContaBancaria {
    constructor(numero, saldoInicial = 0) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    depositar(valor) {
        if (valor > 0) {
            this.saldo += valor;
            console.log(`Depósito de R$${valor} realizado com sucesso.`);
        } else {
            console.log('Insira um número positivo.');
        }
    }

    sacar(valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            console.log(`Saque de R$${valor} realizado com sucesso.`);
        } else if (valor > this.saldo) {
            console.log('Saldo insuficiente.');
        } else {
            console.log('Insira um número positivo.');
        }
    }

    verificarSaldo() {
        console.log(`O saldo atual é R$${this.saldo}.`);
        return this.saldo;
    }
}

const minhaConta = new ContaBancaria(112509, 1000); // CRIAR NOVA CONTA BANCÁRIA

minhaConta.verificarSaldo();  // FUNÇÃO PARA VERIFICAR O SALDO
// O saldo atual é R$1000.

minhaConta.depositar(500);  // FUNÇÃO PARA DEPOSITAR NOVO VALOR
// Depósito de R$500 realizado com sucesso.

minhaConta.sacar(300); // FUNÇÃO PARA SACAR NOVO VALOR
// Saque de R$300 realizado com sucesso.

// 5. Loja Online:
//    - Crie uma classe `Produto` com propriedades como nome, preço e quantidade em estoque.
//    - Crie uma classe `CarrinhoDeCompras` que possa adicionar produtos, calcular o total da compra e finalizar a compra.

class Produto {
    constructor(nome, preco, quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
} 

class CarrinhoDeCompras {
    constructor() {
        this.produtos = [];
    }

    adicionarProduto(produto, quantidade) {
        if (produto.quantidadeEmEstoque >= quantidade) {
            this.produtos.push({ produto, quantidade });
            produto.quantidadeEmEstoque -= quantidade;
            console.log(`${quantidade} unidades do produto "${produto.nome}" foram adicionadas ao carrinho.`);
        } else {
            console.log(`Estoque insuficiente para o produto "${produto.nome}".`);
        }
    }

    calcularTotal() {
        return this.produtos.reduce((total, item) => total + item.produto.preco * item.quantidade, 0);
    }

    finalizarCompra() {
        const total = this.calcularTotal();
        if (total > 0) {
            console.log(`Compra finalizada. Total a pagar: R$${total.toFixed(2)}`);
            this.produtos = [];  
        } else {
            console.log('O carrinho está vazio.');
        }
    }
}

const produto1 = new Produto('Notebook', 3000, 5); // CRIAR NOVO PRODUTO

const carrinho = new CarrinhoDeCompras(); // CRIAR NOVO CARRINHO

carrinho.adicionarProduto(produto1, 2); // FUNÇÃO PARA ADICIONAR O PRODUTO E QUANTIDADE // 2 unidades do produto "Notebook" foram adicionadas ao carrinho.

const total = carrinho.calcularTotal();
console.log(`Total da compra: R$${total.toFixed(2)}`); // CALCULAR O TOTAL DA COMPRA // Total da compra: R$6000.00

carrinho.finalizarCompra(); // FUNÇÃO PARA FINALIZAR A COMPRA E LIMPAR O CARRINHO AUTOMATICAMENTE 
// Compra finalizada. Total a pagar: R$6000.00