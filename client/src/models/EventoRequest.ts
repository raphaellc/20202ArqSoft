import User from './Jogador'
import Group from './Grupo'

export default interface Event {
	id?: number,
	nome:string,
	dthInicio: string,
    dthFim: string,
    donoEvento:User,
	grupo?:Group,
	local?:string
}