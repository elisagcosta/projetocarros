package com.carros.domain;

import jdk.jfr.events.CertificateId;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.Generated;

@EntityScan()
public class Carro {

    @Id
    @Generated(strategy = GenerationType.AUTO)
    private Long id;


    private String Nome;

    public Carro(Long id, String nome) {
        this.id = id;
        this.Nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
