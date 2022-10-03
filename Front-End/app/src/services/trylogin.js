import { http } from "./config";

export default {

    //Login
    save:(trylogin) => {
        return http.post('login', trylogin)
    },

    //Pai
    getPai:() => {
        return http.get('alunos')
    },

    deletePai:(alunos) => {
        return http.delete('alunos', {data: alunos})
    }
}