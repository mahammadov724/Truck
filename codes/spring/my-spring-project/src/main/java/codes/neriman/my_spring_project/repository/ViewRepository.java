package codes.neriman.my_spring_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import codes.neriman.my_spring_project.entity.Book;

public interface ViewRepository extends JpaRepository<Book, Integer>{

}
