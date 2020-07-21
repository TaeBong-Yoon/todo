package com.example.todo.dto;

import lombok.Builder;
<<<<<<< HEAD
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
=======
import lombok.NoArgsConstructor;

@NoArgsConstructor
>>>>>>> 73fb659fd8c0a4904a88df10b4c440c67afe078d
public class RequestBoardUpdateDto {

    private String title;
    private String status;

    public RequestBoardUpdateDto() {
    }
<<<<<<< HEAD
=======
    @Builder
>>>>>>> 73fb659fd8c0a4904a88df10b4c440c67afe078d
    public RequestBoardUpdateDto(String title, String status) {
        this.title = title;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }
}
