package com.bible.reinavalera.controller;

import com.bible.reinavalera.model.BookReference;
import com.bible.reinavalera.repository.ReferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("references")
public class ReferenceController {

    private final ReferenceRepository referenceRepository;

    @Autowired
    public ReferenceController(ReferenceRepository referenceRepository) {
        this.referenceRepository = referenceRepository;
    }

    @GetMapping
    public List<BookReference> findAll() {
        return referenceRepository.findAll();
    }
}
