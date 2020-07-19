package com.bible.reinavalera.controller;

import com.bible.reinavalera.model.Bible;
import com.bible.reinavalera.service.BibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bibles")
public class BibleController {

    private final BibleService bibleService;

    @Autowired
    public BibleController(BibleService bibleService) {
        this.bibleService = bibleService;
    }

    @GetMapping
    public List<Bible> findAll() {
        return bibleService.findAll();
    }
}
