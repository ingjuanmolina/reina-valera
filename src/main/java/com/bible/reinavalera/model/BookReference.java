package com.bible.reinavalera.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BookReference {

    @Id
    private Integer idBookReference;
    private String text;

    @ManyToOne
    @JoinColumn(name = "book_id_book")
    private Book bookIdBook;

    public Integer getIdBookReference() {
        return idBookReference;
    }

    public void setIdBookReference(Integer idBookReference) {
        this.idBookReference = idBookReference;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Book getBookIdBook() {
        return bookIdBook;
    }

    public void setBookIdBook(Book bookIdBook) {
        this.bookIdBook = bookIdBook;
    }

}
