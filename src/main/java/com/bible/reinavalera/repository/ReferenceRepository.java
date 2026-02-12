package com.bible.reinavalera.repository;

import com.bible.reinavalera.model.BookReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferenceRepository extends JpaRepository<BookReference, Integer> {
}
