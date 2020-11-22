import User from './Jogador'
import Group from './Grupo'

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