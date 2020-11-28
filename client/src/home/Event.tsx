import React, { useEffect, useState } from 'react';
import '../App.css';
import EventModel from '../models/Evento'
import clockIcon from '../assets/clock.svg'
import dateIcon from '../assets/date.png'

interface EventProps {
    event: EventModel
}

export default function Event({event}: EventProps) {
    const [concatedClubs, setConcatedClubs] = useState<string>("")

    useEffect(()=>{
        let concat = ""
        if(!!event.times){
            event.times.map(element=>{
                concat = `${concat}, ${element}`
                return element
            })
        }
        
        concat = concat.substring(2, concat.length)
        setConcatedClubs(concat)
    }, [])

    return (
        <div className="white-container-card">
            <div id="white-container-card-section-spaced">
                <div className="white-container-card-item" style={{padding: "0px 10px 0px 0px"}}>
                    <b>{event.local}</b>
                </div>
                <div className="white-container-card-item" style={{padding: "0px 10px"}}>
                    <a href="#">Desmarcar</a>
                </div>
            </div>

            <div className="white-container-card-item" style={{padding: "5px 0px"}}>{!!event.grupo ? event.grupo.nome : <></>}</div>
            <div className="white-container-card-item" style={{padding: "5px 0px"}}><i>{concatedClubs}</i></div>

            <div id="white-container-card-section-leftAligned">
                <div className="white-container-card-item" ><img style={{width:18, height:18, lineHeight: 18, paddingRight: 5}} src={dateIcon}/></div>
                <div className="white-container-card-item" style={{padding: "0px 10px 0px 0px"}}>
                    {new Intl.DateTimeFormat('pt-BR').format(new Date(event.dthInicio)) }
                </div>
                <div className="white-container-card-item" ><img style={{width:18, height:18, lineHeight: 18, paddingLeft: 15, paddingRight: 5}} src={clockIcon}/></div>
                <div className="white-container-card-item" style={{padding: "0px 10px 0px 0px"}}>
                    {new Intl.DateTimeFormat('pt-BR', {hour: 'numeric', minute: 'numeric', second: 'numeric' }).format(new Date(event.dthInicio)) }
                </div>
            </div>
        </div>
    );
  }