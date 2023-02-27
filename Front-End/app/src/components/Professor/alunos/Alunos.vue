<template>

    <label id="sala" class="fw-bold text-uppercase text-center">{{this.SalaTokenalunoPros.s}}</label>
    <label class="d-block text-center fs-4">Prof. Nome</label>
                <main role="main">
                    <div id="acordeao" class="accordion overflow-auto mx-auto border border-2 rounded" >
                        <div class="accordion-item" id="accordion-1" v-for="alunos in alunos" :key="alunos.id">
                          
                            <h2 class="accordion-header" id="accordion-header-1">
                                <button class="accordion-button collapsed fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#accordion-collapse-1" aria-expanded="false" aria-controls="accordion-collapse-1" >
                                    <p class="col">{{alunos.nome}}</p>
                                     <div>
                                        <img class="me-3" src="@/assets/imgs/fita.png" alt="Aluno(a) deficiente" title="Este aluno(a) possui deficiência." >
                                     </div>   
                                    
    
                                    <img src="https://picsum.photos/45" class="border border-info rounded-circle me-2">
                                </button>
                            </h2>
    
                            <div id="accordion-collapse-1" class="accordion-collapse collapse" data-bs-parent="#acordeao" aria-labelledby="accordion-header-1">
                                <div class="accordion-body mx-auto">
                                    <div class="d-flex">
                                        <div class="col text-start fw-bold">
                                            <p>Id</p>
                                            <p>Nome:</p>
                                            <p>Turma:</p>
                                            <p>Turno:</p>
                                            <p>Data de Nascimento:</p>
                                            <p>Sexo:</p>
                                            <p>Tipo Sanguíneo:</p>
                                            <p>Deficiência:</p>
                                            <p>Nome do Responsável:</p>
                                            <p>E-mail:</p>
                                            <p>Número:</p>
                                            <p>Endereço:</p>
                                            <!-- Botão de Dicas -->
                                            <button class="btn btn-accordion text-light fw-bold" @click="atividades">Dicas</button>
                                        </div>
    
                                        <div class="col text-end">
                                            <p>{{alunos.id}}</p>
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
                                            <!-- Botão de Editar -->
                                            <button class="btn btn-accordion text-light fw-bold">Editar</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
    
                    <div id="linkVoltar" class="text-center">
                        <span class="material-icons">arrow_back</span>
                        <label>Voltar</label>
                    </div>
                </main>
    </template>

<script>

import Axios from "@/services/restApi/restServices"
import router from '@/router';

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
        },
        atividades () {
            router.push("/atividades");
        }
    },

    mounted() {

        this.getAlunosBack();


        }
    }

</script>

<style scoped>
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

    /* Tela do(a) professor(a) */
    #sala {
        font-size: 2vw;
        width: 100%;
    }

    main {
        margin-top: 2vw;
    }

    /* Botão de "voltar" */
    #linkVoltar {
        color: #00a7aa;
        cursor: pointer;
        border-radius: 2vw;
        padding: .3vw;
        padding-right: .5vw;
        width: 6vw;
        margin: 1vw 0 0 auto;
    }

    #linkVoltar:hover {
        transition: .2s;
        color: white;
        background-color: #00a7aa;
    }

    #linkVoltar label {
        font-size: 1.15vw;
        margin-left: .5vw;
        cursor: pointer;
    }

    #linkVoltar span {
        font-size: 1.1vw;
    }

    /* Acordeão */
    .accordion {
        width: 75%;
        height: 45vh;
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

    main .accordion-button:hover {
        background-color: #00babd4d;
        color: white;
        border-color: #00babd4d;
    }

    /* Corpo do acordeão*/
    .accordion-body {
        font-size: .9vw;
        width: 80%;
    }

    .accordion-body p {
        border-bottom: 1px solid #00a7aa;
    }

    .btn-accordion {
        background-color: #00a7aa;
        transition: .3s;
    }

    .btn-accordion:hover {
        background-color: #00bfc2;
    }
    
    /* ESTILIZAÇÃO DO MENÚ RESPONSIVO */
    @media (max-width: 575.98px) {
        .cont {
            width: 95vw;
        }

        #sala {
            font-size: 7vw;
        }

        .accordion {
            width: 100%;
        }

        .accordion-header button {
            font-size: 4.5vw;
        }

        .accordion img {
            width: 7vw;
        }

        .accordion-body {
            font-size: 3.3vw;
            width: 100%;
        }

        #linkVoltar {
            margin: 5vw auto 0 auto;
            width: 22vw;
            background-color: #00a7aa;
            color: white;
            padding: 1vw;
        }

        #linkVoltar label {
            font-size: 5vw;
        }

        #linkVoltar span {
            font-size: 4vw;
        }
    }

    @media (min-width: 576px) and (max-width: 767.98px) {

        /* Título da sala */
        #sala {
            font-size: 5vw;
        }

        /* Accordion */
        .accordion {
            width: 90%;
        }

        .accordion-header button {
            font-size: 4vw;
        }

        .accordion img {
            width: 5vw;
        }

        .accordion-body {
            font-size: 3.2vw;
            width: 100%;
        }

        #linkVoltar {
            margin: 5vw auto 0 auto;
            width: 20vw;
            background-color: #00a7aa;
            color: white;
            padding: 1vw;
        }

        #linkVoltar label {
            font-size: 4vw;
            margin-left: 2vw;
        }

        #linkVoltar span {
            font-size: 3vw;
        }
    }

    @media (min-width: 768px) and (max-width: 1399.98px) {
        
        /* Título da sala */
        #sala {
            font-size: 3.5vw;
        }

        /* Accordion */
        .accordion {
            width: 100%;
        }

        .accordion-header button {
            font-size: 2.5vw;
        }

        .accordion-body {
            font-size: 2vw;
            width: 85%;
        }

        /* Botão de "voltar" */
        #linkVoltar {
            margin-top: .5vw;
            color: #00a7aa;
            cursor: pointer;
            border-radius: 2vw;
            padding: .5vw;
            padding-right: .5vw;
            width: 12vw;
            margin-left: auto;
        }

        #linkVoltar label {
            font-size: 2vw;
            margin-left: 1.5vw;
            cursor: pointer;
        }

        #linkVoltar span {
            font-size: 1.5vw;
        }
    }
</style>