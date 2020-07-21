package com.example.todo.service;

import com.example.todo.dto.RequestBoardUpdateDto;
import com.example.todo.model.Board;
import com.example.todo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Transactional
    public void write(Board board) {
        boardRepository.save(board);
    }

    @Transactional
    public Board boardDetail(int id) {
        Board board = boardRepository.findById(id).orElse(null);
        return board;
    }

    @Transactional
    public void update(int id, RequestBoardUpdateDto requestBoardUpdateDto){
         Board board = boardRepository.findById(id).orElse(null);
         board.update(requestBoardUpdateDto.getTitle(), requestBoardUpdateDto.getStatus());
    }

    @Transactional
    public void delete(int id) {
        boardRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Board> boardList(Pageable pageable) {
        List<Board> boards = boardRepository.findAll(pageable).stream().collect(Collectors.toList());
        return boards;
    }

}
