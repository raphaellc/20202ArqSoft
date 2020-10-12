import React from 'react';
import './Login.css';
import { Link } from "react-router-dom";

export default function Form() {
    const logIn = ()=>{
        console.log("entered")
    }


    return (
        <form>
            <div className="login-field">
                <label htmlFor ="email" className="login-field-label">Email:</label>
                <input id="email" type="text" className="login-field-input"/>
            </div>
            
            <div className="login-field">
                <label htmlFor ="password" className="login-field-label">Password:</label>
                <input id="password" type="password" className="login-field-input"/>
            </div>
            
            <Link to="/home">
                <button onClick={logIn} className="login-button">
                    <b>Entrar</b>
                </button>
            </Link>
        </form>
    );
  }