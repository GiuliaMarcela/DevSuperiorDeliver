import "./styles.css";
import { ReactComponent as YoutubeIcon } from "../../assets/images/Youtube.svg";
import { ReactComponent as LinkedinIcon } from "../../assets/images/Linkedin.svg";
import { ReactComponent as InstagramIcon } from "../../assets/images/Instagram.svg";

const Footer = () => {
  return (
    <footer className="main-footer">
      App desenvolvido durante a 2ª edição do evento <b>Semana DevSuperior.</b>
      <div className="footer-socials">
        <a href="https://www.youtube.com/c/DevSuperior" target="_new">
          <YoutubeIcon />
        </a>
        <a href="https://www.linkedin.com/school/devsuperior/" target="_new">
          <LinkedinIcon />
        </a>
        <a href="https://instagram.com/devsuperior.ig/" target="_new">
          <InstagramIcon />
        </a>
      </div>
    </footer>
  );
};

export default Footer;
