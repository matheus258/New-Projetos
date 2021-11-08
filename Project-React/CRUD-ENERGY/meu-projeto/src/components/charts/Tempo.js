import React from 'react';
import {
  LineChart,
  Line,
  XAxis,
  YAxis,
  CartesianGrid,
  Tooltip,
  Legend,
} from 'recharts';

// Arquivo Json Para leitura de dados da Usina;
const dados = require('../../json/dadosUsina.json');

const data = dados;

function TempoCharts() {
  return (
    <>

      <>
        <LineChart
          width={800}
          height={400}
          data={data}
          margin={{
            top: 10,
            right: 30,
            left: 20,
            bottom: 10,
          }}
        >
          <CartesianGrid strokeDasharray="3 3" />
          <XAxis dataKey="name" />
          <YAxis />
          <Tooltip />
          <Legend />

          <Line id="c1" class="linhas_ocultas" type="monotone" dataKey="tempo_h" stroke="#8884d8" activeDot={{ r: 8 }} />
        </LineChart>
      </>

    </>

  );
}

export default TempoCharts;
