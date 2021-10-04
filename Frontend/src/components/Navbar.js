import React from 'react';
import '../styles/NavBar.css';
import {  Link } from "react-router-dom";
import {Container ,Navbar, Nav} from 'react-bootstrap'
import logo from "../images/logo.png";


const NavBar= () =>{
  return (
    <div className="Navigation">
    <Navbar bg="dark" variant="dark">
    <Container>
    <Navbar.Brand href="#home">Navbar</Navbar.Brand>
    <Nav className="me-auto">
      <Nav.Link href="#home">Home</Nav.Link>
      <Nav.Link href="#features">Features</Nav.Link>
      <Nav.Link href="#pricing">Pricing</Nav.Link>
    </Nav>
    </Container>
  </Navbar>
</div>
  );
}
export default NavBar;