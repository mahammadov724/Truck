package codes.neriman.my_spring_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import codes.neriman.my_spring_project.entity.Reader;

public interface ReaderRepository extends JpaRepository<Reader, Long> {
}
