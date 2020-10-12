import React from 'react';
import './Login.css';

export default function Form() {
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
            
            <button className="login-button"><b>Entrar</b></button>
        </form>
    );
  }