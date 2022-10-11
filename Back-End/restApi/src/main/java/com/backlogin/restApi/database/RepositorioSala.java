package com.backlogin.restApi.database;

import com.backlogin.restApi.entidade.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositorioSala extends JpaRepository<Sala, Long> {

    @Query(nativeQuery = true, value = "select * from salas where tokenProf = (:tokenProf);")
    public List<Sala> findByTokenProf(String tokenProf);

}

