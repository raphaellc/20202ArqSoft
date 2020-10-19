import React from 'react';
import '../App.css';
import EventModel from '../models/Event'
import EventComponent from './Event'

interface EventsContainerProps {
    events: EventModel[]
}

export default function EventsContainer({events}: EventsContainerProps) {
    return (
        <div>
            {events.map(event=>{<EventComponent event={event}/>})}
        </div>
    );
  }