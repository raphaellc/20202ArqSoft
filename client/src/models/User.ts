export default interface User {
    id?:number,
    nome:string,
    email: string,
    password?:string,
    dataNascimento:any,
    codPosicao:string
}