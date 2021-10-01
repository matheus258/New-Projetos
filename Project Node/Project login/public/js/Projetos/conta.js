if(localStorage.getItem('token') == null) {
    alert('Você precisa estar Logado!!');
    setTimeout(() => { }, 1000);
    window.location.href = 'http://localhost:3000/';
}

//Apaga Token e Volta para tela de Cadastro.
function voltarMenu(){
    window.location.href = 'http://localhost:3000/menu';
};

//Preço das frutas sem desconto;
const precoMaca = 1.8;
const precoMorango = 2.5;



function buscaPreco(){

    let totalMorango = 0;
    let totalMaca = 0;
    let final = 0;

    const pesoMorango = document.getElementById('pesoMorango').value;
    const pesoMaca = document.getElementById('pesoMaca').value;
    
    //Desconto no preço pelo peso;
    if(pesoMorango > 5){
        totalMorango = ((precoMorango - 0.3) * pesoMorango);
    } else {
        totalMorango = precoMorango * pesoMorango;
    }

    if(pesoMaca > 5){
        totalMaca = ((precoMaca - 0.3) * pesoMaca);
    } else {
        totalMaca = precoMaca * pesoMaca;
    }

    if((totalMorango + totalMaca > 25) || (pesoMorango + pesoMaca > 8)){
        final = (totalMorango + totalMaca) * 0.9;
    } else {
        final = totalMorango + totalMaca;
    }

    document.getElementById('caixaResp').innerText = `Valor Total: R$ ${final.toFixed(2)}`;
    
};