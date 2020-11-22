import * as React from 'react';
import './Registration.css';
import User from '../models/Jogador'
import { SyntheticEvent, useState } from 'react';
import '../login/Login.css'
import './Registration.css'
import DatePicker from "react-datepicker";
import { useHistory } from "react-router-dom";


//todo: define profiles
const apiHost:string = "http://localhost:8080/jogador"


function RegisterButton() {
  return (
      <div style={{margin: 30}}>

              <button type="submit" className="register-button">
                      <b>Cadastrar</b>
              </button>

      </div>
      )
}

function RegistrationTitle() {
  return <h1 style={{fontFamily: "Segoe UI, sans-serif"}}>Cadastro de jogador</h1>
}



export default function RegistrationForm() {
  const [value, setValue] = useState<User>({
    nome:"",
    email: "",
    senha:"",
    dataNascimento: new Date(),
    codPosicao:0
  })

  const history = useHistory()

  const submitRegistration= (event:SyntheticEvent)=> {
    console.log(event)
    event.preventDefault()
    fetch(apiHost, {method: "POST", body: JSON.stringify(value), headers: {"Content-type": "application/json; charset=UTF-8"} })
    .then((res)=>res.json())
    .then((res:User)=>{
            console.log("User registered succesfully")
            history.push(`/login`)
    })
    .catch((err)=>{
        console.log("User not registered. Error: " + err)
        history.push("/error")
    })
  }

  const handleChange= (event: React.ChangeEvent<HTMLInputElement>)=> {
    setValue({...value, [event.currentTarget.name]: event.currentTarget.value})
  }

  const handleChangeSelect= (event: React.ChangeEvent<HTMLSelectElement>)=> {
    setValue({...value, [event.currentTarget.name]: event.currentTarget.value})
  } 

  return (
    <form onSubmit={submitRegistration}>
        <RegistrationTitle></RegistrationTitle>
        <div style={{ display: "flex", flexDirection: "row", alignItems: "flex-start"}}>
          <div className="login-field">
                <label htmlFor ="nome" className="login-field-label">Nome:</label>
                <input id="nome" type="text" name="nome" required value={value.nome} onChange={handleChange} className="login-field-input"/>
  
            </div>
            <div className="login-field">
            <label htmlFor ="email" className="login-field-label">Email:</label>
                <input id="email" type="email" name="email" required value={value.email} onChange={handleChange} className="login-field-input"/>
            
            </div>
          </div>
          
          <div style={{ display: "flex", flexDirection: "row", alignItems: "flex-start"}}>
            <div className="login-field">
                <label htmlFor ="senha" className="login-field-label">Password:</label>
                <input id="senha" type="password" name="senha" required value={value.senha} onChange={handleChange} className="login-field-input"/>
            </div>
            <div className="login-field">
                <label htmlFor ="codPosicao" className="login-field-label">Posição:</label>
                <select id="codPosicao" name="codPosicao" value={value.codPosicao} onChange={handleChangeSelect} className="login-field-input-select">
                  <option value={0}>Atacante</option>
                  <option value={1}>Meio campo</option>
                  <option value={2}>Lateral</option>
                  <option value={3}>Volante</option>
                  <option value={4}>Zagueiro</option>
                  <option value={5}>Goleiro</option>
                </select>
            </div>
          </div>

          <div style={{ display: "flex", flexDirection: "row", alignItems: "flex-start"}}>
            <div className="login-field">
                <label htmlFor ="email" className="login-field-label">Data de Nascimento:</label>
                <DatePicker className="login-field-input" selected={value.dataNascimento} onChange={date => setValue({...value, 'dataNascimento': date})} />
            </div>
          </div>
          <RegisterButton/>
    </form>
  );
  }