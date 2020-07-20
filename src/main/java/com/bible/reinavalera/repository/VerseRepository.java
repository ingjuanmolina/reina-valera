package com.bible.reinavalera.repository;

import com.bible.reinavalera.model.Verse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface VerseRepository extends JpaRepository<Verse, Integer>, Repository<Verse, Integer> {

    List<Verse> findByTextContaining(String text);
}
