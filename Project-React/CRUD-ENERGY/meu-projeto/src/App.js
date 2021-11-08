import React from 'react';
import './assets/css/App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

// Rotas para navegação;
import Home from './pages/Home';
import Usuario from './pages/usuario/Usuario';
import Login from './pages/login/Login';
import Contact from './pages/Contact';
import Informacao from './pages/Informacao';
import Grafico from './pages/Grafics';
import Financas from './pages/Financas';

function App() {
  return (
    <>
      <Router>
        <>
        </>
        <Switch>
          <Route exact path="/" component={Home} />
          <Route path="/usuario" component={Usuario} />
          <Route path="/login" component={Login} />
          <Route path="/contato" component={Contact} />
          <Route path="/informacao" component={Informacao} />
          <Route path="/grafico" component={Grafico} />
          <Route path="/financas" component={Financas} />
        </Switch>
      </Router>
    </>
  );
}

export default App;
