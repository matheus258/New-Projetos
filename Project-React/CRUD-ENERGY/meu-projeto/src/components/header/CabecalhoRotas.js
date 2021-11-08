import React from 'react';
import { Link } from 'react-router-dom';
import logo from '../../assets/img/placa_energy.png';

function CabecalhoRotas() {
  return (
    <>
      <header>
        <nav className="nav-rotas">
          <img src={logo} alt="" className="logo" />
          <ul>
            <li>
              <Link to="/" className="link">Home</Link>
            </li>
            <li>
              <Link to="/usuario" className="link">Usuários</Link>
            </li>
            <li>
              <Link to="/grafico" className="link">Gráficos</Link>
            </li>
            <li>
              <Link to="/financas" className="link">Finanças</Link>
            </li>
            <li>
              <Link to="/" className="link">Sair</Link>
            </li>
          </ul>
        </nav>
      </header>
    </>
  );
}

export default CabecalhoRotas;
