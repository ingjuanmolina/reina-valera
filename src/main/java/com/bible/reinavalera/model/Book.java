package com.bible.reinavalera.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Book {

    @Id
    private Integer idBook;

    private String name;
    private String testament;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bookIdBook")
    @JsonIgnore
    private List<BookReference> references;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idBook")
    @JsonIgnore
    private List<Verse> verses;

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTestament() {
        return testament;
    }

    public void setTestament(String testament) {
        this.testament = testament;
    }

    public List<BookReference> getReferences() {
        return references;
    }

    public void setReferences(List<BookReference> references) {
        this.references = references;
    }

    public List<Verse> getVerses() {
        return verses;
    }

    public void setVerses(List<Verse> verses) {
        this.verses = verses;
    }
}
