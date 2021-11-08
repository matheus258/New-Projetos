import React from 'react';
import './Cabecalho.css';
import { useHistory } from 'react-router-dom';
import logo from '../../assets/img/placa_energy.png';

function Cabecalho() {
  //   Botão com rota para Informações sobre empresa;
  const history = useHistory();
  const Info = (
    <button
      type="button"
      className="button_info"
      onClick={() => {
        history.push('/informacao');
      }}
    >
      Saiba Mais
    </button>
  );
  return (
    <>
      <header className="header-home">
        <nav>
          <img src={logo} alt="" className="logo" />
          <ul className="menu-cabecalho">
            <li>Home</li>
            <li>Projetos</li>
            <li>Sobre nós</li>
            <li>Login</li>
          </ul>
        </nav>

        <div className="header-content">
          <h1>Usinas Fotovoltaicas</h1>
          <h2>Conheça mais sobre a empresa, e veja as vantagens de obter nossas tecnologias.</h2>
          {Info}
        </div>

      </header>
    </>
  );
}

export default Cabecalho;
