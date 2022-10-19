import Axios from "@/services/restApi/restServices"

export default {

        tryLogin1:(userLogin) => {
        
        alert("funcionando")
        console.log(userLogin)
        Axios.save(userLogin).then(resposta => {
            var dadosBack = resposta.data; //recebendo os valores que o post gerou
          /*  for (let elemento of this.dadosBack) {
                this.encaminhamento.acesso = elemento.acesso;
            }
            for (let elemento of this.dadosBack) {
                this.encaminhamento.token = elemento.token;
            }
            for (let elemento of this.dadosBack) {
                this.encaminhamento.nome = elemento.nome
            }*/

            console.log(dadosBack)
        });

    },

}

