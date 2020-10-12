import * as React from 'react';
import './Registration.css';
import User from '../models/User'
import { useState } from 'react';

export default function RegistrationForm() {
  const [value, setValue] = useState<User>({
    nome:"",
    email: "",
    password:"",
    dataNascimento: new Date(),
    codPosicao:0
  })

  const submitRegistration= ()=> {

  }

  const handleChange= ()=> {

  }

  return (
    <form onSubmit={submitRegistration}>
        <div className="login-field">
              <label htmlFor ="email" className="login-field-label">Nome:</label>
              <input id="email" type="text" name="nome" value={value.nome} onChange={handleChange} className="login-field-input"/>
          </div>

          <div className="login-field">
              <label htmlFor ="email" className="login-field-label">Email:</label>
              <input id="email" type="email" name="email" value={value.email} onChange={handleChange} className="login-field-input"/>
          </div>
          
          <div className="login-field">
              <label htmlFor ="password" className="login-field-label">Password:</label>
              <input id="password" type="password" name="password" value={value.password} onChange={handleChange} className="login-field-input"/>
          </div>

          
    </form>
  );
  }