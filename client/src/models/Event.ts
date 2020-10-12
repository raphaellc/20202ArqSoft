import User from './User'
import Group from './Group'

export default interface Event {
    players: User[]
	id: number,
	nome:string,
	dthInicio: Date,
    dthFim: Date,
    donoEvento:User,
	grupo:Group,
	local:string,
	presencas:User[]
}