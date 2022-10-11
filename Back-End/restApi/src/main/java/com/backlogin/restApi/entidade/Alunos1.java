package com.backlogin.restApi.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alunos1 {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nasc;

    private String sexo;
    private String turma;
    private String turno;
    private String sangue;
    private String deficiencia;
    private String nomeresp;
    private String email;
    private String numero;
    private String endereco;
    private String token;
    private String token1;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getNasc() {return nasc;}

    public void setNasc(String nasc) {this.nasc = nasc;}

    public String getSexo() {return sexo;}

    public void setSexo(String sexo) {this.sexo = sexo;}

    public String getTurma() {return turma;}

    public void setTurma(String turma) {this.turma = turma;}

    public String getTurno() {return turno;}

    public void setTurno(String turno) {this.turno = turno;}

    public String getSangue() {return sangue;}

    public void setSangue(String sangue) {this.sangue = sangue;}

    public String getDeficiencia() {return deficiencia;}

    public void setDeficiencia(String deficiencia) {this.deficiencia = deficiencia;}

    public String getNomeresp() {return nomeresp;}

    public void setNomeresp(String nomeresp) {this.nomeresp = nomeresp;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getNumero() {return numero;}

    public void setNumero(String numero) {this.numero = numero;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getToken() {return token;}

    public void setToken(String token) {this.token = token;}

    public String getToken1() {return token1;}

    public void setToken1(String token1) {this.token1 = token1;}

}
