// 1. **Soma de Dois Números**
//    - Crie uma arrow function que receba dois números e retorne a soma deles.

    const soma = (a, b) => a + b;
    console.log(soma(10,15)); //25

// 2. **Quadrado de um Número**
//    - Crie uma arrow function que receba um número e retorne o seu quadrado.

    const quadrado = x => x * x;
    console.log(quadrado(10)); //100

// 3. **Verificar Maioridade**
// - Crie uma arrow function que receba uma idade e retorne `"Maior de Idade"` se a idade for maior ou igual a 18 e `"Menor de Idade"` caso contrário.

    const verificarMaioridade = idade => idade >= 18 ? "Maior de Idade" : "Menor de Idade";
    console.log(verificarMaioridade(27)); //Maior de Idade

// 4. **Calcular Área do Retângulo**
//    - Crie uma arrow function que receba a largura e a altura de um retângulo e retorne a área.

const areaRetangulo = (largura, altura) => largura * altura;
console.log(areaRetangulo(10,2)); //20

// 5. **Convertendo para Maiúsculas**
//    - Crie uma arrow function que receba uma string e a retorne em maiúsculas.

const paraMaiusculas = str => str.toUpperCase();
console.log(paraMaiusculas("tudo maiusculo")); //TUDO MAIUSCULO

### Intermediário

// 6. **Filtrar Números Pares**
//    - Crie uma arrow function que receba um array de números e retorne um novo array contendo apenas os números pares.

const filtrarPares = numeros => numeros.filter(n => n % 2 === 0);
console.log(filtrarPares([1,2,3,4,5,6])); //[2,4,6]


// 7. **Calcular Média**
//    - Crie uma arrow function que receba um array de números e retorne a média dos números.

const calcularMedia = numeros => numeros.reduce((acc, num) => acc + num, 0) / numeros.length;

console.log(calcularMedia([10,20,10,20])); //15

// 8. **Verificar Palíndromo**
//    - Crie uma arrow function que receba uma string e retorne `true` se for um palíndromo e `false` caso contrário.

const verificarPalindromo = str => str === str.split('').reverse().join('');
console.log(verificarPalindromo("ovo")); //true
console.log(verificarPalindromo("onibus")); //false


// 9. **Dobrar Valores**
//    - Crie uma arrow function que receba um array de números e retorne um novo array com cada valor dobrado.

const dobrarValores = numeros => numeros.map(n => n * 2);
console.log(dobrarValores([2,4,6,8,10])); //[4,8,12,16,20]

// 10. **Calcular Fatorial**
//     - Crie uma arrow function que receba um número e retorne o seu fatorial.

const fatorial = n => n === 0 ? 1 : n * fatorial(n - 1);
console.log(fatorial(5)); //120

### Avançado

// 11. **Matriz Transposta**
//     - Crie uma arrow function que receba uma matriz (array de arrays) e retorne a sua transposta.

const transposta = matriz => matriz[0].map((_, colIndex) => matriz.map(row => row[colIndex]));

const matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

console.log(transposta(matriz)); //[ [1,4,7], [2,5,8], [3,6,9]]


// 12. **Remover Duplicatas**
//     - Crie uma arrow function que receba um array e retorne um novo array sem elementos duplicados.

const removerDuplicatas = arr => [...new Set(arr)];

console.log(removerDuplicatas([2,2,5,8,9,9,11,13])); //[ 2, 5, 8, 9, 11, 13 ]

// 13. **Mesclar Arrays**
//     - Crie uma arrow function que receba dois arrays e retorne um novo array contendo todos os elementos dos dois arrays, sem duplicatas.

const mesclarArrays = (arr1, arr2) => [...new Set([...arr1, ...arr2])];

const array1 = [1, 2, 3, 4];
const array2 = [3, 4, 5, 6];

console.log(mesclarArrays(array1, array2)); //[1, 2, 3, 4, 5, 6]

// 14. **Contar Ocorrências**
//     - Crie uma arrow function que receba uma string e retorne um objeto com a contagem de cada caractere na string.

const contarOcorrencias = str => str.split('').reduce((acc, char) => {
    acc[char] = acc[char] ? acc[char] + 1 : 1;
    return acc;
}, {});

console.log(contarOcorrencias("SoulCode")); //{ S: 1, o: 2, u: 1, l: 1, C: 1, d: 1, e: 1 }

// 15. **Compor Funções**
//     - Crie uma arrow function que receba duas funções `f` e `g` e retorne uma nova função que represente a composição `f(g(x))`.

const comporFuncoes = (f, g) => x => f(g(x));

const dobrar = x => x * 2;
const adicionarCinco = x => x + 5;

const dobrarEAdicionarCinco = comporFuncoes(adicionarCinco, dobrar);

console.log(dobrarEAdicionarCinco(10)); //25

// 16. **Filtrar Strings por Comprimento**
// Crie uma arrow function que receba um array de strings e um número, e retorne um novo array contendo apenas as strings que tenham um comprimento maior que o número fornecido.

const filtrarPorComprimento = (arr, num) => arr.filter(str => str.length > num);

const strings = ["banana", "uva", "melancia", "ovo", "farinha"];

console.log(filtrarPorComprimento(strings, 6)); //[ 'melancia', 'farinha' ]


// 17. **Remover Elementos Falsos**
// Crie uma arrow function que receba um array e retorne um novo array sem elementos "falsos" (`false`, `null`, `0`, `""`, `undefined`, `NaN`).

const removerElementosFalsos = arr => arr.filter(Boolean);

const array = [0, 1, false, 2, "", 3, null, "a", undefined, NaN, "b"];

console.log(removerElementosFalsos(array)); //[ 1, 2, 3, 'a', 'b' ]


// 18. **Encontrar Máximo em Array**
// Crie uma arrow function que receba um array de números e retorne o maior número encontrado no array.

const encontrarMaximo = arr => Math.max(...arr);

const numeros = [10, 5, 8, 21, 4, 15];

console.log(encontrarMaximo(numeros)); //21


// 19. **Concatenar Arrays**
// Crie uma arrow function que receba múltiplos arrays e retorne um novo array concatenando todos os elementos.

const concatenarArrays = (...arrays) => [].concat(...arrays);

const array1 = [1, 2, 3];
const array2 = [4, 5, 6];
const array3 = [7, 8, 9];

console.log(concatenarArrays(array1, array2, array3));
//[1, 2, 3, 4, 5, 6, 7, 8, 9]


// 20. **Somar Valores em Objeto**
// Crie uma arrow function que receba um array de objetos, cada um com uma propriedade `valor`, e retorne a soma de todos os valores.

const soma = arr => arr.reduce((acc, obj) => acc + obj.valor, 0);

const objetos = [
  { valor: 5 },
  { valor: 10 },
  { valor: 15 },
  { valor: 20 }
];

console.log(soma(objetos)); //50

// 21. **Inverter String**
// Crie uma arrow function que receba uma string e retorne a string invertida.

const inverterString = str => str.split('').reverse().join('');

const string = "Bootcamp";

console.log(inverterString(string)); // pmactooB


// 22. **Filtrar Valores Únicos**
// Crie uma arrow function que receba um array de números e retorne um novo array contendo apenas os valores únicos (sem duplicatas).

const filtrarValoresUnicos = array => [...new Set(array)];
const numeros = [1, 2, 3, 4, 2, 3, 5, 6, 1];

console.log(filtrarValoresUnicos(numeros)); // [1, 2, 3, 4, 5, 6]

// 23. **Contar Palavras em String**
// Crie uma arrow function que receba uma string e retorne o número de palavras na string.

const contarPalavras = (str) => str.split(/\s+/).length;

const texto = "Javascript é uma linguagem de programação.";
console.log(contarPalavras(texto)); //6


// 24. **Calcular Produto de Array**
// Crie uma arrow function que receba um array de números e retorne o produto de todos os números.

const calcularProduto = array => array.reduce((produto, numero) => produto * numero, 1);

const numeros = [1, 2, 5, 10];
console.log(calcularProduto(numeros)); // 100


// 25. **Combinar Propriedades de Objetos**
// Crie uma arrow function que receba dois objetos e retorne um novo objeto combinando todas as propriedades dos dois objetos.

const combinarObjetos = (obj1, obj2) => ({ ...obj1, ...obj2 });

const pessoa = { nome: "Douglas", idade: 27 };
const dados = { escola: "soulcode", modalidade: "online" };

console.log(combinarObjetos(pessoa, dados)); //{nome: 'Douglas', idade: 27, escola: 'soulcode', modalidade: 'online'}

// 26. **Converter Array para Objeto**
// Crie uma arrow function que receba um array de pares chave-valor e retorne um objeto.

const arrayParaObjeto = array => array.reduce((objeto, parChaveValor) => {
    const [chave, valor] = parChaveValor;
    objeto[chave] = valor;
    return objeto;
}, {});

const array = [['Joao', 18], ['Bruno', 22], ['Carlos', 23]];
console.log(arrayParaObjeto(array)); 
//{ Joao: 18, Bruno: 22, Carlos: 23 }


// 27. **Obter Chaves de Objeto**
// Crie uma arrow function que receba um objeto e retorne um array contendo todas as suas chaves.

const obterChaves = objeto => Object.keys(objeto);

const objeto = { a: 1, b: 2, c: 3 };
console.log(obterChaves(objeto)); // [ 'a', 'b', 'c' ]

// 28. **Obter Valores de Objeto**
// Crie uma arrow function que receba um objeto e retorne um array contendo todos os seus valores.

const obterValores = objeto => Object.values(objeto);

const objeto = { a: 1, b: 2, c: 3 };
console.log(obterValores(objeto)); // [1, 2, 3]

// 29. **Filtrar Números Ímpares**
// Crie uma arrow function que receba um array de números e retorne um novo array contendo apenas os números ímpares.

const filtrarNumerosImpares = array => array.filter(numero => numero % 2 !== 0);

const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9];
console.log(filtrarNumerosImpares(numeros)); // [1, 3, 5, 7, 9]

// 30. **Agrupar Elementos por Propriedade**
// Crie uma arrow function que receba um array de objetos e uma propriedade, e retorne um objeto agrupando os elementos por essa propriedade.

const agruparPorPropriedade = (array, propriedade) => {
    return array.reduce((grupo, objeto) => {
        const chave = objeto[propriedade];
        if (!grupo[chave]) {
            grupo[chave] = [];
        }
        grupo[chave].push(objeto);
        return grupo;
    }, {});
};

const objetos = [
    { nome: 'Maçã', cor: 'vermelho' },
    { nome: 'Banana', cor: 'amarelo' },
    { nome: 'Morango', cor: 'vermelho' },
    { nome: 'Limão', cor: 'verde' }
];

console.log(agruparPorPropriedade(objetos, 'cor'));
// {
//     vermelho: [
//       { nome: 'Maçã', cor: 'vermelho' },
//       { nome: 'Morango', cor: 'vermelho' }
//     ],
//     amarelo: [ { nome: 'Banana', cor: 'amarelo' } ],
//     verde: [ { nome: 'Limão', cor: 'verde' } ]
//   }