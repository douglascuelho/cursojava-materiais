// //1. Verificação de Números:   - Crie um programa que verifica se um número é positivo, negativo ou zero.

let numero = 5;

console.log(
    numero > 0 ? "O número é positivo.":
    numero == 0 ? "O número é zero.":
    "O número é negativo."
);

// // -------------------------------
// // 2. Verificação de Par ou Ímpar:   - Escreva um programa que determina se um número é par ou ímpar.

let numero = 10;

if (numero % 2 == 0) {
    console.log("Este número é par.");
} else {
    console.log("Este número é ímpar.");
}

// -------------------------------
// 3. Calculadora Simples:   - Implemente uma calculadora que recebe dois números e uma operação (adição, subtração, multiplicação, divisão) e retorna o resultado.

function calculadora(num1, num2, operacao) {
    let resultado;

    switch (operacao) {
        case 'adição':
            resultado = num1 + num2;
            break;
        case 'subtração':
            resultado = num1 - num2;
            break;
        case 'multiplicação':
            resultado = num1 * num2;
            break;
        case 'divisão':
            if (num2 !== 0) {
                resultado = num1 / num2;
            } else {
                return "Não é possível dividir por zero.";
            }
            break;
        default:
            return "Inválido";
    }

    return `O resultado da ${operacao} é: ${resultado}`;
}

console.log(calculadora(10, 5, 'adição'));   

