<template>

<p class="float-end fs-6">Prof. {{$store.state.nome}}</p>
<p class="sala fw-bold text-uppercase" id="sala">{{this.SalaTokenalunoPros.s}}</p>
            <main role="main" class="main-prof">
                <div id="acordeao" class="accordion overflow-auto mx-auto border border-2 rounded" >
                    <div class="accordion-item" id="accordion-1" v-for="alunos in alunos" :key="alunos.id">
                      
                        <h2 class="accordion-header" id="accordion-header-1" >
                            <button class="accordion-button collapsed fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#accordion-collapse-1" aria-expanded="false" aria-controls="accordion-collapse-1" >
                                <p class="col">{{alunos.nome}}</p>
                                    
                                <img class="me-3 fs-6" src="@/assets/imgs/fita.png" alt="Aluno(a) deficiente" title="Este aluno(a) possui deficiência.">

                                <img src="https://picsum.photos/45" class="border border-info rounded-circle me-2">
                            </button>
                        </h2>

                        <div id="accordion-collapse-1" class="accordion-collapse collapse" data-bs-parent="#acordeao" aria-labelledby="accordion-header-1">
                            <div class="accordion-body mx-auto">
                                <div class="d-flex">
                                    <div class="col text-start fw-bold">
                                        <p>Nome:</p>
                                        <p>Turma:</p>
                                        <p>Turno</p>
                                        <p>Data de Nascimento:</p>
                                        <p>Sexo:</p>
                                        <p>Tipo Sanguíneo:</p>
                                        <p>Deficiência:</p>
                                        <p>Nome do Responsavel:</p>
                                        <p>E-mail:</p>
                                        <p>Número:</p>
                                        <p>Endereço:</p>
                                    </div>

                                    <div class="col text-end">
                                        <p>{{alunos.nome}}</p>
                                        <p>{{alunos.turma}}</p>
                                        <p>{{alunos.turno}}</p>
                                        <p>{{alunos.nasc}}</p>
                                        <p>{{alunos.sexo}}</p>
                                        <p>{{alunos.sangue}}</p>
                                        <p>{{alunos.deficiencia}}</p>
                                        <p>{{alunos.nomeresp}}</p>
                                        <p>{{alunos.email}}</p>
                                        <p>{{alunos.numero}}</p>
                                        <p>{{alunos.endereco}}</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                      </div>
                </div>
            </main>

</template>

<script>

import Axios from "@/services/restApi/restServices"

    export default {
        name: "Alunos",
        props: {
        tokenAlunoProps: String, //recebendo via props o token do aluno do profpage
        SalaTokenalunoPros: Object
    }, 
    data() {
        return {
            alunos: null, //armazenando os dados de retorno do back-end
            tokenAluno: {token1: this.SalaTokenalunoPros.t} //convertendo para json
        }
    },
    
    methods: {
        getAlunosBack(){ //chamando os alunos do banco com o token da sala (dois digitos)
           Axios.getAlunos(this.tokenAluno).then(resposta => this.alunos = resposta.data)
           console.log(this.tokenAluno)
        }
    },

    mounted() {

        this.getAlunosBack();
        console.log(this.tokenAluno)

        }
    }

</script>

<style scoped>



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