import { ReactComponent as MainImage } from "../assets/images/Imagem.svg";
import "./styles.css";

const Home = () => {
  return (
    <div className="home-container">
      <div className="home-content">
        <div className="home-actions">
          <h1 className="home-title">
            Faça seu pedido <br></br> que entregamos <br></br> para você!!!
          </h1>
          <h3 className="home-subtitle">
            Escolha o seu pedido e em poucos minutos<br></br>levaremos na sua
            porta
          </h3>
          <a href="orders" className="home-btn-order">
            Fazer pedido
          </a>
        </div>
        <div className="home-image">
          <MainImage />
        </div>
      </div>
    </div>
  );
};

export default Home;
