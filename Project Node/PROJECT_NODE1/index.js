//importa módulos e bibliotecas
const http = require('http');

const msg_home = require('./mod_home');
const msg_contato = require('./mod_contato');
const msg_sobre = require('./mod_sobre');

//criamos um servidor como argumento e uma função anónima que vai receber uma requisição como resposta.
let server = http.createServer(function (req, res) {
    
    let categoria = req.url
    if(categoria == '/sobre'){
        res.end(msg_sobre);
    }else if(categoria == '/contato'){
        res.end(msg_contato);
    }else{
        //normalmente a resposta para uma requisição HTTP é um arquivo HTML para
        res.end(msg_home);
    }
    
    
});
//Fica escutando a porta 3000, aguardando uma requisição
server.listen(3000, () => {
    console.log("Servidor escutando na porta 3000");
    console.log("Pressione CTRL + C para encerrar");
});


