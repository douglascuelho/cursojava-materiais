// Função Tradicional
function soma(a,b){
    return a+b;
}

// ARROW FUNCTIONS
const soma = (a,b) => a + b; //função de seta

// Com Retorno Implícito
const quadrado = x => x*x; 

// Formas de Arrow Functions
// Sem argumentos
const semArgumentos = () => console.log("Sem Argumentos.")

semArgumentos();

// Com um argumento
const umArgumento = x => x *2;
console.log(umArgumento(5));

// Com múltiplos argumentos
const multiplosArgumentos = (a,b) => a + b;
console.log(multiplosArgumentos(3, 4));

// Corpo de Função com Múltiplas Linhas
const soma = (a, b) => {
    const resultado = a + b;
    return resultado;
};
console.log (soma(2, 3));

// Funções sem retorno (void functions)

const logMensagem = mensagem => {
    console.log(mensagem);
};

logMensagem('Olá, mundo!');

// Funções com Objetos como Retorno
const criarObjeto = (chave, valor) =: ({ [chave]: [valor]});
console.log (criarObjeto('nome', 'João'));

// Funções Anônimas

const numeros = [1, 2, 3, 4, 5];

const dobrados = numeros.map(n => n*2); // o map faz o mapeamento do array
console.log(dobrados); //[2, 4, 6, 8, 10]

// Filtragem
const pares = numeros.filter(n => % 2 === 0);
console.log(pares); // [2, 4]

// Acumulador
const somaTotal = numeros.reduce((acumulador, n) => acumulador +n, 0); 
console.log(somaTotal); //15

// Funções como Propriedades de Objetos
const objeto = {
    valor: 42;
    mostrarValor: () => console.log(objeto.valor)
};
objeto.mostrarValor(); //42

// Funções de Ordem Superior
const multiplicarPor = fator => numero => numero * fator;

const multiplicarPorDois = multiplicarPor(2);
console.log(multiplicarPorDois(5)); //10

// Declaração com async
async function minhaFuncao() {
    return "Hello, World!";
}
minhaFuncao().then(console.log);

//
async function buscarDados() {
    let dados = await fetch("https://api.example.com/dados");
    let json = await dados.json();
    return json;
}
buscarDados().then(dados => console.log(dados));