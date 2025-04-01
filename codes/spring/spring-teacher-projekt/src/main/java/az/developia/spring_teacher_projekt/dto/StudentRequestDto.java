package az.developia.spring_teacher_projekt.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDto {
	private Integer id;
	@Size(min = 2, max = 30, message = "minimum 2 maksimum 30 simvol ola biler!")
	private String name;
	private String surname;
	private Double salary;

	private String username;
	private String password;

	public static void save(@Valid StudentRequestDto student) {

	}

}
