package com.example.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}
