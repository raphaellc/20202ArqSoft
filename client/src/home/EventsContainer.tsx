import React, { useEffect, useState } from 'react';
import '../App.css';
import EventModel from '../models/Event'
import EventComponent from './Event'

interface EventsContainerProps {
    events: EventModel[]
}

export default function EventsContainer({events}: EventsContainerProps) {

    return (
        <div className="events-container">
            {events.length === 0 ? <></> : events.map((event, i)=><EventComponent key={i} event={event}/>)}
        </div>
    );
  }