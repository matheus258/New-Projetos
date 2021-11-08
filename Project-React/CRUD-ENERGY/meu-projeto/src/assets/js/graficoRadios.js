// Criar Funcao para returnar um elemento do Gráfico;
// Tempo Tensao Corrente Potencia Temperatura;

function returnTempo() {
  document.getElementById('modificar-line').innerHTML = '<Line id="c1" class="linhas_ocultas" type="monotone" dataKey="tempo_h" stroke="#8884d8" activeDot={{ r: 8 }}/>';
}

export default {
  returnTempo,
};
