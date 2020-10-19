import React, { useEffect, useState } from 'react';
import '../App.css';
import User from '../models/User'
import EventsContainer from './EventsContainer'
import Event from '../models/Event'

const getUserById = "locahost:8080/users?id="
const getEventsByPresenceUserId = "locahost:8080/events?presence="

export default function Home() {
    const [loggedUser, setLoggedUser] = useState<User>({
        nome: "",
        email: "",
        dataNascimento:new Date,
        codPosicao: "0"
    })

    const [events, setEvents] = useState<Event[]>([])

    const userId = "123"

    useEffect(()=>{
        fetch(getUserById + userId,{method: "GET"})
        .then(res=>res.json())
        .then((res:Event[])=>{
            setEvents(res)
        })
        .catch(err=>{
            console.log(err)
        })
        
        fetch(getEventsByPresenceUserId + userId,{method: "GET"})
        .then(res=>res.json())
        .then(res=>{
            setLoggedUser(res)
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