package codes.neriman.my_spring_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "readers")
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
	private String name;
	private String username;
    private String password;
      
}