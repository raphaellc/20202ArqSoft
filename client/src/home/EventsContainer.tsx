import React, { useEffect, useState } from 'react';
import '../App.css';
import EventModel from '../models/Evento'
import EventComponent from './Event'

interface EventsContainerProps {
    events: EventModel[]
}

export default function EventsContainer({events}: EventsContainerProps) {
    const tomorrow = new Date();
    tomorrow.setDate(tomorrow.getDate() + 1);
        
    const nextWeek = new Date();
    nextWeek.setDate(nextWeek.getDate() + 7);

    const [tomorrowEvents, setTomorrowEvents]= useState<Array<EventModel>>([])
    const [nextWeekEvents, setNextWeekEvents]= useState<Array<EventModel>>([])
    const [laterEvents, setLaterEvents]= useState<Array<EventModel>>([])

    useEffect(()=>{
        const nextWeekFilter = events.filter(element=>{
            return new Date(element.dthInicio) > new Date() && new Date(element.dthInicio) <= tomorrow;
        })
        setNextWeekEvents(nextWeekFilter)

        const tomorrowFilter = events.filter(element=>{
            return new Date(element.dthInicio) > tomorrow && new Date(element.dthInicio) <= nextWeek;
        })
        setTomorrowEvents(tomorrowFilter)

        const laterFilter = events.filter(element=>{
            return new Date(element.dthInicio) > nextWeek;
        })
        setLaterEvents(laterFilter)
    }, [events])

    return (
        <div className="event-dates-container">
            {tomorrowEvents.length === 0 ? <></> : (
                <>
                <div style={{margin: "15px 0px"}}>
                    <div className="white-container-card-item" style={{padding: 10}}>Eventos amanhã: </div>
                    <div  className="events-container">
                        {tomorrowEvents.map((event, i)=><EventComponent key={i} event={event}/>)}
                    </div>
                </div>
                <div style={{height: 1, width:"90%", backgroundColor:"darkgray", margin:"10px 0px"}}></div>
                </>
            )}

            {nextWeekEvents.length === 0 ? <></> : (
                <>
                    <div style={{margin: "15px 0px"}}>
                        <div className="white-container-card-item" style={{padding: 10}}>Eventos Na Próxima semana: </div>
                        <div className="events-container">
                            {nextWeekEvents.map((event, i)=><EventComponent key={i} event={event}/>)}
                            </div>
                    </div>
                    <div style={{height: 1, width:"90%", backgroundColor:"darkgray", margin:"10px 0px"}}></div>
                </>
            )}
            {laterEvents.length === 0 ? <></> : (
                <div style={{margin: "15px 0px"}}>
                    <div className="white-container-card-item" style={{padding: 10}}>Mais de uma semana:</div>
                    <div className="events-container">
                        {laterEvents.map((event, i)=><EventComponent key={i} event={event}/>)}
                    </div>
                </div>
            )}
        </div>
    );
  }