import React, { SyntheticEvent, useState } from 'react';
import './Login.css';
import CredentialsRequest from '../models/CredentialsRequest'
import CredentialsResponse from '../models/CredentialsResponse'
import { useHistory } from "react-router-dom";
import { Link } from "react-router-dom";

//todo: define profiles
const apiHost:string = "http://localhost:8080/auth"

function LoginButton() {
    return (
        <div>
            <button type="submit" className="login-button">
                        <b>Entrar</b>
            </button>
        </div>
        )
}

function RegisterButton() {
    return (
        <div>
            <Link to="/register">
                <button type="button" className="register-button">
                        <b>Cadastrar</b>
                </button>
            </Link>
        </div>
        )
}




export default function Form() {
    const [value, setValue] = useState<CredentialsRequest>({email:"", password: ""})
    const history = useHistory();


    const logIn = (event:SyntheticEvent)=>{
        event.preventDefault()

        fetch(apiHost, {method: "POST", body: JSON.stringify(value), headers: {"Content-type": "application/json; charset=UTF-8"} })
        .then((res)=>res.json())
        .then((res:CredentialsResponse)=>{
            if(!!res && !!res.authorized){
                history.push(`/home/${res.userId}`)
            } else {
                console.log("unauthorized")
                //TODO: setup modal
            }
        })
        .catch((err)=>{
            console.log("unauthorized. Error: " + err)
            history.push("/home")
        })
    }

    const handleChange = (event: React.ChangeEvent<HTMLInputElement>)=>{
        setValue({...value, [event.currentTarget.name]: event.currentTarget.value}) 
    }


    return (
        <form onSubmit={logIn}>
            <div className="login-field">
                <label htmlFor ="email" className="login-field-label">Email:</label>
                <input id="email" type="email" name="email" required value={value.email} onChange={handleChange} className="login-field-input"/>
            </div>
            
            <div className="login-field">
                <label htmlFor ="password" className="login-field-label">Password:</label>
                <input id="password" type="password" name="password" required value={value.password} onChange={handleChange} className="login-field-input"/>
            </div>
            
            <LoginButton/>
            <RegisterButton/>
        </form>
    );
  }