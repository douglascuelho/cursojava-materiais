
// 1. **Função de Saudação**:
//    - Crie uma função chamada `saudacao` que receba um nome como argumento e exiba uma mensagem de saudação no console.

    function saudacao(nome){
    console.log(`Olá, ${nome}!`)
}

saudacao("Fulano");

// 2. **Função de Soma**:
//    - Crie uma função chamada `soma` que receba dois números como argumentos e retorne a soma deles.

function soma(a, b){
    return a + b;
}

var a = 5;
var b = 5;
var resultado = soma(a,b);
console.log(`A soma de ${a} + ${b} é ${resultado}!`);


// 3. **Função de Subtração**:
//    - Crie uma função chamada `subtracao` que receba dois números como argumentos e retorne a subtração do segundo número pelo primeiro.

function subtracao(c, d){
    return d - c;
}

var c = 15;
var d = 25;
var resultado2 = subtracao(c,d);
console.log(`A subtração de ${d} - ${c} é ${resultado2}!`);


// 4. **Função de Multiplicação**:
//    - Crie uma função chamada `multiplicacao` que receba dois números como argumentos e retorne a multiplicação deles.

function multiplicacao(e, f){
    return e * f;
}

var e = 9;
var f = 9;
var resultado3 = multiplicacao(e,f);
console.log(`A multiplicação de ${e} x ${f} é ${resultado3}!`);


// 5. **Função de Divisão**:
//    - Crie uma função chamada `divisao` que receba dois números como argumentos e retorne a divisão do primeiro pelo segundo.

function divisao(g, h){
    return g / h;
}

var g = 100;
var h = 5;
var resultado4 = divisao(g, h);
console.log(`A divisão de ${g} por ${h} é ${resultado4}!`);

// 6. **Função de Fatorial**:
//    - Crie uma função chamada `fatorial` que receba um número como argumento e retorne o fatorial desse número.

function fatorial(numero) {
    if (numero < 0) {
        return "Insira um número positivo.";
    }
    let resultado = 1;
    for (let i = 1; i <= numero; i++) {
        resultado *= i;
    }
    return resultado;
}

console.log(fatorial(10));

// 7. **Função para Verificar Número Primo**:
//    - Crie uma função chamada `ePrimo` que receba um número como argumento e retorne `true` se o número for primo e `false` caso contrário.

function ePrimo(numero) {
    if (numero <= 1) {
        return false; 
    }
    for (let i = 2; i < numero; i++) {
        if (numero % i === 0) {
            return false; 
        }
    }
    return true; 
}

console.log(ePrimo(2));

// 8. **Função para Calcular Média**:
//    - Crie uma função chamada `media` que receba um array de números como argumento e retorne a média dos números.

function media(b1,b2,b3,b4){
    let resultado = (b1+b2+b3+b4)/4;
    return resultado; 
}

console.log(media(10,8,7,10));

// 9. **Função para Inverter String**:
//    - Crie uma função chamada `inverterString` que receba uma string como argumento e retorne a string invertida.

function inverterString(str) {
    return str.split('').reverse().join('');
}

let minhaString = "Olá, mundo!";
let stringInvertida = inverterString(minhaString);
console.log(`A escrita invertida de "${minhaString}" é "${stringInvertida}"`);


// 10. **Função para Contar Caracteres**:
//     - Crie uma função chamada `contarCaracteres` que receba uma string e um caractere como argumentos e retorne o número de vezes que o caractere aparece na string.

function contarCaracteres(str, char) {
    let count = 0;
    for (let i = 0; i < str.length; i++) {
        if (str[i] === char) {
            count++;
        }
    }
    return count;
}

const stringPalavra = "soulcode";
const caractere = 'o';
const resultado = contarCaracteres(stringPalavra, caractere);
console.log(`O caractere "${caractere}" aparece ${resultado} vezes na string "${stringPalavra}".`);

// 11. **Função Anônima**:
//     - Crie uma função anônima e atribua-a a uma variável chamada `multiplicar`. A função deve receber dois números como argumentos e retornar a multiplicação deles.

const multiplicar = function(a, b) {
    return a * b;
};

const resultado = multiplicar(10, 10);
console.log(`O resultado da multiplicação é: ${resultado}`);

// 12. **Função de Ordem Superior**:
//     - Crie uma função chamada `operacao` que receba dois números e uma função como argumentos. A função deve aplicar a função fornecida aos dois números e retornar o resultado.

function operacao(num1, num2, func) {
    return func(num1, num2);
}

const soma = function(a, b) {
    return a + b;
};

const multiplicacao = function(a, b) {
    return a * b;
};

const resultadoSoma = operacao(8, 8, soma);
console.log(`O resultado da soma é: ${resultadoSoma}`);

const resultadoMultiplicacao = operacao(8, 8, multiplicacao);
console.log(`O resultado da multiplicação é: ${resultadoMultiplicacao}`);

// 13. **Função de Retorno**:
//     - Crie uma função chamada `criarSaudacao` que receba uma saudação como argumento e retorne uma nova função. A função retornada deve receber um nome como argumento e exibir a saudação seguida pelo nome.

function criarSaudacao(saudacao) {
    return function(nome) {
        console.log(`${saudacao}, ${nome}! Tudo bem?`);
    };
}

const saudacaoBomDia = criarSaudacao('Bom dia');
saudacaoBomDia('João'); 

// 14. **Função Recursiva**:
//     - Crie uma função chamada `contagemRegressiva` que receba um número como argumento e exiba uma contagem regressiva a partir desse número até 0, usando recursão.

function contagemRegressiva(num) {
    if (num < 0) {
        return;
    }
    console.log(num);
    contagemRegressiva(num - 1);
}

contagemRegressiva(10); 

// 15. **Função para Calcular Fibonacci**:
//     - Crie uma função chamada `fibonacci` que receba um número `n` como argumento e retorne o `n`-ésimo número da sequência de Fibonacci.

function fibonacci(n) {
    if (n === 0) {
        return 0;
    }
    if (n === 1) {
        return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

console.log(fibonacci(10));  

// 16. **Função para Converter Celsius para Fahrenheit**:
//     - Crie uma função chamada `celsiusParaFahrenheit` que receba uma temperatura em Celsius e retorne a temperatura convertida para Fahrenheit.

function celsiusParaFahrenheit(celsius) {
    return (celsius * 9/5) + 32;
}

const tempCelsius = 30;
const tempFahrenheit = celsiusParaFahrenheit(tempCelsius);
console.log(`${tempCelsius}°C é equivalente a ${tempFahrenheit}°F.`);

// 17. **Função para Converter Fahrenheit para Celsius**:
//     - Crie uma função chamada `fahrenheitParaCelsius` que receba uma temperatura em Fahrenheit e retorne a temperatura convertida para Celsius.

function fahrenheitParaCelsius(fahrenheit) {
    return (fahrenheit - 32) * 5/9;
}

const tempFahrenheit = 77;
const tempCelsius = fahrenheitParaCelsius(tempFahrenheit);
console.log(`${tempFahrenheit}°F é equivalente a ${tempCelsius.toFixed(2)}°C.`);

// 18. **Função para Verificar Paridade**:
//     - Crie uma função chamada `ePar` que receba um número como argumento e retorne `true` se o número for par e `false` caso contrário.

function ePar(numero) {
    return numero % 2 === 0;
}

console.log(ePar(5));  

// 19. **Função para Calcular Quadrado**:
//     - Crie uma função chamada `quadrado` que receba um número como argumento e retorne o quadrado desse número.

function quadrado(numero) {
    return numero * numero;
}

console.log(quadrado(5));

// 20. **Função para Calcular Raiz Quadrada**:
//     - Crie uma função chamada `raizQuadrada` que receba um número como argumento e retorne a raiz quadrada desse número.

function raizQuadrada(numero) {
    return Math.sqrt(numero);
}

console.log(raizQuadrada(49));

// 21. **Função para Contar Vogais**:
//     - Crie uma função chamada `contarVogais` que receba uma string como argumento e retorne o número de vogais na string.

function contarVogais(str) {
    const vogaisIdent = /[aeiou]/gi; 
    const vogaisEncontradas = str.match(vogaisIdent);
    return vogaisEncontradas ? vogaisEncontradas.length : 0;
}

console.log(contarVogais("JavaScript é uma linguagem de programação.")); 

// 22. **Função para Verificar Palíndromo**:
//     - Crie uma função chamada `ePalindromo` que receba uma string como argumento e retorne `true` se a string for um palíndromo e `false` caso contrário.

function ePalindromo(str) {
    const palavraSemEspacos = str.toLowerCase().replace(/[^a-z0-9]/g, '');
    const palavraInvertida = palavraSemEspacos.split('').reverse().join('');
    return palavraSemEspacos === palavraInvertida;
}

console.log(ePalindromo("ovo"));  
console.log(ePalindromo("morango"));     

// 23. **Função para Encontrar o Maior Número em um Array**:
//     - Crie uma função chamada `maiorNumero` que receba um array de números como argumento e retorne o maior número do array.

function maiorNumero(array) {
    if (array.length === 0) {
        return undefined; 
    }
    let maior = array[0]; 
    for (let i = 1; i < array.length; i++) {
        if (array[i] > maior) {
            maior = array[i]; 
        }
    }
    return maior;
}

console.log(maiorNumero([35, 45, 20, 18, 15])); 

// 24. **Função para Ordenar um Array em Ordem Crescente**:
//     - Crie uma função chamada `ordenarArray` que receba um array de números como argumento e retorne o array ordenado em ordem crescente.

function ordenarArray(array) {
    return array.sort(function(a, b) {
        return a - b;
    });
}

console.log(ordenarArray([250, 100, 285, 115, 89]));

// 25. **Função para Filtrar Números Pares**:
//     - Crie uma função chamada `filtrarPares` que receba um array de números como argumento e retorne um novo array contendo apenas os números pares.

function filtrarPares(array) {
    return array.filter(function(numero) {
        return numero % 2 === 0;
    });
}

console.log(filtrarPares([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]));

// 26. **Função para Concatenar Arrays**:
//     - Crie uma função chamada `concatenarArrays` que receba dois arrays como argumentos e retorne um novo array que seja a concatenação dos dois arrays.

function concatenarArrays(array1, array2) {
    return array1.concat(array2);
}

console.log(concatenarArrays([10, 20, 30], [40, 50, 60]));

// 27. **Função de Memoização para Fatorial**:
//     - Crie uma função chamada `memoFatorial` que usa memoização para otimizar o cálculo do fatorial.

function memoFatorial() {
    const memo = {};
    
    function fatorial(n) {
        if (n === 0 || n === 1) {
            return 1;
        }
        if (memo[n] !== undefined) {
            return memo[n];
        }
        memo[n] = n * fatorial(n - 1);
        return memo[n];
    }
    
    return fatorial;
}

const memoFatorialCalcula = memoFatorial();

console.log(memoFatorialCalcula(5)); 

// 28. **Função para Verificar Substring**:
//     - Crie uma função chamada `contemSubstring` que receba duas strings como argumentos e retorne `true` se a primeira string contiver a segunda string, e `false` caso contrário.

function contemSubstring(str1, str2) {
    return str1.includes(str2);
}

console.log(contemSubstring("Soulcode", "code"));

// 29. **Função de Curry**:
//     - Crie uma função chamada `currySoma` que usa currying para somar três números. A função deve ser chamada assim: `currySoma(a)(b)(c)`.

function currySoma(a) {
    return function(b) {
        return function(c) {
            return a + b + c;
        };
    };
}

console.log(currySoma(5)(5)(5));

// 30. **Função para Reduzir um Array**:
//     - Crie uma função chamada `reduzirArray` que receba um array de números e uma função de redução (callback) como argumentos e retorne o valor reduzido.

function reduzirArray(array, callback) {
    let resultado = array[0]; 
    for (let i = 1; i < array.length; i++) {
        resultado = callback(resultado, array[i]);
    }
    return resultado;
}

const array = [1, 2, 3, 4, 5];
const soma = (a, b) => a + b;
console.log(reduzirArray(array, soma));

// 31. **Função para Remover Duplicatas de um Array**:
//     - Crie uma função chamada `removerDuplicatas` que receba um array como argumento e retorne um novo array sem duplicatas.

function removerDuplicatas(array) {
    return array.filter((item, index) => array.indexOf(item) === index);
}

const arrayComDuplicatas = [0, 1, 1, 2, 3, 5, 8, 13, 21];
const arraySemDuplicatas = removerDuplicatas(arrayComDuplicatas);
console.log(arraySemDuplicatas); 

// 32. **Função de Composição**:
//     - Crie uma função chamada `compor` que receba duas funções como argumentos e retorne uma nova função que é a composição das duas.

function compor(funcao1, funcao2) {
    return function(...args) {
        return funcao2(funcao1(...args));
    };
}

const adicionarDois = x => x + 2;
const multiplicarPorTres = x => x * 3;

const composta = compor(adicionarDois, multiplicarPorTres);
console.log(composta(5));

// 33. **Função para Mapear um Array**:
//     - Crie uma função chamada `mapearArray` que receba um array e uma função de mapeamento (callback) como argumentos e retorne um novo array com os resultados da função de mapeamento aplicada a cada elemento.

function mapearArray(array, callback) {
    return array.map(callback);
}

const arrayOriginal = [10, 20, 30, 40, 50];
const dobrar = numero => numero * 2;

const arrayMapeado = mapearArray(arrayOriginal, dobrar);
console.log(arrayMapeado); 

// 34. **Função de Ordenação Personalizada**:
//     - Crie uma função chamada `ordenarPersonalizado` que receba um array de objetos e uma função de comparação (callback) como argumentos e retorne o array ordenado.

function ordenarPersonalizado(array, callback) {
    return array.sort(callback);
}

const pessoas = [
    { nome: 'Douglas', idade: 27 },
    { nome: 'Izaias', idade: 23 },
    { nome: 'João', idade: 20 }
];

const compararPorIdade = (pessoa1, pessoa2) => pessoa1.idade - pessoa2.idade;

const pessoasOrdenadas = ordenarPersonalizado(pessoas, compararPorIdade);
console.log(pessoasOrdenadas);

// 35. **Função para Encontrar a Intersecção de Dois Arrays**:
//     - Crie uma função chamada `intersecaoArrays` que receba dois arrays como argumentos e retorne um novo array contendo os elementos que são comuns aos dois arrays.

function intersecaoArrays(array1, array2) {
    return array1.filter(item => array2.includes(item));
}

const array1 = ["Soulcode", "Programação", "Tecnologia", "Javascript"];
const array2 = ["Javascript", "Linguagem", "Programação", "Profissional"];

const intersecao = intersecaoArrays(array1, array2);
console.log(intersecao); 