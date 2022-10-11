package com.backlogin.restApi.Rest;

import com.backlogin.restApi.database.RepositorioAlunos1;
import com.backlogin.restApi.entidade.Alunos1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos1")
public class Alunos1Rest {

    @Autowired
    private RepositorioAlunos1 repositorioAlunos1;

   @GetMapping
    public List<Alunos1> listar() {return repositorioAlunos1.findAll();}

    @PostMapping
    public ResponseEntity<List<Alunos1>> findbyToken1(@RequestBody Alunos1 alunos1) {
       String token1 = alunos1.getToken1();

       List<Alunos1> result = repositorioAlunos1.findByToken1(token1);

       return ResponseEntity.ok(result);
    }



}
