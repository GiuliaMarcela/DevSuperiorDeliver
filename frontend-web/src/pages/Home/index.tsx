import { Link } from "react-router-dom";
import { ReactComponent as MainImage } from "../../assets/images/Imagem.svg";
import Footer from "../../components/Footer";
import "./styles.css";

const Home = () => {
  return (
    <>
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
            <Link to="/orders" className="home-btn-order">
              Fazer pedido
            </Link>
          </div>
          <div className="home-image">
            <MainImage />
          </div>
        </div>
      </div>
      <Footer />
    </>
  );
};

export default Home;
