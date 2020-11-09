import User from './User'
import Group from './Group'

export default interface Event {
	id: number,
	nome:string,
	dthInicio: Date,
    dthFim: Date,
    donoEvento:User,
	grupo:Group,
	times: Array<string>,
	local:string,
	presencas:User[]
}