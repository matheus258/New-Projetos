import React from 'react';
import CabecalhoRotas from '../components/header/CabecalhoRotas';

function Financas() {
  // eslint-disable-next-line global-require
  const financas = require('../json/dadosUsina.json');
  const financasValue = financas;

  function ReturnFinanca() {
    let parametro = 0;
    let contas = 0;
    while (parametro < financasValue.length) {
      const somarValor = financas[parametro].tempo_h;
      // eslint-disable-next-line no-plusplus
      const somarSegundoValor = financas[++parametro].tempo_h;
      contas = Number(somarSegundoValor - somarValor);
    }
    return `${contas}`;
  }
  // const xx = Financas;
  // console.log(xx);

  return (
    <>
      <div className="header-usuario">
        <CabecalhoRotas className="cabecalho-usuario" />
        <h1>Gerenciamento de Finanças</h1>
        <h2>{ReturnFinanca}</h2>
      </div>
    </>
  );
}

export default Financas;
