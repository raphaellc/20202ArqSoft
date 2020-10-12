import React from 'react';
import './App.css';
import Login from './login/Login'
import Home from './home/Home'
import {
  BrowserRouter as Router,
  Switch,
  Route
} from "react-router-dom";


function App() {
  return (
    <Router>
      <div className="App">
        <Switch>
          <Route exact path="/">
            <Login/>
          </Route>
          <Route path="/home">
            <Home/>
          </Route>
        </Switch>
      </div>
    </Router>
  );
}

export default App;



/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.tsx</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */