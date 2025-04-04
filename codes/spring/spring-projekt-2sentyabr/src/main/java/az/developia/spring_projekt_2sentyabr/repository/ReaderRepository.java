package az.developia.spring_projekt_2sentyabr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.spring_projekt_2sentyabr.entity.Reader;

public interface ReaderRepository extends JpaRepository<Reader, Long> {
}