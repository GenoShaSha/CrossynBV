import React from 'react';
import '../styles/NavBar.css';
import {  Link } from "react-router-dom";
import {Container ,Navbar, Nav} from 'react-bootstrap'
import logo from "../images/logo.png";
import SecuredRoute from './SecureRoute';


const NavBar= () =>{
  return (
    <div className="Navigation">
    <Navbar bg="dark" variant="dark">
    <Container>
    <Navbar.Brand href="/"> <img src={logo} className="img-logo" alt="Logo"/></Navbar.Brand>
    <Nav className="me-auto">
      <Nav.Link href="/login">Log in</Nav.Link>
      <Nav.Link href="/Trips">Trips</Nav.Link>
    </Nav>
    </Container>
  </Navbar>
</div>
  );
}
export default NavBar;