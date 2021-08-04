
function Mudarestado(el) {
    var display = document.getElementById(el).style.display;
    var botao = document.getElementById("btn");

    if (display == "none") {
        document.getElementById(el).style.display = 'block';
        botao.innerHTML = "Esconder";
    } else {
        document.getElementById(el).style.display = 'none';
        botao.innerHTML = "Mostrar";
    }
}


function checar() {
    var botoes = document.getElementsByName("profissao");

    for (var i = 0 in botoes)
        if (botoes[i].checked)
            alert("Escolheu: " + botoes[i].value);


}
/* Script para mostar e esconder profissão com HIDDEN */
function mostrar(){
    for (var i=1;i<5;i++) {
        document.getElementById("c"+i).hidden=true;
    }
    var obj=event.target.dataset.nome;
    document.getElementById(obj).hidden=false;
}


function inicia(){
    for (var i=1;i<5;i++) {
        document.getElementById("c"+i).hidden=true;

    document.getElementById("b1").addEventListener("click",mostrar);
    document.getElementById("b2").addEventListener("click",mostrar);
    document.getElementById("b3").addEventListener("click",mostrar);
    document.getElementById("b4").addEventListener("click",mostrar);
        
    }
}

window.addEventListener("load",inicia);




