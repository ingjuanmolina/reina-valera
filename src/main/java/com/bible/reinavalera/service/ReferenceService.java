package com.bible.reinavalera.service;

import com.bible.reinavalera.model.BookReference;
import com.bible.reinavalera.repository.ReferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferenceService {

    private final ReferenceRepository referenceRepository;

    @Autowired
    public ReferenceService(ReferenceRepository referenceRepository) {
        this.referenceRepository = referenceRepository;
    }

    public List<BookReference> findAll() {
        return referenceRepository.findAll();
    };
}
