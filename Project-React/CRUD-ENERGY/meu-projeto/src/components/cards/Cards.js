import React from 'react';
import './Cards.css';
import { Link } from 'react-router-dom';

import IconsGrafic from '../../assets/img/icons/grafic.png';
import IconMoney from '../../assets/img/icons/money.png';
import IconUser from '../../assets/img/icons/user.png';

function Cards() {
  return (
    <section className="pacotes">
      <div className="card">
        <img src={IconsGrafic} alt="" />
        <h1>Graficos</h1>
        <p>Visualização de dados da usina fotovoltaica.</p>
        <Link to="/grafico" className="link-card" style={{ textDecoration: 'none', color: 'white' }}> ABRIR</Link>
      </div>

      <div className="card">
        <img src={IconUser} alt="" />
        <h1>Usuários</h1>
        <p>Administração  de usuários.</p>
        <br />
        <Link to="/usuario" className="link-card" style={{ textDecoration: 'none', color: 'white' }}>ABRIR</Link>
      </div>

      <div className="card">
        <img src={IconMoney} alt="" />
        <h1>Finanças</h1>
        <p>Cálculo financeiro.</p>
        <br />
        <Link to="/financas" className="link-card" style={{ textDecoration: 'none', color: 'white' }}> ABRIR</Link>
      </div>
    </section>
  );
}

export default Cards;
