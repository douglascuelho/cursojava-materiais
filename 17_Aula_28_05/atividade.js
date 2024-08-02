// Soma dos Números: Crie um programa que solicita ao usuário um número inteiro positivo N e, em seguida, calcula a soma dos números de 1 a N utilizando um loop.

let N = 10;
let soma = 0;

for (let i = 1; i <= N; i++) {
    soma += i;
}
console.log("A soma dos números de 1 a " + N + " é: " + soma);


// Tabuada: Escreva um programa que pede ao usuário para inserir um número e imprime a tabuada desse número de 1 a 10 usando um loop.

let number = 55;

for (let i = 1; i <= 10; i++) {
    let tabuadaMultiplicacao = number * i;

    console.log(number + " x " + i + " = " + tabuadaMultiplicacao);
}

// Fatorial: Implemente um programa que solicita um número inteiro não negativo e calcula o fatorial desse número usando um loop. 

let numeroInteiro = 5;
let fatorial = 1;

if (numeroInteiro < 0) {
    console.log("Por favor, insira um número positivo.");
} else {
        for(let i = 1; i <= numeroInteiro; i++){
        fatorial *= i;
   }
   console.log("O fatorial de " + numeroInteiro + " é " + fatorial + ".");
}

// Números Primos: Desenvolva um programa que recebe um número inteiro positivo e verifica se é um número primo.

let numInteiro = 10;

let ehPrimo = true;
if (numInteiro <= 1) {
    ehPrimo = false;
} else {
    for (let i = 2; i < numInteiro; i++) {
        if (numInteiro % i === 0) {
            ehPrimo = false;
            break; 
        }
    }
}

if (ehPrimo) {
    console.log(numInteiro + " é um número primo.");
} else {
    console.log(numInteiro + " não é um número primo.");
}

// Série Fibonacci: Crie um programa que gera os primeiros N termos da série Fibonacci, onde N é fornecido pelo usuário.

let N = ;

// Média de Notas: Faça um programa que solicita ao usuário que insira as notas de alunos em uma disciplina e calcula a média dessas notas. O programa deve continuar pedindo notas até que o usuário decida parar.