import React, { Component } from 'react';

class Botao extends Component{
    render(){
      return(
        <div className="botao">
          <button className="botao-sorte" onClick={this.props.acaoBtn}> { this.props.nome } </button>
        </div>
      );
    }
  }

  export default Botao;
