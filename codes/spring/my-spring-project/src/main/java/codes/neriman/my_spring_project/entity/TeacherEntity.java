package codes.neriman.my_spring_project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teachers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherEntity {
	
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer Id;
	@Column(columnDefinition = "TEXT")
	private String name;
	private String surname;
	
}
