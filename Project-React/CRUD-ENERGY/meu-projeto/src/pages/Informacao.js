import React from 'react';
import Rodape from '../components/rodape/Rodape';
import '../assets/css/Informacao.css';
import CabecalhoRotas from '../components/header/CabecalhoRotas';

function Informacao() {
  return (
    <>
      <div className="header-informacao">
        <CabecalhoRotas />
      </div>

      <Rodape />
    </>
  );
}

export default Informacao;
