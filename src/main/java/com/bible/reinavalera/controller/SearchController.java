package com.bible.reinavalera.controller;

import com.bible.reinavalera.model.Verse;
import com.bible.reinavalera.service.BookService;
import com.bible.reinavalera.service.VerseService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("search")
public class SearchController {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SearchController.class);

    private final BookService bookService;
    private final VerseService verseService;

    public SearchController(BookService bookService, VerseService verseService) {
        this.bookService = bookService;
        this.verseService = verseService;
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "search";
    }

    @PostMapping("/text")
    public String findByText(@RequestParam String text, Model model) {
        LOGGER.info("Search text: {}", text);
        model.addAttribute("verses", verseService.findByTextContaining(text));
        return "verses";
    }
}
