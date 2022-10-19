import router from '@/router';
import { createStore } from 'vuex'
import VuexPersistence from 'vuex-persist';

export default createStore({
  state: {
    token: "",
    acesso: "",
    nome: "",
    logado: false
  },
  mutations: { //commit

    //setando o token e definindo o logado como true
    saveToken(state, token) {
      state.token = token
      state.logado = true;
    },

    //setando o acesso
    saveAcesso(state, acesso) { 
      state.acesso = acesso
    },

    //setando o nome
    saveNome(state, nome) {
      state.nome = nome
    },

    //logout
    logout(state) {
      router.push("/");
      state.logado = false;
      state.token = "";
      state.acesso = "";
    }
  },
  plugins: [
    new VuexPersistence({
      storage: window.sessionStorage
    }).plugin
  ]
})
