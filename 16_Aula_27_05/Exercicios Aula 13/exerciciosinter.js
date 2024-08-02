// //4. Idade e Categoria:   - Crie um programa que determina a categoria de uma pessoa baseada na idade (criança, adolescente, adulto, idoso).

// let idade = 25;

// console.log(
//     idade >=0 && idade <=12 ? "Criança":
//     idade >=12 && idade <=18 ? "Adolescente":
//     idade >=18 && idade <=60 ? "Adulto":
//     idade >=60 && idade <=120 ? "Idoso":
//     "Idade Inválida"
// );

// // 5. Conversor de Notas:   - Escreva um programa que converte notas numéricas em conceitos (A, B, C, D, F) baseado em um sistema de pontuação.

// let nota = 95;

// console.log(
//     nota >=0 && nota <=10 ? "F-":
//     nota >=11 && nota <=20 ? "F+":
//     nota >=21 && nota <=30 ? "D-":
//     nota >=31 && nota <=40 ? "D+":
//     nota >=41 && nota <=50 ? "C-":
//     nota >=51 && nota <=60 ? "C+":
//     nota >=61 && nota <=70 ? "B-":
//     nota >=71 && nota <=80 ? "B+":
//     nota >=81 && nota <=90 ? "A-":
//     nota >=91 && nota <=100 ? "A+":
//     "Nota inválida"
// );

//6. Cálculo de Desconto:   - Desenvolva um programa que calcula o valor final após aplicar um desconto a um determinado preço.

let valorNormal = 5000;
let desconto = 0.25;
let valorDesconto = valorNormal * desconto;
let valorFinal = valorNormal - valorDesconto;

console.log("O valor deste produto com desconto é de " + valorFinal);