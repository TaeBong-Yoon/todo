package com.example.todo.controller.api;

import com.example.todo.dto.RequestBoardUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.todo.model.Board;
import com.example.todo.service.BoardService;

@RestController
public class BoardApiController {
	
	@Autowired
	private BoardService boardService;

	// id에 해당하는 글 정보 가져오기
	@GetMapping("/api/board/{id}")
	public Board seeDetail(@PathVariable int id) {
		Board board= boardService.boardDetail(id);
		return board;
	}

	// 할일을 입력했을때
	@PostMapping("/api/boards")
	public void save(@RequestBody Board board) {
		boardService.write(board);
	}

	// 할일 수정했을때
	@PutMapping("/api/board/{id}")
	public void update(@PathVariable int id, @RequestBody RequestBoardUpdateDto requestBoardUpdateDto){
		boardService.update(id, requestBoardUpdateDto);
	}
	
	// 아래 삭제버튼 클릭했을때
	@DeleteMapping("/api/board/{id}")
	public void deleteById(@PathVariable int id){
		boardService.delete(id);
	}
	
}
