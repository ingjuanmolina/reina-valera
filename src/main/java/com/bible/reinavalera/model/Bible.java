package com.bible.reinavalera.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bible {

    @Id
    private Integer idBible;

    private String name;
    private String abreviation;
    private String comment;
    private String fuente;
    int apocrifa;
    int fuertes;

    public Integer getIdBible() {
        return idBible;
    }

    public void setIdBible(Integer idBible) {
        this.idBible = idBible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public int getApocrifa() {
        return apocrifa;
    }

    public void setApocrifa(int apocrifa) {
        this.apocrifa = apocrifa;
    }

    public int getFuertes() {
        return fuertes;
    }

    public void setFuertes(int fuertes) {
        this.fuertes = fuertes;
    }
}
