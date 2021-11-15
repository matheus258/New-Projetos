/* eslint-disable func-names */
import React from 'react';
import './App.css';

const Saudacao = function () {
  return (
    <>
      <h1>
        Configuração predefinida para projetos com Eslint, Editor e Babel.
      </h1>
      <img src="https://eslint.org/assets/img/favicon.512x512.png" alt="Eslint" />
    </>
  );
};

const App = function () {
  return (
    <div className="App">
      <Saudacao />
    </div>
  );
};

export default App;
