import './App.css';
import { FcSearch } from "react-icons/fc";

function App() {
  return (
    <div className="Container">
      <h1>Buscador CEP</h1>

      <div className='containerInput'>
        <input type="text" placeholder='Digite seu cep...'/>
        <button className='buttonProcurar'> <FcSearch size={25}/></button>
      </div>

    </div>
  );
}

export default App;
