<template>
   

    <LoginPage/> 
    
   <!--<div class = "main">

                <div>
                {{ $store.state.counter}}
                {{ $store.state.firstName}}
                </div>

                <div>
                <button @click ="$store.commit('decrement')">Decrement</button>
                <button @click ="$store.commit('increment')">Increment</button>
                </div>

                <Counter/>
    </div>--> 
</template>

<script>

import LoginPage from '@/components/Login/LoginPage.vue';

import Counter from '@/components/counter.vue';



export default {
    name: "LoginView",
    components: { LoginPage, Counter }
}

</script>