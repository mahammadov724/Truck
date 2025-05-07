package codes.neriman.my_spring_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import codes.neriman.my_spring_project.entity.Book;
import codes.neriman.my_spring_project.entity.Reader;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	 @Query(value = "SELECT title FROM book", nativeQuery = true)
	    List<String> findAllBookTitles();
}
