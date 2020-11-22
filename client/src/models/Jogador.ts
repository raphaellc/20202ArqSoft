export default interface User {
    id?:number,
    nome:string,
    email: string,
    senha?:string,
    dataNascimento:any,
    codPosicao:number
}