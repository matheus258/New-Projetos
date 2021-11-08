import React from 'react';
import Cards from '../components/cards/Cards';
import Cabecalho from '../components/header/Cabecalho';
import Rodape from '../components/rodape/Rodape';

function Home() {
  return (
    <>
      <Cabecalho />
      <Cards />
      <Rodape />
    </>
  );
}

export default Home;
