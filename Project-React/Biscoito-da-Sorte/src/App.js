import React, { Component } from 'react';
import Botao from './Botao';
import imagemBiscoito from './assets/img/biscoito.png';
import Frases from './assets/js/frases';
import './assets/css/estilo.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {};

    this.frases = [...Frases];
  }

  render() {
    return (
      <div className="container">
        <img className="img" alt="Biscoito-da-sorte" src={imagemBiscoito} />
        <Botao className="botao" nome="Abrir biscoito" />
        <h3 className="textofrase"  >Frase Aleatoria..</h3>
      </div>
    );
  }
}


export default App;
