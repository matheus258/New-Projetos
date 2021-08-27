
function getTime(segundos) {
     const data = new Date(segundos * 1000);
     return data.toLocaleTimeString('pt-BR', {
         hour12: false, 
         timeZone: 'GMT',
     });
}

const relogio = document.querySelector('.relogio');
const iniciar = document.querySelector('.iniciar');
const pausar = document.querySelector('.pausar');
const zerar = document.querySelector('.zerar');

let segundos = 0;
let timer;

function iniciaRelogio() {
     timer = setInterval(function () {
        segundos++;
        relogio.innerHTML = getTime(segundos);
    }, 1000);
}

document.addEventListener('click', function(e){
    const el = e.target;
    if(el.classList.contains('iniciar')){
        clearInterval(timer);
        iniciaRelogio();
        relogio.classList.remove('pausado');
    }
    if(el.classList.contains('pausar')){
        clearInterval(timer);
        relogio.classList.add('pausado');
    }
    if(el.classList.contains('zerar')){
        clearInterval(timer);
        relogio.innerHTML = '00:00:00'
        segundos = 0;
        relogio.classList.remove('pausado');
    }
    
});
