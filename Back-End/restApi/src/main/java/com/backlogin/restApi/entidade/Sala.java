package com.backlogin.restApi.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sala {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String sala;
    private String tokenprof;
    private String Tokenaluno;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSala() {
        return this.sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getTokenprof() {
        return this.tokenprof;
    }

    public void setTokenprof(String tokenprof) {
        this.tokenprof = tokenprof;
    }

    public String getTokenaluno() {
        return this.Tokenaluno;
    }

    public void setTokenaluno(String tokenaluno) {
        this.Tokenaluno = tokenaluno;
    }
}
