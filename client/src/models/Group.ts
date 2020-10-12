import Event from './Event'
import User from './User'

export default interface Group {
    events: Event[],
    players: User[]
}