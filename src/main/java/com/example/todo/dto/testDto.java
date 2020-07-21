package com.example.todo.dto;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class testDto {

    private int id;

    @Builder
    public testDto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
