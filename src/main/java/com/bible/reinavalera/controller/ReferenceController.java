package com.bible.reinavalera.controller;

import com.bible.reinavalera.model.BookReference;
import com.bible.reinavalera.service.ReferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("references")
public class ReferenceController {

    private final ReferenceService referenceService;

    @Autowired
    public ReferenceController(ReferenceService referenceService) {
        this.referenceService = referenceService;
    }

    @GetMapping
    public List<BookReference> findAll() {
        return referenceService.findAll();
    }
}
