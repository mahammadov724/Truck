package codes.neriman.my_spring_project.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;

import codes.neriman.my_spring_project.entity.Authorities;

public class AuthorityRepository extends JpaRepository<Authorities ,Integer>{

	List<Authorities> findByUsername(String username) {
		return null;
	}

}
