function verificarIdade(){
    var idade = document.getElementById('idade').value;
    var resultado = document.getElementById('resultado');

    if(idade >=0 && idade <=12){
        resultado.textContent = "Criança";
    } else if(idade > 12 && idade < 18){
        resultado.textContent = "Adolescente";
    } else if (idade >= 18 && idade < 60){
        resultado.textContent = "Adulto";
    } else if (idade >= 60 && idade <=120){
        resultado.textContent = "Idoso";
    } else{
        resultado.textContent = "Idade Inválida";
    }
}

function verificarMes(){
    var mes = document.getElementById('mes').value;
    var resultado = document.getElementById('resultado2');

    switch(mes){
        case "1":
            resultado.textContent = "Janeiro: Primeiro Mês do Ano.";
            break;
        case "2":
            resultado.textContent = "Fevereiro: Segundo Mês do Ano.";
            break;
        case "3":
            resultado.textContent =  "Março: Terceiro Mês do Ano.";
            break;
        case "4": 
            resultado.textContent = "Abril: Quarto Mês do Ano.";
            break;
        case "5":
            resultado.textContent = "Maio: Quinto Mês do Ano.";
            break;
        case "6":
            resultado.textContent = "Junho: Sexto Mês do Ano.";
            break;
        case "7":
            resultado.textContent = "Julho: Sétimo Mês do Ano.";
            break;
        case "8":
            resultado.textContent = "Agosto: Oitavo Mês do Ano.";
            break;
        case "9":
            resultado.textContent = "Setembro: Nono Mês do Ano.";
            break;
        case "10":
            resultado.textContent = "Outubro: Décimo Mês do Ano.";
            break;
        case "11":
            resultado.textContent = "Novembro: Décimo Primeiro Mês do Ano.";
            break;
        case "12":
            resultado.textContent = "Dezembro: Décimo Segundo Mês do Ano.";
            break;
        default:
            resultado.textContent = "Mês Inválido";
    }
}