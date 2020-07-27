package com.bible.reinavalera.controller;

import com.bible.reinavalera.model.Verse;
import com.bible.reinavalera.service.VerseService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("search")
public class SearchController {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SearchController.class);

    private final VerseService verseService;

    public SearchController(VerseService verseService) {
        this.verseService = verseService;
    }

    @GetMapping
    public String findAll(Model model) {
        return "search";
    }

    @PostMapping("/text")
    public String findByText(@RequestParam String text, Model model) {
        LOGGER.info("Search text: {}", text);
        model.addAttribute("verses", verseService.findByTextContaining(text));
        return "verses";
    }
}
