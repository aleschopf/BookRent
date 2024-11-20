package tech.lastbox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.lastbox.entities.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
