package codes.neriman.my_spring_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import codes.neriman.my_spring_project.entity.Book;
import codes.neriman.my_spring_project.responce.BookResponce;

public interface BookRepository extends JpaRepository<Book, Integer>{

	BookResponce pagination(Integer begin, Integer length);

	List<String> findAllBookTitles();

	void deleteBookInfo(Integer id);

	List<Book> findByUserId(Integer id);

}
