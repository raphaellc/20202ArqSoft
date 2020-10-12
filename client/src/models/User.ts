export default interface User {
    id?:number
    nome:string
    email: string
    password?:string
    dataNascimento:Date
    codPosicao:number
}