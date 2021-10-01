// Codigo relacionado com o Login

function entrar(){
    let usuario = document.querySelector('#usuario');
    let userLabel = document.querySelector('#userLabel');

    let senha = document.querySelector('#senha');
    let senhaLabel = document.querySelector('#senhaLabel');
    
    let listaUser = []; //

    let userValid = {
        nome: '',
        user: '',
        senha: '',
    }

    listaUser = JSON.parse(localStorage.getItem('listaUser'));

    listaUser.forEach((item) => {
        if(usuario.value == item.userCad && senha.value == item.senhaCad) {
            userValid = {
                nome: item.nomeCad,
                user: item.userCad,
                senha: item.senhaCad
            }
        }
    });

    if(usuario.value == userValid.user && senha.value == userValid.senha) {
        alert('login efetuado com Sucesso!');
        setTimeout(() => {
            window.location.href = 'http://localhost:3000/menu';
        }, 1000);

        let token = Math.random().toString(16).substr(2);
        localStorage.setItem('token', token);

    } else {
        alert('Login Invalid!!');
    };
};