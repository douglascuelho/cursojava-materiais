// OBJETOS

const pessoa = {
    nome: 'Douglas',
    idade: 30
};
console.log(pessoa.nome);

pessoa.idade = 31;
console.log(pessoa['idade']);

pessoa.salario = 5000;
console.log(pessoa.salario);

pessoa['cidade'] = "São Paulo";

Object.assign(pessoa, {profissao: "Desenvolvedor", telefone: '(11) 99999-9999'});

console.log(pessoa);

//NOVO OBJETO - HERANÇA

const novaPessoa = {
    ...pessoa, // herdar os dados do objeto anterior
    email: 'douglas@dev.com.br',
    linkedin: "link"
}
console.log(novaPessoa);

// REMOVENDO PROPRIEDADES
delete novaPessoa.linkedin;

//ou
const {email, ...novaPessoa2} = novaPessoa; //cria um novo objeto apenas para remover
console.log(novaPessoa2);

const _ = require('lodash');
const novaPessoa3 = _.omit(novaPessoa2, ['idade']);
console.log(novaPessoa3);
// npm install lodash
delete pessoa.salario;

const novaPessoa4 = Object.fromEntries(
    Object.entries(novaPessoa3).filter(([key]) => key !== 'profissao')
);
console.log(novaPessoa4);

function removerPropriedade(obj, prop){
    const {[prop]: _, ...resto} = obj;
    return resto;
}
const novaPessoa5 = removerPropriedade(novaPessoa4,'salario');
console.log(novaPessoa5.salario);


...Spread Operator


// MÉTODOS
const alunos = {
    nome: 'Anajara',
    curso: 'Java Full',
    cumprimentar: function(){
        console.log("Olá " + this.nome + "!");
    }
}
alunos.cumprimentar();

function Pessoa(nome, altura, idade){
    this.nome = nome;
    this.altura = altura;
    this.idade = idade;
}

class Pessoa{
    constructor(nome, altura, idade){
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }
}

const aluno = new Pessoa('Thiago', 1.75, 33);
const aluno2 = new Pessoa('Thiago', 1.75, 33);

const alunos = {
    aluno1: aluno,
    aluno2: aluno2
};

console.log(alunos.aluno2.idade);
