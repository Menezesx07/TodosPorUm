package com.backlogin.restApi.Rest;

import com.backlogin.restApi.database.RepositorioSala;
import com.backlogin.restApi.entidade.Bdlogin;
import com.backlogin.restApi.entidade.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sala")
public class SalaRest {

    @Autowired
    private RepositorioSala repositoriSala;



    @PostMapping
    public ResponseEntity<List<Sala>>  findbyTokenProf(@RequestBody Sala sala) {

        String tokenProf = sala.getTokenprof();

        List<Sala> result = repositoriSala.findByTokenProf(tokenProf);

        return ResponseEntity.ok(result);

    }


}
