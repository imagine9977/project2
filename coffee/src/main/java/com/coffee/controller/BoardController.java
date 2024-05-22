package com.coffee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coffee.dto.Board;
import com.coffee.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("list.do")
	public String getBoardList(Model model) {
		
		return "board/list";
	}
}