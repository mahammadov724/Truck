package codes.neriman.my_spring_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import codes.neriman.my_spring_project.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	
}
