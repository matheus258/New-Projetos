import React from 'react';
import CabecalhoRotas from '../components/header/CabecalhoRotas';

function Financas() {
  // eslint-disable-next-line global-require
  const admins = require('../json/dadosUsina.json');

  const teste = admins;

  let contas = 0;
  let contasFinal = 0;
  let contasFinalT = 0;
  let parametro = 0;
  let parametroPotencia = 0;

  const tempo = function subTempo() {
    while (parametro < teste.length) {
      const somaValor = admins[parametro].tempo_h.toFixed(2);
      // eslint-disable-next-line no-plusplus
      const subValor = admins[++parametro].tempo_h.toFixed(2);
      contas = (subValor - somaValor);
      contasFinal = Number(contas);

      parametro += parametro;
    }
    return `<>Resultado Final: HORAS ${contasFinal}</>`;
  };

  const potencia = function getPotencia() {
    while (parametroPotencia < teste.length) {
      const somarValor = admins[parametroPotencia].potencia_kW.toFixed(2);
      contas = Number(contas) + Number(somarValor);
      contasFinalT = contas;

      parametroPotencia += parametroPotencia;
    }
    return `<>Resultado Final: Potencia ${contasFinalT}</>`;
  };
  /*   const final2 = getPotencia();
  const final = subTempo();

  // eslint-disable-next-line
  console.log(final2, final); */

  return (
    <>
      <div className="header-usuario">
        <CabecalhoRotas className="cabecalho-usuario" />
        <h1>Gerenciamento de Finanças</h1>

      </div>
      <div className="financa-resul" />
      <div>
        {tempo}
        {potencia}
      </div>
    </>
  );
}

export default Financas;
