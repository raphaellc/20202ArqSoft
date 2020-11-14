export default interface User {
    id?:string,
    nome:string,
    email: string,
    password?:string,
    dataNascimento:any,
    codPosicao:string
}