package com.backlogin.restApi.database;

import com.backlogin.restApi.entidade.Alunos1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositorioAlunos1 extends JpaRepository<Alunos1,Long> {

    //@Query(nativeQuery = true, value = "select * from alunos1 where token = (:token)")
    public List<Alunos1> findByToken(String token);

    //@Query(nativeQuery = true, value = "select * from alunos1 where token1 = (:token1)")
    public List<Alunos1> findByToken1(String token1);
}
