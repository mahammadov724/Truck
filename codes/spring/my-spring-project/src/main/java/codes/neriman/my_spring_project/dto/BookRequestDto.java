package codes.neriman.my_spring_project.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Book Request Dto",description = "melumatlarin qebul eden dto")
public class BookRequestDto {
	private Integer id;
    private String title;
    private String author;
    private int year;
}
