<template>

    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

    <div class="body">
        <div class="cont mx-auto">
            <header><!-- início Cabeçalho -->
                <nav class="navbar"><!-- Menu -->
                    <div class="container-fluid">
                        <div class="navbar-brand text-start"><!-- Logotipo "Todos Por Um" -->
                            <a class="text-decoration-none text-dark" href="index.html">
                                <h1 class="fw-bold"><span>TODOS</span><br>POR UM</h1>
                            </a>
                        </div><!-- /fim Logotipo "Todos Por Um" -->
                    
                        <!-- Menu responsivo -->

                        <!-- Botão do menu do usuário -->
                        <a class="perfil" type="button" data-bs-toggle="offcanvas" data-bs-target="#abaLateral" aria-controls="abaLateral">Meu Perfil</a>
                        <!-- /fim Botão do menu do usuário -->

                        <!-- Aba lateral do usuário -->
                        <div class="offcanvas offcanvas-end" tabindex="-1" id="abaLateral" aria-labelledby="abaLateralLabel">
                            <!-- Cabeçalho da aba lateral -->
                            <div class="offcanvas-header">
                                <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                            </div> <!-- /fim Cabeçalho da aba lateral -->

                            <!-- Corpo da aba lateral -->
                            <div class="offcanvas-body">
                                <img src="https://picsum.photos/180" class="d-block mx-auto rounded-circle">

                                <h5 class="fw-bold text-uppercase text-center mt-3">nome</h5>

                                <div class="text-start">
                                    <button type="button" class="btn mt-3 fw-bold" v-on:click="logout">
                                        <span class="material-icons">logout</span>
                                        <sup>Sair</sup>
                                    </button>
                                </div>
                                <hr>

                                <ul class="list-group list-group-flush ms-2 text-start">
                                    <li class="list-group-item fw-bold mb-2">
                                        <a class="text-decoration-none" href="index.vue">Início</a>
                                    </li>

                                    <li class="list-group-item fw-bold mb-2">
                                        <a class="text-decoration-none" href="#">Serviços</a>
                                    </li>

                                    <li class="list-group-item fw-bold mb-2">
                                        <a class="text-decoration-none" href="#">Sobre</a>
                                    </li>
                                    
                                    <li class="list-group-item fw-bold mb-2">
                                        <a class="text-decoration-none" href="#">Contato</a>
                                    </li>
                                </ul>
                            </div> <!-- /fim Corpo da aba lateral -->
                        </div> <!-- /fim Aba lateral do usuário -->
                    </div>
                </nav> <!-- /fim Menu -->
            </header> <!-- /fim Cabeçalho -->

            
            <main role="main">
                

            <div v-if="!ok">
               <div class="d-grid gap-2 col-6 mx-auto" v-for="retornoBd in retornoBd" :key="retornoBd.id">
                    <button type="button" class="btn text-light fw-bold fs-4" v-on:click="getTokenAluno(retornoBd.tokenaluno)">
                        {{retornoBd.sala}}
                    </button>
                </div>
            </div>

            <div v-else>
                <Alunos :tokenAlunoProps = "tokenAluno" /> <!-- enviando via props -->
            </div>

               
            </main>
        </div>
    </div>
</template>

<script>
import Salas from './salas/Salas.vue';
import Alunos from './alunos/Alunos.vue';
import Axios from '@/services/trylogin';



    export default {
    name: "ProfView",
    data() {
        return {
          ok: false,  
          token: {  //token que vai para o servidor
            tokenprof: this.$store.state.token
        }, 
          retornoBd: null,
          tokenAluno: null //token responsavel por buscar os alunos que vai ser enviado via props no html - parte2
        }
    },
    components: { Salas, Alunos},
        methods: {
            async logout() {
            this.$store.commit("logout")
        },

        getSalas() { //chamando o banco com o token do professor como parametro
            console.log(this.token)
            Axios.getSala(this.token).then(resposta => { //exibindo as salas do bd
                 this.retornoBd = resposta.data
            })

        },

        getTokenAluno(tokenaluno) { //pegando o token ao clicar no botão
            this.ok = true;
            this.tokenAluno = tokenaluno //enviando via props parte 1
        }

        },
        mounted() {
           
            this.getSalas();

        }

    }

</script>

<style>

@font-face {
        font-family: 'poppinsblack';
        src: url('@/assets/fonts/poppins-black-webfont.woff2') format('woff2'),
             url('@/assets/fonts/poppins-black-webfont.woff') format('woff');
        font-weight: normal;
        font-style: normal;
    }
    
    @font-face {
        font-family: 'poppinsbold';
        src: url('@/assets/fonts/poppins-bold-webfont.woff2') format('woff2'),
             url('@/assets/fonts/poppins-bold-webfont.woff') format('woff');
        font-weight: normal;
        font-style: normal;
    }
    
    @font-face {
        font-family: 'poppinslight';
        src: url('@/assets/fonts/poppins-light-webfont.woff2') format('woff2'),
             url('@/assets/fonts/poppins-light-webfont.woff') format('woff');
        font-weight: normal;
        font-style: normal;
    }
    
    @font-face {
        font-family: 'poppinsmedium';
        src: url('@/assets/fonts/poppins-medium-webfont.woff2') format('woff2'),
             url('@/assets/fonts/poppins-medium-webfont.woff') format('woff');
        font-weight: normal;
        font-style: normal;
    }
    
    @font-face {
        font-family: 'poppinsregular';
        src: url('@/assets/fonts/poppins-regular-webfont.woff2') format('woff2'),
             url('@/assets/fonts/poppins-regular-webfont.woff') format('woff');
        font-weight: normal;
        font-style: normal;
    }
    
    @font-face {
        font-family: 'poppinssemibold';
        src: url('@/assets/fonts/poppins-semibold-webfont.woff2') format('woff2'),
             url('@/assets/fonts/poppins-semibold-webfont.woff') format('woff');
        font-weight: normal;
        font-style: normal;

    }

    .body {
        background-color: whitesmoke;
        font-family: 'poppinsregular';
        height: 100vh;
    }
    
    .cont {
        width: 70vw;
        padding: 1vw;
    }
    
    
    /* Formatação do Cabeçalho (logo) */
    
    .navbar-brand h1 {
        font-size: 3vw;
        line-height: 2.8vw;
    }
    
    .navbar-brand a {
        text-decoration: none;
    }

    .navbar-brand span {
        color: #00a7aa;
    }
    
    
    /* Botão de configurações */

    .container-fluid .perfil {
        color: #00a7aa;
        transition: .3s;
        text-decoration: none;
    }

    .container-fluid .perfil:hover {
        color: #019092;
        text-decoration: underline;
        text-decoration-thickness: 1.5px;
    }


    /* Menu de navegação */
    
    .list-group-item {
        border-bottom: 0;
    }

    .list-group-item a {
        transition: .3s;
    }

    .list-group-item a:hover {
        color: #00a7aa;
    }


    /* Botão de sair */

    .offcanvas-body button span {
        font-size: 1.5vw;
    }

    .offcanvas-body button sup {
        font-size: .9vw;
        margin-left: .8vw;
    }

    .offcanvas-body button {
        border-radius: 30px;
        padding-bottom: 0;
    }

    .offcanvas-body button:hover {
        background-color: #00a7aa;
        color: white;
    }


    /* Tela do(a) professor(a) */

    main {
        margin-top: 6vw;
    }

    .sala {
        font-size: 2vw;
    }

    .accordion {
        width: 50%;
        height: 45.3vh;
    }

    .d-grid button {
        background-color: #00a7aa;
        margin-bottom: 1.3vw;
    }

    .d-grid button:hover {
        background-color: #009092;
    }

    .accordion-header button {
        font-size: 1.3vw;
    }

    main .accordion-button {
        background-color: white;
        border: 1px solid #00a7aa;
        color: #00a7aa;
        transition: .3s;
    }

    .accordion-button:hover {
        background-color: #00babd4d;
        color: white;
        border-color: #00babd4d;
    }


    /* Corpo do accordion */

    .accordion-body {
        font-size: .9vw;
        width: 75%;
    }

    .accordion-body p {
        border-bottom: 1px solid #00a7aa;
    }

    
    /* ESTILIZAÇÃO DO MENÚ RESPONSIVO */
    
    @media (max-width: 767.98px) {
    
        .cont {
            width: 95vw;
        }

        /* Título "Todos Por Um" */
    
        .navbar-brand h1 {
            font-size: 5vw;
            line-height: 4.2vw;
        }

        
        /* Botão de "Meu Perfil" */

        .container-fluid .perfil {
            font-size: 5vw;
        }


        /* Botão de sair */

        .offcanvas-body button span {
            font-size: 7vw;
        }

        .offcanvas-body button sup {
            font-size: 4vw;
            margin-left: 3vw;
        }


        /* Título da sala */

        .sala {
            font-size: 6vw;
        }


        /* Accordion */

        .accordion {
            width: 90%;
            height: 49.8vh;
        }

        .accordion-header button {
            font-size: 5vw;
        }

        .accordion img {
            width: 10vw;
        }

        .accordion-body {
            font-size: 3.2vw;
            width: 100%;
        }

    }

    @media (min-width: 768px) and (max-width: 1199.98px) {
         
        /* Botão de "Meu Perfil" */

        .container-fluid .perfil {
            font-size: 3vw;
        }

        /* Título da sala */

        .sala {
            font-size: 4vw;
        }
        
        /* Accordion */

        .accordion {
            width: 90%;
            height: 44.4vh;
        }

        .accordion-header button {
            font-size: 2.5vw;
        }

        .accordion-body {
            font-size: 2vw;
            width: 85%;
        }

        /* Botão de sair */

        .offcanvas-body button span {
            font-size: 3.5vw;
        }

        .offcanvas-body button sup {
            font-size: 2.2vw;
            margin-left: 3vw;
        }

        .list-group {
            font-size: 2.5vw;
        }
    }

    @media (min-width: 1200px) and (max-width: 1399.98px) {
        /* Botão de "Meu Perfil" */

        .container-fluid .perfil {
            font-size: 1.6vw;
        }

        /* Botão de sair */

        .offcanvas-body button span {
            font-size: 2vw;
        }

        .offcanvas-body button sup {
            font-size: 1.2vw;
            margin-left: 1.5vw;
        }

        .list-group {
            font-size: 1.8vw;
        }
    }
</style>