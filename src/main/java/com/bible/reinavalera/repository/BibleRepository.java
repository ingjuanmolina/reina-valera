package com.bible.reinavalera.repository;

import com.bible.reinavalera.model.Bible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibleRepository extends JpaRepository<Bible, Integer> {
}
