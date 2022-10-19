import { http } from "./config";

export default {

    //Login
    save:(trylogin) => {
        return http.post('login', trylogin)
    },

    //Pai ---------------------------------------------------------------------------------
    getPai:(token) => { //retorna os filhos do pai do bd, com o token de 5 digitos do mesmo
        return http.post('alunos1/pai', token)
    },

    //Professor---------------------------------------------------------------------------

    getSala:(sala) => { //retorna as salas do professor, com o token de 5 digitos do mesmo
        return http.post('sala', sala)
    },

    getAlunos:(token1) => {
        return http.post('alunos1/prof', token1) //token1, é o token de 2 digitos referente a sala
    }

  
}