import { createRouter, createWebHistory } from 'vue-router'
import LoginView from '../views/LoginView.vue'
import PaiView from '../views/PaiView.vue'
import ProfView from '../views/ProfView.vue'
import SobreView from '../views/SobreView.vue'

const routes = [
  {
    path: '/',
    name: 'login',
    component: LoginView
  },
  {
    path: '/pai',
    name: 'pai',
    component: PaiView
  },
  {
    path: '/prof',
    name: 'prof',
    component: ProfView
  },
  {
    path: '/sobre',
    name: 'sobre',
    component: SobreView
  }
  
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
