import React, { useEffect, useState } from 'react';
import '../App.css';
import User from '../models/Jogador'
import EventsContainer from './EventsContainer'
import Event from '../models/Evento'

const getUserById = "http://localhost:8080/jogador?id="
const getEventsByPresenceUserId = "http://localhost:8080/eventos?id="
const getEventsByPresenceUserIdReal = "http://localhost:8080/events?donoEvento="

function HomeTitle({events}: any) {
    return (
        <div style={{textAlign: "left", margin: "0px 30px"}}>
            <h3 style={{fontFamily: "Segoe UI, sans-serif"}}>{events.length > 0 ? "Seus próximos eventos" : "Nenhum evento marcado"}</h3>
        </div>
    )
}

export default function Home() {
    const [loggedUser, setLoggedUser] = useState<User>({
        nome: "",
        email: "",
        dataNascimento:new Date,
        codPosicao: 0
    })

    const [events, setEvents] = useState<Event[]>([])


    useEffect(()=>{
        const params = window.location.pathname.split("/")
        const userId = params[params.length -1]

        fetch(getUserById + userId,{method: "GET"})
        .then(res=>res.json())
        .then((res:User)=>{
            console.log(res)
            setLoggedUser(res)
        })
        .catch(err=>{
            console.log(err)
        })
        
        fetch(getEventsByPresenceUserId + userId,{method: "GET"})
        .then(res=>res.json())
        .then((res:Event[])=>{
            console.log("Events found: ")
            console.log(res)
            setEvents(res)
            
        })
        .catch(err=>{
            console.log(err)
        })
    }, [])

    return (
        <div style={{display: "flex", backgroundColor:"#cef2e7", flexDirection: "column"}}>
            <HomeTitle events={events}/>
            <div className="left-aligned-container" style={{backgroundColor:"#cef2e7"}}>
                <EventsContainer events={events}/>
            </div>
        </div>
    );
  }