// Funções - functions

console.log("Hello World");
console.log("!!!!!!");

function boasVindas(){
    console.log("Hello World");
    console.log("!!!!!!");
}

boasVindas()

boasVindas()

boasVindas()

//Sintaxe

/* function <nome da função> (<parametros>){
    ...corpo da função
}
*/

//Escopo 
function exemplo1(){
    let x = 5;
    let y = 10;
    console.log(`A soma é: ${x+y}`)
}
exemplo1();

let x = 5;
let y = 10;
function exemplo2(){
    console.log(`A soma é: ${x+y}`)
}
exemplo2();

function exemplo3(a, b){
    console.log(`A soma é: ${a+b}`)
}
exemplo3(10,25);

//exemplo 4

function soma(a,b,c){
    console.log(`A soma é: ${a+b+c}`)
}
soma(12,10,8); //30
soma(15,20,25); //60

//exemplo 5

function soma(a,b,c){
    console.log(`A soma é: ${a+b+c}`)
}

const resultado = soma(1,2,3);
const a = 5;
const b = 7;
const result = soma(a,b,2);
const resultado2 = soma(1+1, 2+5, 3+9);

//exemplo 6
function calculadora(a,b,c){
    console.log(`A soma é ${a+b+c}`);
    console.log(`A subtração é ${a-b-c}`);
    console.log(`A multiplicação é ${a*b*c}`);
    console.log(`A divisão é ${a/b/c}`);
}

calculadora(10,5,2);

// RETORNO

function media(n1,n2,n3){
    let resultado = (n1+n2+n3)/3;
    // console.log(`A média é ${resultado}`);
    return resultado; // indicando para externalizar o resultado para fora da função
}

console.log(media(10,8,7));

//ou

function media(n1,n2,n3){
    return (n1+n2+n3)/3;
}
console.log(media(10,8,7));

//

function estaAprovado(n1, n2, n3) {
    let med = media(n1, n2, n3);
    if (med >= 7) {
    console.log("Aprovado!");
    return true;
    } else {
    console.log("Reprovado!");
    return false;
    }
 }
 estaAprovado(10,7,6);