import React, { useEffect, useState } from 'react';
import '../App.css';
import User from '../models/User'
import EventsContainer from './EventsContainer'
import Event from '../models/Event'

const getUserById = "http://localhost:8080/users?id="
const getEventsByPresenceUserId = "http://localhost:8080/events?id="
const getEventsByPresenceUserIdReal = "http://localhost:8080/events?presencas.id="

export default function Home() {
    const [loggedUser, setLoggedUser] = useState<User>({
        nome: "",
        email: "",
        dataNascimento:new Date,
        codPosicao: "0"
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
            console.log(res)
            setEvents(res)
            
        })
        .catch(err=>{
            console.log(err)
        })
    }, [])

    return (
        <div className="centralized-container" style={{backgroundColor:"#cef2e7"}}>
            <EventsContainer events={events}/>
        </div>
    );
  }