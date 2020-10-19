import React from 'react';
import '../App.css';
import EventModel from '../models/Event'

interface EventProps {
    event: EventModel
}

export default function Event({event}: EventProps) {
    return (
        <div>
            <div>{event.nome}</div>
            <div>{event.local}</div>
        </div>
    );
  }