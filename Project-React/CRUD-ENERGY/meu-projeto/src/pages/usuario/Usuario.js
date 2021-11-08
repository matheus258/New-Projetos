import React from 'react';
import CabecalhoRotas from '../../components/header/CabecalhoRotas';
import Rodape from '../../components/rodape/Rodape';
// CSS;
import '../../assets/css/Usuario.css';
import Index from './Index';

function Usuario() {
  return (
    <>
      <div className="header-usuario">
        <CabecalhoRotas className="cabecalho-usuario" />
        <h1>Gerenciamento de Usuários</h1>
      </div>

      <div className="dados-crud">
        <h1>Usuários Cadastrados</h1>
        <Index />
      </div>
      <Rodape />
    </>
  );
}

export default Usuario;
