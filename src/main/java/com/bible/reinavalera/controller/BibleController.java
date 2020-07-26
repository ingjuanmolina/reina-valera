package com.bible.reinavalera.controller;

import com.bible.reinavalera.service.BibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("bibles")
public class BibleController {

    private final BibleService bibleService;

    @Autowired
    public BibleController(BibleService bibleService) {
        this.bibleService = bibleService;
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("bibles", bibleService.findAll());
        return "bibles";
    }
}
