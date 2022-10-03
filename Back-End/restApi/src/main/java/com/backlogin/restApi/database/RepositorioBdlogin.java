package com.backlogin.restApi.database;

import com.backlogin.restApi.entidade.Bdlogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositorioBdlogin extends JpaRepository <Bdlogin,Long> {

      //alterar para "select acesso,token" para retornar apenas o que eu quero
      //alterando no @Query não funciona (erro 500)
      @Query(nativeQuery = true, value = "select * from bdlogin where email = (:email) and senha = (:senha)")
      public List<Bdlogin> findByEmailAndSenha(String email, String senha);




}
