//Parametros
let validNome = true;
let validUsuario = true;
let validSenha = true;
let validConfirmSenha = true;


function cadastrar() {
    if(validNome && validUsuario && validSenha && validConfirmSenha) {
        let listaUser = JSON.parse(localStorage.getItem('listaUser')||'[]');

        listaUser.push(
        {
            nomeCad: nome.value,
            userCad: usuario.value,
            senhaCad: senha. value
        }    
        )

        localStorage.setItem('listaUser', JSON.stringify(listaUser));
        alert('Cadastrado com Sucesso!!'); 
        setTimeout(() => {
            window.location.href = 'http://localhost:3000/';
        }, 1000);
        
    } else {
       alert('Preencha todos os campos vazios!!'); 
    }
    
};