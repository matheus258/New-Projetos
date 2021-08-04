function mostrar(){
    for (var i=1;i<5;i++) {
        document.getElementById("c"+i).hidden=true;
    }
    var obj=event.target.dataset.nome;
    document.getElementById(obj).hidden=false;
}

function rolar(){

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