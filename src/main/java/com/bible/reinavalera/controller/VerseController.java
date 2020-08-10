package com.bible.reinavalera.controller;

import com.bible.reinavalera.model.Verse;
import com.bible.reinavalera.service.BookService;
import com.bible.reinavalera.service.VerseService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("verses")
public class VerseController {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(VerseController.class);

    private final VerseService verseService;
    private final BookService bookService;

    @Autowired
    public VerseController(VerseService verseService, BookService bookService) {
        this.verseService = verseService;
        this.bookService = bookService;
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("verses", verseService.findAll());
        return "verses";
    }

    @GetMapping("/text/{text}")
    public List<Verse> findByText(@PathVariable("text") String text) {
        LOGGER.info("Search text: {}", text);
        return verseService.findByTextContaining(text);
    }

    @GetMapping("/book/{bookId}/chapter/{chapter}")
    public String findByBookAndChapter(@PathVariable("bookId") Integer bookId, @PathVariable("chapter") Integer chapter, Model model) {
        LOGGER.info("Book: {} Chapter: {}", bookId, chapter);
        List<Verse> verses = verseService.findByBookAndChapter(bookId, chapter);
        model.addAttribute("verses", verses);
        model.addAttribute("book", verses.get(0).getIdBook());
        model.addAttribute("chapter", chapter);
        return "verses-by-book-and-chapter.html";
    }
}
