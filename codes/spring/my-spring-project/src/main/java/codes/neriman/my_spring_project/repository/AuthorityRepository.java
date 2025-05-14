package codes.neriman.my_spring_project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;

import codes.neriman.my_spring_project.entity.Authorities;
import codes.neriman.my_spring_project.entity.Reader;

public interface AuthorityRepository extends JpaRepository<Authorities ,Integer>{
	 List<Authorities> findUserAuthority(String username);

}
