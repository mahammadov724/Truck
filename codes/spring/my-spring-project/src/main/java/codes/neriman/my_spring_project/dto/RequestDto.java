package codes.neriman.my_spring_project.dto;

public class RequestDto {

    @ValidEmail
    private String email;

    public RequestDto() {
    }

    public RequestDto(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}