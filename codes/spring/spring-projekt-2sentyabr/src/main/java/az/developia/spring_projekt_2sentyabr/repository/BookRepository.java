package az.developia.spring_projekt_2sentyabr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.spring_projekt_2sentyabr.entity.Book;
import az.developia.spring_projekt_2sentyabr.entity.Book1;

public interface BookRepository extends JpaRepository<Book1, Long> {

	Book1 save(Book book);
}