package com.backlogin.restApi;

import com.backlogin.restApi.database.RepositorioAlunos;
import com.backlogin.restApi.entidade.Alunos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunosRest {

    @Autowired
    private RepositorioAlunos repositorio;

    @GetMapping
    public List<Alunos> listar() {
        return repositorio.findAll();
    }


    @DeleteMapping
    public void excluir(@RequestBody Alunos alunos){
        repositorio.delete(alunos);
    }
}
