import './App.css';
import Navbar from './components/Navbar';
import Login from './pages/Login';
import React from 'react';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

function App() {
  return (
    <div className="App">

    <Router>
      <Navbar/>
      <Switch>
        <Route path='/Login' exact component={Login} />
      </Switch>
    </Router>

    </div>
  );
}

export default App;
