package com.bible.reinavalera.service;

import com.bible.reinavalera.model.Bible;
import com.bible.reinavalera.repository.BibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibleService {

    private final BibleRepository bibleRepository;

    @Autowired
    public BibleService(BibleRepository bibleRepository) {
        this.bibleRepository = bibleRepository;
    }

    public List<Bible> findAll() {
        return bibleRepository.findAll();
    }
}
