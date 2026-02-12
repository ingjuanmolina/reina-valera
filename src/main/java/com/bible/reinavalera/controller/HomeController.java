package com.bible.reinavalera.controller;

import com.bible.reinavalera.model.Book;
import com.bible.reinavalera.model.Verse;
import com.bible.reinavalera.service.BookService;
import com.bible.reinavalera.service.VerseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Random;

@Controller
public class HomeController {
    private static final Random RANDOM = new Random();
    private final BookService bookService;
    private final VerseService verseService;

    @Autowired
    public HomeController(BookService bookService, VerseService verseService) {
        this.bookService = bookService;
        this.verseService = verseService;
    }

    @GetMapping("/home")
    public String home(Model model) {
        Book book = getRandomBook();
        Verse verse = getRandomVerse(book);
        model.addAttribute("book", book);
        model.addAttribute("verse", verse);
        return "home";
    }

    private Book getRandomBook() {
        return bookService.getAllBooks().get(1 + RANDOM.nextInt(66));
    }

    private Verse getRandomVerse(Book book) {
        List<Integer> chapters = verseService.findTotalChaptersByBookId(book.getIdBook());
        List<Verse> verses = verseService.findByBookAndChapter(book.getIdBook(), RANDOM.nextInt(chapters.size()));
        return verses.get(RANDOM.nextInt(verses.size()));
    }
}
