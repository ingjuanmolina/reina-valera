package com.bible.reinavalera.repository;

import com.bible.reinavalera.model.Verse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VerseRepository extends JpaRepository<Verse, Integer>, Repository<Verse, Integer> {

    List<Verse> findByTextContaining(String text);

    @Query("SELECT v FROM Verse v WHERE v.idBook.idBook = :idBook and v.chapter = :chapter")
    List<Verse> findVerseByBookAndChapter(@Param("idBook") Integer idBook, @Param("chapter") Integer chapter);

    @Query("SELECT DISTINCT(v.chapter) FROM Verse v WHERE v.idBook.idBook = :idBook")
    List<Integer> findTotalChaptersByBookId(@Param("idBook") Integer idBook);

}
