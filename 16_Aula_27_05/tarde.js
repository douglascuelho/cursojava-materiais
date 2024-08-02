//ESTRUTURAS CONDICIONAIS
//IF.... ELSE

// // Condicionais Simples
let idade = 18;
if(idade >= 18){
    console.log("Maior de Idade");
}

// // Condicionais Compostas
let idade = 18;
if(idade >= 18){
    console.log("Maior de Idade");
} else{
    console.log("Menor de Idade");
}

console.log(idade >= 18 ? "Maior de Idade": "Menor de Idade")

// Condicionais Encadeadas
/* 
    Menor que 12 anos --- Criança (if)
    Menor que 18 anos --- Adolescente (else if)
    Maior que 18 anos --- Adulto (else if)
    Maior que 60 anos --- Idoso (else)
*/

let idade = 18;

if(idade >=0 && idade <= 12){
    console.log("Criança");
} else if (idade >12  && idade < 18){
    console.log ("Adolescente");
} else if (idade >=18 && idade <60){
    console.log("Adulto");
}else if (idade >=60 && idade <=120){
    console.log("Idoso");
}else{
    console.log("Idade Inválida");
}

console.log(
    idade >=0 && idade <=12 ? "Criança":
    idade >=12 && idade <=18 ? "Adolescente":
    idade >=18 && idade <=60 ? "Adulto":
    idade >=60 && idade <=120 ? "Idoso":
    "Idade Inválida"
);

// ESTRUTURA DE SELEÇÃO
// switch...case
let dia = 5;
switch(dia){
    case 1: 
        console.log("Domingo");
        break;
    case 2: 
        console.log("Segunda-Feira");
        break;
    case 3: 
        console.log("Terça-Feira");
        break;
    case 4: 
        console.log("Quarta-Feira");
        break;
    case 5: 
        console.log("Quinta-Feira");
        break;
    default:
        console.log("Dia inválido");
}
