<template>

<div class="body">
        <div class="cont mx-auto">
       
        
        <header><!-- início Cabeçalho -->
                <nav class="navbar navbar-expand-lg"><!-- Menu -->
                    <div class="container-fluid">
                        <div class="navbar-brand text-start"><!-- Logotipo "Todos Por Um" -->
                            <a href="index.html">
                                <h1 class="fw-bold text-dark"><span>TODOS</span><br>POR UM</h1>
                            </a>
                        </div><!-- /fim Logotipo "Todos Por Um" -->
                    
                        <!-- Menu responsivo -->
                        <!-- Botão "hambúrguer" do menu responsivo -->
                        <button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navegacao" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <!-- /fim Botão "hambúrguer" do menu responsivo -->

                        <div id="navegacao" class="collapse navbar-collapse">
                            <ul class="navbar-nav ms-auto">
                                <li class="nav-item fw-bold">
                                    <a href="index.html" class="nav-link ativo">Início</a>
                                </li>

                                <li class="nav-item fw-bold">
                                    <a href="#" class="nav-link">Serviços</a>
                                </li>

                                <li class="nav-item fw-bold">
                                    <a href="#" class="nav-link">Sobre</a>
                                </li>

                                <li class="nav-item fw-bold">
                                    <a href="#" class="nav-link">Contato</a>
                                </li>
                            </ul>
                        </div>
                    </div><!-- /fim Menu responsivo -->
                </nav> <!-- /fim Menu -->
            </header> <!-- /fim Cabeçalho -->
          
            <main role="main" class="d-flex"> <!-- Tela de login -->
                <aside class="shadow" data-aos="zoom-in" data-aos-duration="850"> <!-- Texto e formulário -->

                    <!-- Texto da tela de login -->
                    <h2 class="fw-bold">
                        <span>Comece agora!</span><br>Junte-se a nós.
                    </h2>
                    <!-- /fim Texto da tela de login -->
                    
                    <form @submit="tryLogin"><!-- Formulário da tela de login -->
                        <div class="login-inputs d-flex">
                            <input type="email" placeholder="E-mail" name="email" v-model="userLogin.email" required autofocus>

                            <input type="password" placeholder="Senha" name="senha" v-model="userLogin.senha" required>
                        </div>

                        <div class="login-btn d-flex">
                            <input type="submit" class="btn fw-bold text-light" value="ENTRAR" >

                            <a class="fw-bold" type="button" data-bs-toggle="modal" data-bs-target="#formModal">Cadastrar</a>
                        </div>
                    </form> <!-- /fim Formulário da tela de login -->
                </aside> <!-- /fim Texto e formulário -->
 
                <!-- Chamando a modal do cadastro -->
                <Cadastro/>

                <article> <!-- Imagem de crianças pulando -->
                    <img src="@/assets/imgs/login-gif.svg" alt="Crianças pulando alegremente">
                </article> <!-- /fim Imagem de crianças pulando -->
            </main> <!-- /fim Tela de login -->
        </div>
    </div>
</template>

<script>

import router from '@/router';
import Cadastro from './cadastro-modal/Cadastro.vue';
import Functions from '@/services/functions/loginFunctions'

export default {
    name: "LoginPage",
    data() {
        return {
            userLogin: { //dados do get dos campos do login
                email: "",
                senha: ""
            },
            encaminhamento: "" //objeto que vai ser jogado no store - pt 2
        };
    },

    methods: {
        async tryLogin(e) {
            e.preventDefault();
            
            //chamando o retono da função aqui (definindo token, acesso e nome no store) - pt 1
            this.encaminhamento = await Functions.tryLogin(this.userLogin)
           
            //jogando os dados para o store - pt 3
            this.$store.dispatch("setDados", this.encaminhamento)
        
            //chamando o redirecionamento
            this.redirecionamento();
     
        },

        async redirecionamento() {

            if(this.$store.state.logado) {
                switch (this.$store.state.acesso) {
                    case "A": router.push("/pai"); 
                    break;
                        case "P": router.push("/prof");
                        break;
                          default: alert("Senha incorreta")
                          break;
                    }       
                }
            }

    },

    mounted() { this.redirecionamento() },

    components: { Cadastro }
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
    
    .login-inputs {
        flex-direction: column;
        font-size: .9vw;
    }
    
    aside [type="email"], aside [type="password"] {
        margin-top: 1.2vw;
        padding: 1vw;
        border-radius: 20px;
        border: 1px solid #e6e6e6;
    }
    
    /* Botões */
    
    .login-btn {
        margin-top: 2.5vw;
        font-size: .9vw;
        justify-content: space-between;
    }
    
    .login-btn input {
        padding: .8vw 2vw;
        background-color: #00a7aa;
        border-radius: 30px;
        transition: .3s;
    }
    
    .login-btn input:hover {
        background-color: #00c0c4;
    }
    
    .login-btn a {
        color: #00a7aa;
        margin-top: .8vw;
        text-decoration: none;
    }
    
    .login-btn a:hover {
        text-decoration: underline;
        color: #008183;
        text-decoration-thickness: 1.5px;
    }
    
    /* Imagem animada */
    
    article img {
        width: 28vw;
    }
    
    
    /* Modal */
    
    .modal-content {
        box-shadow: 1px 1px 12px 6px rgba(0, 0, 0, 0.274);
    }
    
    .modal-content {
        text-align: start;
    }
    
    
    /* Tabela */
    
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
    
        .tamanho-input-modal {
            width: 100%;
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