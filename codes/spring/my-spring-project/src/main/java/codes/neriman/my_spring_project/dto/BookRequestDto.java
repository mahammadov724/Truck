package codes.neriman.my_spring_project.dto;

import lombok.Data;

@Data
public class BookRequestDto {
	private Integer id;
    private String title;
    private String author;
    private int year;
}
