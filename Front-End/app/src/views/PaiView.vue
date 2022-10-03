<template>

<Header/>
<PaiPage/>

</template>

<script>
import PaiPage from '@/components/Pai/PaiPage.vue';
import Header from '@/components/Header/Header.vue';

export default {
    name: "PaiView",
    components: { PaiPage, Header }
}

</script>

