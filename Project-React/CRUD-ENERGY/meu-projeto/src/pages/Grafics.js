import React, { useState } from 'react'; // Usado para retornar valor do Select;
import CabecalhoRotas from '../components/header/CabecalhoRotas';
import Rodape from '../components/rodape/Rodape';

// Componentes importados para o Grafico.
import TempoCharts from '../components/charts/Tempo';
import TensaoCharts from '../components/charts/Tensao';
import CorrenteCharts from '../components/charts/Corrente';
import PotenciaCharts from '../components/charts/Potencia';
import TemperaturaCharts from '../components/charts/Temperatura';

import '../assets/css/Grafic.css';

export default function Graficos2() {
  const [nome, setEstado] = useState('');

  // Barra de progresso Selecter;
  // eslint-disable-next-line consistent-return
  const renderBarra = () => {
    if (nome === 'tempo') {
      return (
        <div className="progresso-select">
          <progress className="progresso-select-style" value="1" max="5" />
        </div>

      );
    }
    if (nome === 'tensao') {
      return (
        <div className="progresso-select">
          <progress className="progresso-select-style" value="2" max="5" />
        </div>
      );
    }
    if (nome === 'corrente') {
      return (
        <div className="progresso-select">
          <progress className="progresso-select-style" value="3" max="5" />
        </div>
      );
    }
    if (nome === 'potencia') {
      return (
        <div className="progresso-select">
          <progress className="progresso-select-style" value="4" max="5" />
        </div>
      );
    }
    if (nome === 'temperatura') {
      return (
        <div className="progresso-select">
          <progress className="progresso-select-style" value="5" max="5" />
        </div>
      );
    }
  };

  // Renderizar grafico de acordo com o valor do select selecionado;
  // eslint-disable-next-line consistent-return
  const renderGraficos = () => {
    if (nome === 'disable') {
      return (
        <div className="disable" />

      );
    }
    if (nome === 'tempo') {
      return (
        <div>
          <div className="corpo">
            <div className="charts-total">
              <div className="charts-unidades">
                <h2>Tempo</h2>
                <p>( Horário em horas decimais. )</p>
                <br />
                <TempoCharts />
              </div>
            </div>
          </div>
        </div>
      );
    }
    if (nome === 'tensao') {
      return (
        <div>
          <div className="corpo">
            <div className="charts-total">
              <div className="charts-unidades">
                <h2>Tensão</h2>
                <p>( Tensão elétrica em volts. )</p>
                <br />
                <TensaoCharts />
              </div>
            </div>
          </div>
        </div>

      );
    }
    if (nome === 'corrente') {
      return (
        <div>
          <div className="corpo">
            <div className="charts-total">
              <div className="charts-unidades">
                <h2>Corrente</h2>
                <p>( Corrente elétrica em amperes. )</p>
                <br />
                <CorrenteCharts />
              </div>
            </div>
          </div>
        </div>

      );
    }
    if (nome === 'potencia') {
      return (
        <div>
          <div className="corpo">
            <div className="charts-total">
              <div className="charts-unidades">
                <h2>Potência</h2>
                <p>( Potência gerada em kilowatts. )</p>
                <br />
                <PotenciaCharts />
              </div>
            </div>
          </div>
        </div>

      );
    }
    if (nome === 'temperatura') {
      return (
        <div>
          <div className="corpo">
            <div className="charts-total">
              <div className="charts-unidades">
                <h2>Temperatura</h2>
                <p>( Temperatura em graus Celsius. )</p>
                <br />
                <TemperaturaCharts />
              </div>
            </div>
          </div>
        </div>

      );
    }
  };
  return (
    <>
      <div className="header-grafic">
        <CabecalhoRotas className="cabecalho-Grafico" />
        <h1>Graficos de Dados</h1>
      </div>

      <div className="orientacao-grafico">
        <div id="instrucao">
          <h2>Selecione o Gráfico a ser renderizado:</h2>
        </div>

        {renderBarra()}

        <select name="chartsGlobal" id="chartsGlobal" onChange={(e) => setEstado(e.target.value)}>
          <option value="disable" selected disabled>Selecione</option>
          <option value="tempo">Tempo</option>
          <option value="tensao">Tensão</option>
          <option value="corrente">Corrente</option>
          <option value="potencia">Potência</option>
          <option value="temperatura">Temperatura</option>
        </select>

      </div>

      {renderGraficos()}

      <div className="espaco-footer" />
      <div className="backgrand-div" loading="lazy" />

      <footer className="footer-grafic">
        <Rodape />
      </footer>
    </>

  );
}
