import React from 'react';
import './Rede.css';
import Face from '../../assets/img/icons/face.png';
import Insta from '../../assets/img/icons/insta.png';
import Git from '../../assets/img/icons/git.png';
import Linke from '../../assets/img/icons/linke.png';

function Rede() {
  return (
    <>
      <div className="redes">
        <div className="apresentacao">
          <p>Redes Sociais:</p>
        </div>

        <div className="face">
          <a href="#f">
            <img src={Face} alt="" />
          </a>
        </div>

        <div className="insta">
          <a href="#f">
            <img src={Insta} alt="" />
          </a>
        </div>

        <div className="linke">
          <a href="#f">
            <img src={Linke} alt="" />
          </a>
        </div>

        <div className="git">
          <a href="#f">
            <img src={Git} alt="" />
          </a>
        </div>
      </div>

    </>
  );
}

export default Rede;
