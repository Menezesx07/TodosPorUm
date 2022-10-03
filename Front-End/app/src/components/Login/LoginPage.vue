<template>

<div class="body">
        <div class="cont mx-auto">
           
            <h1>Token</h1>
           {{$store.state.token}}
           {{$store.state.acesso}}
           {{$store.state.logado}}
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

                <!-- Modal -->
                <div class="modal fade" id="formModal" tabindex="-1" aria-labelledby="labelEstatico" aria-hidden="true" data-bs-backdrop="static" data-bs-keyboard="false">
                    <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
                        <div class="modal-content mx-auto">

                            <!-- Cabeçalho do Modal -->
                            <div class="modal-header">

                                <!-- Título -->
                                <h5 class="modal-title fw-bold" id="labelEstatico">CADASTRO</h5>
                                <!-- /fim Título -->
                                
                                <!-- Botão de fechar no canto superior -->
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                <!-- /fim Botão de fechar no canto superior -->
                            </div><!-- /fim Cabeçalho do Modal -->
                            
                            <!-- Corpo do Modal -->
                            <div class="modal-body">
                                
                                <p class="mb-4 text-start">
                                    <small class="text-danger">* </small>
                                    <span class="text-secondary">Preenchimento obrigatório</span>
                                </p>

                                <!-- Formulário de cadastro -->
                                <form action="">

                                    <!-- Nome completo do aluno -->
                                    <div class="tamanho-input-modal mb-3">
                                        <label for="idNome" class="form-label">Nome Completo:</label>
                                        <small class="text-danger">*</small>

                                        <input type="text" class="form-control" name="usrNome" id="idNome" required>
                                    </div> <!-- /fim Nome do aluno -->

                                    <!-- Data de nascimento -->
                                    <div class="mb-3">
                                        <label for="idData" class="form-label">Data de nascimento:</label>
                                        <small class="text-danger">*</small>

                                        <input type="date" id="idData" class="form-control tamanho-input-modal" required>
                                    </div> <!-- /fim Data de Nascimento -->

                                    <!-- E-mail -->
                                    <div class="mb-3">
                                        <label for="idEmail" class="form-label">E-mail:</label>
                                        <small class="text-danger"> *</small>

                                        <input id="idEmail" class="form-control tamanho-input-modal" type="email" aria-describedby="emailHelp" required>

                                        <small class="text-secondary">Não compartilharemos seu e-mail com ninguém.</small>
                                    </div>  <!-- /fim E-mail -->

                                    <!-- Senha -->
                                    <div class="row coluna mb-3">
                                        <div class="col">
                                            <label for="idSenha" class="form-label">Senha:</label>
                                            <small class="text-danger">*</small>

                                            <input type="password" class="form-control" id="idSenha" minlength="8">
                                        </div>

                                        <div class="col">
                                            <label for="idConfSenha" class="form-label">Confirmar senha:</label>
                                            <small class="text-danger">*</small>

                                            <input type="password" class="form-control" id="idConfSenha">
                                        </div>
                                    </div>  <!-- /fim Senha -->

                                    <!-- Contato -->
                                    <div class="row coluna mb-3">
                                        <div class="col">
                                            <label for="idTel">Telefone:</label>

                                            <div class="input-group">
                                                <span class="input-group-text" id="basic-addon">+55</span>

                                                <input type="tel" id="idTel" class="form-control" aria-label="usrTelefone" aria-describedby="basic-addon">
                                            </div>
                                        </div>

                                        <div class="col">
                                            <label for="idCel">Celular:</label>
                                            <small class="text-danger">*</small>

                                            <input type="tel" id="idCel" class="form-control"  required>
                                        </div>
                                    </div>  <!-- /fim Contato -->

                                    <!-- Localização -->
                                    <div class="row coluna">

                                        <p>
                                            Localização:
                                            <small class="text-danger">*</small>
                                        </p>

                                        <div class="col"> <!-- CEP -->
                                            <label for="idCEP" class="form-label text-start">CEP:</label>

                                            <input type="number" id="idCEP" class="form-control" min="0" required>
                                        </div>

                                        <div class="col">  <!-- Cidade -->
                                            <label for="idCid" class="form-label text-right">Cidade:</label>

                                            <input type="text" id="idCid" class="form-control" placeholder="EX.: São Paulo" required>
                                        </div>

                                        <div class="col"> <!-- Estado -->
                                            <label for="idEstado" class="text-right">Estado:</label>
                                            
                                            <select id="idEstado" class="form-select" required>
                                                <optgroup label="Norte">
                                                    <option value="AC">Acre</option>
                                                    <option value="AP">Amapá</option>
                                                    <option value="AM">Amazonas</option>
                                                    <option value="PA">Pará</option>
                                                    <option value="RO">Rondônia</option>
                                                    <option value="RR">Roraima</option>
                                                    <option value="TO">Tocantins</option>
                                                </optgroup>

                                                <optgroup label="Nordeste">
                                                    <option value="AL">Alagoas</option>
                                                    <option value="BA">Bahia</option>
                                                    <option value="CE">Ceará</option>
                                                    <option value="MA">Maranhão</option>
                                                    <option value="PA">Paraíba</option>
                                                    <option value="PE">Pernambuco</option>
                                                    <option value="PI">Piauí</option>
                                                    <option value="RN">Rio Grande do Norte</option>
                                                    <option value="SE">Sergipe</option>
                                                </optgroup>

                                                <optgroup label="Centro-Oeste">
                                                    <option value="DF">Distrito Federal</option>
                                                    <option value="GO">Goiás</option>
                                                    <option value="MT">Mato Grosso</option>
                                                    <option value="MS">Mato Grosso do Sul</option>
                                                </optgroup>

                                                <optgroup label="Sudeste">
                                                    <option value="ES">Espírito Santo</option>
                                                    <option value="MG">Minas Gerais</option>
                                                    <option value="RJ">Rio de Janeiro</option>
                                                    <option value="SP" selected>São Paulo</option>
                                                </optgroup>

                                                <optgroup label="Sul">
                                                    <option value="PR">Paraná</option>
                                                    <option value="SC">Santa Catarina</option>
                                                    <option value="RS">Rio Grande do Sul</option>
                                                </optgroup>
                                            </select>
                                        </div> <!-- /fim Estado -->
                                    </div>  <!-- /fim Localização -->
                                </form>  <!-- /fim Formulário de cadastro -->
                            </div>  <!-- /fim Corpo do Modal -->
                            
                            <!-- Rodapé do Modal -->
                            <div class="modal-footer">
                                <!-- Botão de Enviar -->
                                <button type="button" class="btn btn-success fw-bold mx-auto">
                                    ENVIAR
                                </button>  <!-- /fim Botão de Enviar -->
                            </div>  <!-- /fim Rodapé do Modal -->
                        </div>
                    </div>
                </div>  <!-- /fim Modal -->

                <article> <!-- Imagem de crianças pulando -->
                    <img src="@/assets/imgs/login-gif.svg" alt="Crianças pulando alegremente">
                </article> <!-- /fim Imagem de crianças pulando -->
            </main> <!-- /fim Tela de login -->
        </div>
    </div>
</template>

<script>

import router from '@/router';
import Axios from '@/services/trylogin';

export default {

    name: "LoginPage",
    data(){
        return{
            userLogin: { //dados que vão para o servidor
                email: "",
                senha: ""
              
            },
            dadosBack: null,  //recebe os dados do back
            encaminhamento: {
                token: "",
                acesso: ""
            }

            
        }

    },
    methods: {
        async tryLogin(e) {
            e.preventDefault();

          
         //metodo Post com os dados do userLogin
         Axios.save(this.userLogin).then(resposta =>{ 
                this.dadosBack = resposta.data //recebendo os valores que o post gerou
                

                for(let elemento of this.dadosBack){
                   this.encaminhamento.acesso = elemento.acesso
                }

                for(let elemento of this.dadosBack){
                    this.encaminhamento.token= elemento.token
                }


               
                //jogando o token pro store
                this.$store.commit("saveToken", this.encaminhamento.token)
                this.$store.commit("saveAcesso", this.encaminhamento.acesso)
          

                //router.push para redirecionar
             /*   if (this.encaminhamento.acesso === "A") {
                    router.push("/pai")
                } else if (this.encaminhamento.acesso=== "P") {
                    router.push("/prof")
                } else {
                    alert("Login ou Senha Invalidos")
                }*/
          
               
               
             
            })

        }
    }
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
    
    /*
    aside p {
        line-height: 1.3vw;
        font-family: 'poppinslight';
        font-size: .9vw;
    }
    */
    
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