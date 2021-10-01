if(localStorage.getItem('token') == null) {
    alert('Você precisa estar Logado!!');
    setTimeout(() => { }, 1000);
    window.location.href = 'http://localhost:3000/';
}
//Apaga Token e Volta para tela de Cadastro.
function voltarMenu(){
    window.location.href = 'http://localhost:3000/menu';
}

//capturar envio  do  formulário.
const form = document.querySelector("#formulario");

 function imcCompleto() {
    

    const inputAltura = document.getElementById('altura');
    const inputPeso = document.getElementById('peso');


    const peso = Number(inputPeso.value);
    const altura = Number(inputAltura.value);

    if (!altura && !peso) {
        setResultado('Peso e altura são inválidos', false);
        return;
    }
    if (!peso) {
        setResultado('Peso inválido', false);
        return;
    }
    if (!altura) {
        setResultado('Altura inválida', false);
        return;
    }

    const imc = getImc(peso, altura);
    const nivelImc = getNivelImc(imc);

    const msg = `Seu IMC é ${imc} (${nivelImc}).`;

    setResultado(msg, true);
    
};

function getNivelImc (imc){
    //array para guardar informações sobre IMC;
    const nivel = ['Abaixo do peso', 'Peso normal', 'Sobrepeso', 'Obesidade grau 1', 'Obesidade grau 2', 'Obesidade grau 3'];

    if(imc >= 39.9)  return nivel[5];
    if(imc >= 34.9)  return nivel[4];
    if(imc >= 29.9)  return nivel[3]; 
    if(imc >= 24.9)  return nivel[2];
    if(imc >= 18.5)  return nivel[1];
    if(imc < 18.5)   return nivel[0];
    
};

function getImc(peso, altura) {
    const imc = peso / altura ** 2;
    return imc.toFixed(2);
};

function criaP() {
    const p = document.createElement('p');
    return p;
};

function setResultado (msg, isValid) {
    const resultado = document.querySelector('#resultado');
    resultado.innerHTML = '';
    const p = criaP();
    
    if (isValid) {
        p.classList.add('paragrafo-resultado')
    }
    else {
        p.classList.add('bad')
    }
    p.innerHTML = msg;
    resultado.appendChild(p);
    
};