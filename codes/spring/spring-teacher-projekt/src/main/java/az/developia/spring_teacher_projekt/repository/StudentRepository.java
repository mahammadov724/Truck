package az.developia.spring_teacher_projekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import az.developia.spring_teacher_projekt.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
