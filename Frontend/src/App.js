import './App.css';
import NavBar from './components/Navbar';
import Login from './pages/Login';
import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import Home from './pages/Home';
import Trips from './pages/Trips';
import { Redirect } from 'react-router';

import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import PrivateRoute from './components/PrivateRoute';
import LoginHide from './components/LoginHide';
import SecuredRoute from './components/SecureRoute';

function App() {
  const handleLogout = () => {
    localStorage.clear();
  };


  return (
    <div>

    <Router>
      <NavBar/>
      <Switch>
      <Route path='/' exact component={Home} />
      <Route path='/Login' exact component={Login} />
      <SecuredRoute path='/Trips' exact component={Trips}/>
      </Switch>
    </Router>

    <button onClick={handleLogout}>logout</button>

    </div>
    
   
  );
}

export default App;