package codes.neriman.my_spring_project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import codes.neriman.my_spring_project.entity.Reader;

public interface ReaderRepository extends JpaRepository<Reader, Integer> {

	Optional<Reader> findByUsername(String username);

	Reader getUserByUsername(String username);
	
}
