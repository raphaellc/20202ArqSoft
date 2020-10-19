import React from 'react';
import './App.css';
import Login from './login/Login'
import Home from './home/Home'
import Header from './Header'
import Groups from './groups/Groups'
import Registration from './registration/Registration'
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

          <Route path="/register">
            <Registration/>
          </Route>

          <Route path="/home">
            <React.Fragment>
              <Header path={"home"}/>
              <Home/>
            </React.Fragment>
          </Route>

          <Route path="/groups">
            <React.Fragment>
              <Header path={"home > groups"}/>
              <Groups/>
            </React.Fragment>
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