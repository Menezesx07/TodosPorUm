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

    //logout (não funciona se estiver no action)
    logout(state) {
      router.push("/");
      state.logado = false;
      state.token = null;
      state.acesso = null;
      state.nome = null;
    }
  },

  actions: { //dispatch

    //setando os dados do this.$store.state
    setDados(context, dadosLogin) {

        this.state.token = dadosLogin.token
        this.state.nome = dadosLogin.nome
        this.state.acesso = dadosLogin.acesso
        this.state.logado = true
        
    }

  },
  plugins: [
    new VuexPersistence({
      storage: window.sessionStorage
    }).plugin
  ]
})
