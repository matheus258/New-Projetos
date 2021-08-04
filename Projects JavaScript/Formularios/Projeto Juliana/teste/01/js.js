function Mudarestado(el) {
    var display = document.getElementById(el).style.display;
    var botao = document.getElementById("btn");
    
    if (display == "none") {
        document.getElementById(el).style.display = 'block';
        
    } else {
        document.getElementById(el).style.display = 'none';
        
    }
}

function teste() {
    var botoesTeste = document.getElementsByName("profissao");
    

    if (botoesTeste == true) {
        document.getElementById(el).style.display = 'block';
    } else {
        document.getElementById(el).style.display = 'none';   
    }
}
function testeChecar(el)
{
    var botoes = document.getElementsByName("profissao");
    var botao = document.getElementById("btn");

    for (var i = 0 in botoes) 
            if (botoes[i].checked)
                if (display == "none") {
                    document.getElementById(el).style.display = 'block';
        
                    } else {
                    document.getElementById(el).style.display = 'none';
        
    }
}