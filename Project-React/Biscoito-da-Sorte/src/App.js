import React, { Component } from 'react';
import Botao from './Botao';
import imagemBiscoito from './assets/img/biscoito.png';
import Frases from './assets/js/frases';
import './assets/css/estilo.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      textoFrase: ''
    };

    this.quebraBiscoito = this.quebraBiscoito.bind(this);

    this.frases = [...Frases];
  }

  quebraBiscoito(){
    let state = this.state;
    let numeroAleatorio = Math.floor(Math.random() * this.frases.length);
    state.textoFrase = this.frases[numeroAleatorio];
    this.setState(state);
  }

  render() {
    return (
      <div className="container">
        <h1>Biscoito da Sorte!</h1>
        <img className="img" alt="Biscoito-da-sorte" src={imagemBiscoito} />
        <Botao className="botao" nome="Abrir biscoito" acaoBtn={this.quebraBiscoito} />
        <h3 className="textofrase" >" {this.state.textoFrase} "</h3>
      </div>
    );
  }
}


export default App;
