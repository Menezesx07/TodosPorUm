import Axios from "@/services/restApi/restServices"

export default {

    async tryLogin(userLogin) {
       
        var dadosLogin = await Axios.save(userLogin).then(resposta => {

            var dadosBack = resposta.data; //recebendo os valores que o post gerou
            var encaminhamento = new Object(); //recebendo os valores pós filro
               for (let elemento of dadosBack) {
                   encaminhamento.acesso = elemento.acesso;
               }
               for (let elemento of dadosBack) {
                   encaminhamento.token = elemento.token;
               }
               for (let elemento of dadosBack) {
                   encaminhamento.nome = elemento.nome
               }
          
               return encaminhamento; //quem captura esse retorno é o dadosLogin
           });

           return dadosLogin;  //que joga esse retorno para o componente do vue
    }    
       
}
      



