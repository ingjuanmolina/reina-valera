package com.bible.reinavalera.controller;

import com.bible.reinavalera.model.Verse;
import com.bible.reinavalera.service.VerseService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("verses")
public class VerseController {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(VerseController.class);

    private VerseService verseService;

    @Autowired

    public VerseController(VerseService verseService) {
        this.verseService = verseService;
    }

    @GetMapping
    public List<Verse> findAll() {
        return verseService.findAll();
    }

    @GetMapping("/text/{text}")
    public List<Verse> findByText(@PathVariable("text") String text) {
        LOGGER.info("Search text: {}", text);
        return verseService.findByTextContaining(text);
    }
}
