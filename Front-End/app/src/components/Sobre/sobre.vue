<template>

<header><!-- início Cabeçalho -->
        
        <nav class="navbar navbar-expand-lg"><!-- Menu -->

            <div class="logo text-uppercase"><!-- Logotipo "Todos Por Um" -->
                <a class="text-decoration-none" href="index.html">
                    <h1 class="fw-bold"><span>Todos</span><br>Por Um</h1>
                </a>
            </div><!-- /fim Logotipo "Todos Por Um" -->
        
            <!-- Menu responsivo -->

            <div id="navegacao" class="collapse navbar-collapse">
                <ul class="navbar-nav ms-auto fw-bold">
                    <li href="#" class="nav-item">
                        <a class="nav-link">Início</a>
                    </li>

                    <li href="#" class="nav-item">
                        <a class="nav-link">Serviços</a>
                    </li>

                    <li href="sobre.html" class="nav-item">
                        <a class="nav-link ativo">Sobre</a>
                    </li>

                    <li href="#" class="nav-item">
                        <a class="nav-link">Contato</a>
                    </li>
                </ul>
            </div>

            <!-- Botão "hambúrguer" do menu responsivo -->
            <button class="navbar-toggler" data-toggle="collapse" data-target="#navegacao">
                <span class="navbar-toggler-icon"></span>
            </button>
            <!-- /fim Botão "hambúrguer" do menu responsivo -->
            
            <!-- /fim Menu responsivo -->

        </nav> <!-- /fim Menu -->

    </header> <!-- /fim Cabeçalho -->

    <div class="caixa1">    <!-- Primeria imagem -->
        <div class="conteudo-titulo">   <!-- Texto na imagem -->
            <span class="titulo">Objetivo</span>
        </div>
    </div>

    <div class="conteudo">  <!-- Texto entre as imagens -->
        <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Quis rem omnis distinctio magni minima architecto laborum, quisquam doloribus, voluptates reprehenderit animi voluptatibus quasi sint itaque recusandae labore consequuntur veritatis totam?
        </p>

        <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Necessitatibus quam quo distinctio nostrum repellendus ducimus recusandae reprehenderit, tempore ipsum cumque voluptatibus exercitationem mollitia ab, optio asperiores aut aliquid fuga. Nam?
        </p>
    </div>

    <div class="caixa2">    <!-- Segunga imagem -->
        <div class="conteudo-titulo">
            <span class="titulo">Quem somos?</span>
        </div>
    </div>

    <div class="conteudo">  <!-- Texto entre as imagens -->
        <p>
            Todos Por Um é um projeto criado com o proposito de ajudar, auxiliar e unir a sala de aula, fazendo com que todos os alunos, independente de qualquer tipo de fator se sintam acolhidos e bem cuidados.
        </p>

        <p>
            O Projeto possui foco principal em auxiliar crianças com deficiências, dando ferramentas aos docentes e os pais para que as crianças não se sintam isoladas das demais. Com brincadeiras e atividades especificas para cada aluno e sua necessidade o usuário também conta com uma ferramenta de administração e observação, tendo assim na palma da mão os utensílios necessários para uma boa qualidade de vida do aluno. 
            E é assim que agimos Todos por Um! 
        </p>
    </div>

    <div class="caixa3">    <!-- Segunga imagem -->
        <div class="conteudo-titulo">
            <span class="titulo">Iniciativa Todos Por Um</span>
        </div>
    </div>

</template>

<script>
    
    export default {
        name: "sobre"
    }

</script>

<style>


/* Configuração padrão */
body, html {
    margin: 0;
    font: 16px "LAto", sans-serif;
    color: black;
    height: 100%;
}

/* Formatação do Cabeçalho (logo) */

.logo h1 {
    color: black;
    font-size: 4vw;
    line-height: 3.5vw;
}

.logo span {
    color: #00a7aa;
}

.logo a:hover {
    text-decoration: none;
}


/* Menu de navegação */

.nav-item {
    margin-left: 3.5vw;
    cursor: pointer;
    font-weight: bold;
    font-size: 1.5vw;
}

.nav-link {
    color: black;
    transition: .3s;
}

.ativo {
    color: #00a7aa;
    cursor: auto;
}

.nav-link:hover {
    color: #00a7aa;
}



.conteudo {
    background-color: white;
    text-align: justify;
    padding: 50px 80px;
}

h3 {
    text-transform: uppercase;
    color: #111;
    text-align: center;
}

p {
    margin-bottom: 20px;
}

/* Efeito Parallax */

.caixa1, .caixa2, .caixa3 {
    position: relative;
    height: 100%;
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
    background-position: center;
    opacity: .7;
}

.caixa1 {
    background-image: url('./imgs/img1.jpeg');
}

.caixa2 {
    background-image: url('./imgs/img2.jpeg');
}

.caixa3 {
    background-image: url('./imgs/img3.jpeg');
}


.conteudo-titulo {
    position: absolute;
    top: 45%;
    width: 100%;
    text-align: center;
}

.conteudo-titulo span.titulo {
    color: #fff;
    background-color: #00a7aa;
    padding: 18px;
    font-size: 50px;
    letter-spacing: 5px;
    text-transform: uppercase;
}


</style>