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
    
            <!-- Botão para cadastrar aluno -->
            <button type="button" class="table-btn float-right pt-2 px-2 mt-5 rounded border-0" data-bs-toggle="modal" data-bs-target="#alunoCadastro" title="Cadastrar novo(a) aluno(a)">
                    <span class="material-icons text-light">add</span>
            </button> <!-- /fim do Botão para cadastrar aluno -->
         
            <!-- Modal -->
            <CadastroPai/>

            <main role="main" id="abc">
                <!-- Tabela de alunos acadastrados (pais ou responsáveis) -->
                <table class="table table-striped table-bordered table-hover w-75 mx-auto text-center shadow">
                    <!-- Cabeçalho da tabela -->
                    <thead class="bg-table-thead text-light">
                        <th scope="col">ID</th>
                        <th scope="col">NOME</th>
                        <th scope="col">ANO E TURMA</th>
                        <th scope="col">TURNO</th>
                        <th scope="col">AÇÃO</th>
                    </thead> <!-- /fim do Cabeçalho da tabela -->

                    <tbody> <!-- Corpo da tabela -->
                        <tr v-for="retornoBd in retornoBd" :key="retornoBd.id">
                            <th scope="row">{{retornoBd.id}}</th>
                            <td>{{retornoBd.nome}}</td>
                            <td>{{retornoBd.turma}}</td>
                            <td>{{retornoBd.turno}}</td>
                            <td>
                                <div class="d-flex justify-content-around">
                                    <span class="material-icons" title="Deletar" @click="removeAlunoBd(retornoBd.id)">delete</span>
                                    <span class="material-icons" title="Editar">edit</span>
                                </div>
                            </td>
                        </tr>

                      
                    </tbody> <!-- /fim Corpo da tabela -->
                </table>  <!-- /fim Tabela -->
            </main>
        </div>
    </div>
</template>

<script>

import Axios from "@/services/restApi/restServices"
import CadastroPai from "./cadastro-modal/CadastroPai.vue";


    export default {
    name: "PaiPage",
    data() {
        return {
            retornoBd: null,
            tokenPai: {
              token: this.$store.state.token
            }
        };
    },
    methods: {
        async getAlunosBd() {
            //chamando os dados do back
            Axios.getPai(this.tokenPai).then(resposta => {this.retornoBd = resposta.data})
            console.log(this.retornoBd)
        
        },
        async logout() {
            this.$store.commit("logout");
        }
    },
    mounted() {
        this.getAlunosBd();
        console.log(this.tokenPai)
    },
    components: { CadastroPai }
}


</script>

<style scoped>
    /*! Generated by Font Squirrel (https://www.fontsquirrel.com) on May 19, 2021 */
    
    /* FONTES QUE ESTÃO SENDO E PODEM SER UTILIZADAS */
    
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
    
    
    /* Menu de navegação */
    
    .nav-item {
        margin-left: 3.5vw;
        cursor: pointer;
        font-size: .9vw;
    }
    
    .nav-link {
        color: black;
        transition: .3s;
    }
    
    .nav-link:hover, .ativo {
        color: #00a7aa;
    }
    
    .ativo {
        cursor: auto;
    }
    
    /* Formatação da tela de login */
    
    main {
        justify-content: space-between;
        margin-top: 2vw;
    }
    
    /* Textos e inputs */
    
    aside {
        width: 30vw;
        padding: 2vw;
        border-radius: 10px;
    }
    
    aside h2 {
        font-size: 3.2vw;
        line-height: 3.3vw;
        font-family: 'poppinsmedium';
    }
    
    aside span, .navbar-brand span {
        color: #00a7aa;
    }
    
    
    /* Formatação dos campos (inputs) */
    

 
    

    
    /* Modal */
    
    .modal-content {
        box-shadow: 1px 1px 12px 6px rgba(0, 0, 0, 0.274);
        text-align: start;
    }
    
    .modal-dialog {
        max-width: 35vw;
    }
    
    /* Tabela */
    
    table {
        font-size: 1vw;
    }

    table span {
        cursor: pointer;
    }

    .table-btn {
        margin-left: 60vw;
        cursor: pointer;
        background-color: #00a7aa;
        transition: .3s;
    }
    
    .table-btn:hover {
        background-color: #019092;
    }
    
    .bg-table-thead {
        background-color: #00a7aa;
    }
    
    .modal-footer button {
        width: 17vw;
        font-size: 1vw;
    }
    
    
    /* ESTILIZAÇÃO DO MENÚ RESPONSIVO */
    
    @media (max-width: 991.98px) {
    
        /* Título "Todos Por Um" */
    
        .navbar-brand h1 {
            font-size: 5vw;
            line-height: 4.2vw;
        }
    
        /* Botão "hambúrguer" do menu responsivo */
    
        .navbar-toggler {
            background-color: #00a7aa;
        }
    
        /* Opções do menú: "Início", "Serviços", etc... */
    
        nav ul {
            width: 35%;
            margin: 5vw auto 0px auto;
        }
    
        .nav-item {
            margin-bottom: 5vw;
        }
    
        .nav-link {
            font-size: 5vw;
        }
    
        aside {
            width: 100%;
        }
    
        aside h2 {
            font-size: 8vw;
            text-align: center;
            line-height: 9vw;
        }
    
        /*
        aside p {
            line-height: 3.8vw;
            font-size: 2.5vw;
        }
        */
    
        .login-inputs {
            font-size: 4vw;
            margin-top: 2vw;
        }
    
        aside input[type="email"], aside input[type="password"] {
            padding: 3vw;
            margin-top: 4vw;
        }
    
        /* Botões */
    
        .login-btn {
            flex-direction: column;
        }
    
        /* Botão de "ENTRAR" */
    
        .login-btn input {
            padding: 1.5vw 1vw;
            font-size: 5vw;
            margin-top: 4vw;
        }
    
        /* Link para Cadastrar */
    
        .login-btn a {
            margin: 6vw auto 0 auto;
            font-size: 4vw;
        }
    
        /* Imagem animada não aparece */
    
        img {
            display: none;
        }
    
    
        /* Modal de cadastro dos pais */
    
        .modal-content {
            width: 90vw;
            box-shadow: none;
        }
    
        .modal-body p {
            font-size: 3vw;
        }
    
        .def-fisica, .def-intel {
            font-size: 3.5vw;
        }
    
        .modal-footer button {
            font-size: 3.5vw;
            width: 65vw;
        }
    
        .coluna {
            flex-direction: column;
        }
    
        /* Modal do cadastro do aluno */
    
        .modal-content {
            width: 85vw;
        }
    
        .table-btn {
            display: block;
            font-size: 3.2vw;
            margin: auto;
        }
    }
</style>