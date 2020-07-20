package com.bible.reinavalera.model;

import javax.persistence.*;

@Entity
//@NamedQuery(name = "Verse.findByText", query = "SELECT v FROM Verse v WHERE LOWER(v.text) LIKE LOWER(?1)")
public class Verse {

    @Id
    private Integer idVerse;

    private Integer chapter;
    private Integer verse;
    private String text;

    @ManyToOne
    @JoinColumn(name = "id_bible")
    private Bible idBible;

    @ManyToOne
    @JoinColumn(name = "id_book")
    private Book idBook;

    public Integer getIdVerse() {
        return idVerse;
    }

    public void setIdVerse(Integer idVerse) {
        this.idVerse = idVerse;
    }

    public Integer getChapter() {
        return chapter;
    }

    public void setChapter(Integer chapter) {
        this.chapter = chapter;
    }

    public Integer getVerse() {
        return verse;
    }

    public void setVerse(Integer verse) {
        this.verse = verse;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Bible getIdBible() {
        return idBible;
    }

    public void setIdBible(Bible idBible) {
        this.idBible = idBible;
    }

    public Book getIdBook() {
        return idBook;
    }

    public void setIdBook(Book idBook) {
        this.idBook = idBook;
    }
}
