package com.bible.reinavalera.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idBook")
    @JsonIgnore
    private List<Verse> verses;

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

    public List<Verse> getVerses() {
        return verses;
    }

    public void setVerses(List<Verse> verses) {
        this.verses = verses;
    }
}
