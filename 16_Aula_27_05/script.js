// Declarar uma variável (let, var e const)

let nome;
let idade; 
var sexo;
const numero = 10;
 
//LET {} - tem que declarar
// "TEMPORAL DEAD ZONE"
let Nome;
let _nome;
let nome;
let nomeAluno;  //camelCase 

//Declaração
let nome; //undefined
// Inicialização
nome = "Adriano";

console.log(nome);

//Atualizando Variável

nome = "Adriano Gomes";

let idade = 25; // number 
let nome = "Joao"; // string
let ativo = true; // boolean
let semValor = null; // nulo
let indefinido = undefined; // undefined
let lista = [1, 2, 3, 4]; // array
let pessoa = {nome: "Carlos", idade: 20}; // object object

// OPERADORES ARITMÉTICOS
let a = 5 + 3; // Resultado: 8
let b = "Ola" + "Mundo"; // Resultado: "OlhaMundo"
let c = 10 - 5; // Resultado: 5
let d = 2 * 3; // Resultado: 6
let e = 10 / 2; // Resultado: 5
let f = 10 % 3; // Resultado: 1 (resto da divisao de 10 por 3 é 1) 

// OPERADORES DE INCREMENTO E DECREMENTO
/* 
    Pré-incremento (++x)
    Pré-drecemento (--x)
*/

let k = 5; //5
let z = ++k; //6
let h = 1 + k; //6

/* 
    Pós-incremento (x++)
    Pós-drecemento (x--)
*/

let k = 5; //5
let z = k++; //5
console.log(z);
console.log(k);

// OPERADORES DE ATRIBUIÇÃO (=)
// Atribuição com operação de adição (+=)
// Atribuição com operação de subtração (-=)
// Atribuição com operação de multiplicação (*=)
// Atribuição com operação de divisão (/=)
let valor = 5;
valor += 3; //8
valor *= 3; //15

// OPERADORES DE COMPARAÇÃO
// Igual (==)
let valor1 = 10;
let valor2 = 10;
console.log(valor1 == valor2); //true

//Igual estrito (===)
let valor1 = 10;
let valor2 = "10";
console.log(valor1 === valor2); //false

//Diferente (!=)
let valor1 = 10;
let valor2 = "10";
console.log(valor1 != valor2);

//Diferente estrito (!==)
let valor1 = 10;
let valor2 = "10";
console.log(valor1 !== valor2);

//Maior que (>), Maior ou igual a (>=), Menor que (<), Menor ou igual a (<=)

// OPERADORES LÓGICOS
// AND lógico (&&)
// OR lógico (||)
// NOT lógico (!)





//var 
//Hoisting(hoisted)
//Redeclaração


//const {} respeita o bloco de chaves
// Imutabilidade 

