import SecuredRoute from './components/SecureRoute';
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

function App() {



  return (
    <div>

    <Router>
      <NavBar/>
      <Switch>
      <Route path='/' exact component={Home} />
      <Route path='/Login' exact component={Login} />
      <Route path='/Trips' exact component={Trips}/>

      </Switch>

    </Router>

   

    </div>
    
   
  );
}

export default App;
