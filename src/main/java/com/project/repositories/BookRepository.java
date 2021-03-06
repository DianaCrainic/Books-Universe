package com.project.repositories;

import com.project.entities.Author;
import com.project.entities.Book;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;

/**
 * Book Repository
 */
public interface BookRepository extends CrudRepository<Book, Integer> {
    @Transactional
    @Modifying
    @Query("update Book b set b.title = :title where b.id = :id")
    void updateTitle(@Param("id") Integer id, @Param("title") String title);

}
