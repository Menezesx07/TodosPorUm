package com.backlogin.restApi.Rest;

import com.backlogin.restApi.database.RepositorioBdlogin;
import com.backlogin.restApi.entidade.Bdlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/login")
public class bdLoginRest {

    @Autowired
    private RepositorioBdlogin repositorio; //tem todas as operações do crud nele
    /************************************************************************************************/


    //api de consulta no mysql
    @PostMapping
    public ResponseEntity<List<Bdlogin>> findbyEmailAndSenha(@RequestBody Bdlogin bdlogin){ //recebe o obejeto inteiro

        String email = bdlogin.getEmail(); //define a variavel de email com os dados do json
        String senha = bdlogin.getSenha(); //define a variavel de senha com os dados do json

        //joga as variaveis para o repositorio chamando a função que está lá (RepositorioBdlogin.java)
        List<Bdlogin> result = repositorio.findByEmailAndSenha(email, senha);

        //retorna o resultado
        return ResponseEntity.ok(result);
    }



    /************************************************************************************************/


   @GetMapping
    public List<Bdlogin> listar() {
        return repositorio.findAll();
    }




}
