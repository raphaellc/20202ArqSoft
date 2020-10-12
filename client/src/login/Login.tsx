import React from 'react';
import Logo from './Logo'
import Form from './Form'
import '../App.css'

export default function Login() {
    return (
        <div className="centralized-container">
            <Logo/>
            <Form/>
        </div>
    );
  }