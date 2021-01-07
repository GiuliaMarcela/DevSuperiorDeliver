import { ReactComponent as Logo } from "../assets/images/Group.svg";
import "./styles.css";

const Navbar = () => {
  return (
    <nav className="main-navbar">
      <Logo />
      <a href="home" className="logo-text">
        DS Delivery
      </a>
    </nav>
  );
};

export default Navbar;
