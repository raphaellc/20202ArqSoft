import React from 'react';
import Logo from './Logo'
import Form from './Form'

export default function Login() {
    return (
        <div style={{height: "100vh", backgroundColor:"#82ffc3", display: "flex", alignItems: "center",flexDirection: "column", justifyContent: "center"}}>
            <Logo/>
            <Form/>
        </div>
    );
  }