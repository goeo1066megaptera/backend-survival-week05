package kr.megaptera.assignment.dtos;

public class CommentUpdateDto {
    private String content;

    public CommentUpdateDto(String content) {
        this.content = content;
    }

    public CommentUpdateDto() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}