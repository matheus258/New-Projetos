import React from 'react';
import './Rodape.css';
import Rede from './Rede';

function Rodape() {
  return (
    <>
      <footer className="footer-principal">
        <div className="creditos">
          <p>Desenvolvido por Matheus Marques © 2021. </p>
        </div>

        <div className="informacao-footer">
          <ul>
            <li><a href="#f">Agenda</a></li>
            <li><a href="#f">Blog</a></li>
            <li><a href="#f">Carreiras</a></li>
            <li><a href="#f">Contato</a></li>
            <li><a href="#f">Política de Dados</a></li>
            <li><a href="#f">Soluções</a></li>
          </ul>
        </div>

        <Rede />
      </footer>
    </>
  );
}

export default Rodape;
