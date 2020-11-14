import Event from './Event'
import User from './User'

export default interface Group {
    nome: string,
    events?: Event[],
    players: User[]
}