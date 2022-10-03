package com.backlogin.restApi.database;

import com.backlogin.restApi.entidade.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

    public interface RepositorioAlunos extends JpaRepository<Alunos, Long> {




}
