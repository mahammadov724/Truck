package codes.neriman.my_spring_project.repository;

import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import codes.neriman.my_spring_project.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

	Optional<User> findByUsername(String username);

}
