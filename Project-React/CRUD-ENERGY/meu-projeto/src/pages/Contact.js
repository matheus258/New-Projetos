import React from 'react';

function Contact() {
  function test() {
    document.getElementById('bla').innerHTML = '<h1>ok<h1>';
  }

  function test1() {
    document.getElementById('bla').innerHTML = '<h1>Bom dia<h1>';
  }
  return (
    <>
      <h1>Contact</h1>
      <div id="bla">
        <h1>Hello Teste</h1>
      </div>

      <div>
        <label htmlFor="one">
          <input type="radio" className="a" id="b1" name="dados-grafic" data-nome="c1" onClick={test} required />
          Teste
        </label>

        <label htmlFor="two">
          <input type="radio" className="b" id="b2" name="dados-grafic" data-nome="c1" onClick={test1} required />
          Teste 2
        </label>
      </div>
    </>
  );
}

export default Contact;
