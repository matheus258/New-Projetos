const express = require('express');
const app = express();

app.use(express.static('public'));
app.set('view engine', 'ejs');

//Rotas da pagina
app.get('/', (req, res) => {
    //res.send('HTML');
    res.render("../public/views/home");
});

app.get('/cadastro', (req, res) => {
    res.render("../public/views/cadastro");
});

app.get('/menu', (req, res) => {
    res.render("../public/views/menu");
});

//Projetos
app.get('/menu/conversor', (req, res) => {
    res.render("../public/views/Projetos/conversor");
});
app.get('/menu/IMC', (req, res) => {
    res.render("../public/views/Projetos/imc");
});
app.get('/menu/compras', (req, res) => {
    res.render("../public/views/Projetos/conta");
});

//Porta do servidor.
app.listen('3000', () => {
    console.log('Servidor executando na porta 3000.');
    console.log('Para fechar o server CTRL + C.');
});