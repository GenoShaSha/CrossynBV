import './App.css';
import NavBar from './components/Navbar';
import Login from './pages/Login';
import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';

import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

function App() {
  return (
    <div>

    <Router>
      <NavBar/>
      <Switch>
        <Route path='/Login' exact component={Login} />
      </Switch>
    </Router>

<div className="HomePage">
<h1>Welcome</h1>

</div>
    </div>
   
  );
}

export default App;
