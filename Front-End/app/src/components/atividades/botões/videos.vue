<template>
    

    <div class="container">
        <a class="card" style="width: 16em;" href="https://www.youtube.com/watch?v=EHuY7x2zyuU&t=35s"
target="_blank">
            <img src="@/assets/imgs/conhecendo.png" class="card-img-top" alt="...">
                <div class="card-body">
                    <p class="card-text">Conhecendo o Autismo.</p>
                    <br><br>
                    <p>Autor: Figuty Carwalho</p>
                </div>
        </a>
        <a class="card" style="width: 14em;" href="https://www.youtube.com/watch?v=pyHq9BcFW1c&t=122s"
target="_blank">
            <img src="@/assets/imgs/acalmando.png" class="card-img-top" alt="..." >
                <div class="card-body">
                    <p class="card-text">Como Lidar e Acalmar Uma Criança Autista em Crise</p>
                    <p>Autor: Marcelo Reis</p>
                </div>
        </a>
        <a class="card" style="width: 14em;" href="https://www.youtube.com/watch?v=c0fEfl9e2tw"
target="_blank">
            <img src="@/assets/imgs/aula.png" class="card-img-top" alt="...">
                <div class="card-body">
                    <p class="card-text">Como Dar Aula Para Crianças Autistas </p>
                    <br>
                    <p>Autor: Prof. Tatiane Anzini</p>
                </div>
        </a>
    </div>


    
    <div class="container">
        <a class="card" style="width: 16em;" href="https://www.youtube.com/watch?v=oe_AZ_i1gx4"
target="_blank">
            <img src="@/assets/imgs/atividades.png" class="card-img-top" alt="...">
                <div class="card-body">
                    <p class="card-text">Como Dar Aulas Para Crianças Autistas</p>
                    <br>
                    <p>Autor: Dra Maria Claudia Brito</p>
                </div>
        </a>
        <a class="card" style="width: 14em;" href="https://www.youtube.com/watch?v=UnZFL_QAlbE"
target="_blank">
            <img src="@/assets/imgs/agressivo.png" class="card-img-top" alt="...">
                <div class="card-body">
                    <p class="card-text">Como Reduzir Comportamentos Agressivos</p>
                    <br>
                    <p>Autor: Dr. Thiago Lopes</p>
                </div>
        </a>
        <a class="card" style="width: 14em;" href="https://www.youtube.com/watch?v=toL-y4IJd_A"
target="_blank">
            <img src="@/assets/imgs/nunca.png" class="card-img-top" alt="...">
                <div class="card-body">
                    <p class="card-text">Coisas Para Nunca Serem Ditas</p>
                    <br>
                    <br>
                    <p>Autor: Mayra Gaiato</p>
                </div>
        </a>
    </div>

</template>

<script>
export default {
    name: 'videos'
}
</script>

<style scoped>

.container {
    width: 100%;
    height: 300px;
    display: flex;
    flex-direction: row;
    margin-bottom: 10px;
}

.card {
    margin-left: 30px;
    text-decoration: none;
    color: black;
}

</style>