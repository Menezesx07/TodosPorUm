<template>

    <div>
        <input v-model="myName" type="text">
        <button @click.prevent.stop ="saveName">salvar</button>
    </div>
    
    
    </template>
    
    <script>
        export default {
            name: "counter",
            data(){
                return {
                    myName: ""
                }
            },
            methods: {
                saveName() {
                    //chama a action
                    this.$store.dispatch("saveFirstName", this.myName); 
    
                    //chama a mutation
                 // this.$store.commit("saveFirstName", this.myName);
                 
                }
            }
        }
    </script>