<template>

<main>
  <aside>
    <div class="card" style="width: 18rem;">
        <img src="@/assets/imgs/avatar.png" class="card-img-top" alt="...">
        <div class="card-body">
          <h2 class="card-title">George Diogo</h2>
          <h4 class="card-text"> 3º ano B Tarde</h4>
        </div>
        <ul class="list-group list-group-flush">
          <li class="list-group-item">Pai: Fulano de tal</li>
          <li class="list-group-item">Mãe: Ciclana maria</li>
          <li class="list-group-item">Telefone: 81 987654321</li>
          <li class="list-group-item">Email: fulana@email.com</li>
        </ul>
    </div>
  </aside>
  <div id="center"></div>
  <div class="right">
    <div class="botoes" v-if="botoes">
        <button type="button" class="btn btn-light" @click="f_dicas"><h1>Dicas</h1></button>
        <button type="button" class="btn btn-light"><h1>Atividades</h1></button>
        <button type="button" class="btn btn-light" @click="f_videos"><h1>Videos</h1></button>
        <button type="button" class="btn btn-light"><h1>Brincadeiras</h1></button>
    </div>     
  </div>

  <div id="conteudo" v-show="!botoes">
    <button type="button" class="btn btn-light" @click="close">Voltar</button>
    <Dicas v-if = "dicas"/>
    <Videos v-if = "videos"/>
  </div>
  

</main>

  

</template>

<script>

import Dicas from '@/components/atividades/botões/dicas.vue'
import Videos from '@/components/atividades/botões/videos.vue'

export default {
  name: "atividades",
  data() {
    return {
      botoes: true,
      dicas: false,
      atividades: false,
      videos: false,
      brincadeiras: false,
 
    }
  },
  methods: {
    close() {
      this.botoes = true
      this.dicas = false
      this.atividades = false
      this.videos = false
      this.brincadeiras = false
    },
    f_dicas () {
      this.botoes = false
      this.dicas = true
    },
    f_videos () {
      this.botoes = false
      this.videos = true
    }
  },
  components: {Dicas, Videos}

}
</script>

<style scoped>

* {
  padding: 1rem;
  margin: 0;
}

main {
  display: flex;
  flex-direction: row;
  background-color: #00a7aa;
}


#img {
  background-color: black;
  width: 100px;
  height: 100px;
  border-radius: 50%;
}
aside {
  background-color: #00a7aa;
  width: 500px;
  height: 700px;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  padding: 1rem;
}

aside .contato {
  display: flex;
  flex-direction: row;
}

#center {
  padding: 0;
  width: 5px;
  height: 650px;
  margin-top: 30px;
  border-radius: 10%;
  background-color: antiquewhite;
}

/* lado direito */

.right {
 
}

.botoes {
  display: flex;
  flex-direction: column;
  padding: 50px;
}

.btn {
  margin-bottom: 10px;
  color: #00a7aa;
}

</style>