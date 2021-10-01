if(localStorage.getItem('token') == null) {
    alert('Você precisa estar Logado!!');
    setTimeout(() => { }, 1000);
    window.location.href = 'http://localhost:3000/';
};

//Apaga Token e Volta para tela de Cadastro.
function sair(){
    localStorage.removeItem('token');
    window.location.href = 'http://localhost:3000/';
};
