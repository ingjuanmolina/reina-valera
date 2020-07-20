package com.bible.reinavalera.service;

import com.bible.reinavalera.model.Verse;
import com.bible.reinavalera.repository.VerseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerseService {

    private final VerseRepository verseRepository;

    @Autowired
    public VerseService(VerseRepository verseRepository) {
        this.verseRepository = verseRepository;
    }

    public List<Verse> findAll() {
        return verseRepository.findAll();
    }

    public List<Verse> findByTextContaining(String text) {
        return verseRepository.findByTextContaining(text);
    }
}
