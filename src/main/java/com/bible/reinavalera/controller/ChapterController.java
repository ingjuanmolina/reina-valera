package com.bible.reinavalera.controller;

import com.bible.reinavalera.service.BookService;
import com.bible.reinavalera.service.VerseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("chapters")
public class ChapterController {

    private final BookService bookService;
    private final VerseService verseService;

    @Autowired
    public ChapterController(BookService bookService, VerseService verseService) {
        this.bookService = bookService;
        this.verseService = verseService;
    }

    @GetMapping("/book/{idBook}")
    public String getAllChapters(@PathVariable("idBook") Integer idBook, Model model) {
        model.addAttribute("chapters", verseService.findChaptersByBookId(idBook));
        model.addAttribute("book", bookService.findById(idBook));
        return "chapters";
    }
}
