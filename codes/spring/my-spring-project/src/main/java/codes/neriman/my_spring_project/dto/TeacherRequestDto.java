package codes.neriman.my_spring_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherRequestDto {
	private Integer id;
	private String name;
	private String surname;
	
}
