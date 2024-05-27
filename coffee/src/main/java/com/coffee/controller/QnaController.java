package com.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coffee.biz.BoardBiz;
import com.coffee.biz.QnaBiz;
import com.coffee.dto.Board;

@Controller
@RequestMapping("/qna/")
public class QnaController {

	@Autowired
	private QnaBiz qnaService;
	
	@RequestMapping("list.do")
	public String getQnaList(Model model) {
		model.addAttribute("list", qnaService.getQnaList());
		return "board/list";
	}
	
	@RequestMapping("detail.do")
	public String getBoard(@RequestParam("bno") int bno, Model model) {
		model.addAttribute("board", boardService.getBoard(bno));
		return "board/get";
	}

	@GetMapping("insert.do")
	public String insBoard(Board board, Model model) {
		return "board/insert";
	}
	
	@PostMapping("insertPro.do")
	public String insBoardPro(Board board, Model model) {
		boardService.insBoard(board);
		return "redirect:list.do";
	}

	@GetMapping("update.do")
	public String upBoard(@RequestParam("bno") int bno, Model model) {
		model.addAttribute("board", boardService.getBoard(bno));
		return "board/edit";
	}
	
	@PostMapping("updatePro.do")
	public String upBoardPro(@RequestAttribute("board") Board board, Model model) {
		boardService.upBoard(board);
		return "redirect:list.do";
	}
	
	@RequestMapping("delBoard.do")
	public String delBoard(@RequestParam("bno") int bno, Model model) {
		boardService.delBoard(bno);
		return "redirect:list.do";
	}
}