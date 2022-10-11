package com.backlogin.restApi.database;

import com.backlogin.restApi.entidade.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioAlunos extends JpaRepository<Alunos, Long> {


}
