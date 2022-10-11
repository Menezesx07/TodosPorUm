import { http } from "./config";

export default {

    //Login
    save:(trylogin) => {
        return http.post('login', trylogin)
    },

    //Pai ---------------------------------------------------------------------------------
    getPai:() => { //excluir
        return http.get('alunos')
    },

    deletePai:(alunos) => {
        return http.delete('alunos', {data: alunos})
    },

    //Professor---------------------------------------------------------------------------

    getSala:(sala) => {
        return http.post('sala', sala)
    },

    getAlunos:(token1) => {
        return http.post('alunos1', token1)
    }

  
}