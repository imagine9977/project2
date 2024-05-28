package com.coffee.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coffee.biz.FreeBiz;
import com.coffee.biz.MemberService;
import com.coffee.dto.Free;

@Controller
@RequestMapping("/free/")
public class FreeController {

	@Autowired
	private FreeBiz freeService;
	@Autowired
	private MemberService memberService;
	@RequestMapping("list.do")
	public String getFreeList(Model model) {
		model.addAttribute("list", freeService.getFreeList());
		return "free/list";
	}
	
	@RequestMapping("detail.do")
	public String getFree(@RequestParam("no") int no, Model model) {
		model.addAttribute("free", freeService.getFree(no));
		return "free/get";
	}

	@GetMapping("insert.do")
	public String insFree(Free free, Model model) {
		return "free/insert";
	}
	
	@PostMapping("insertPro.do") 
	public String insFreePro(Free free,  HttpSession session, Model model) {
		String id = (String) session.getAttribute("sid");
		String name = (String) session.getAttribute("sname");
		free.setId(id);
		free.setName(name);
		freeService.insFree(free);
		return "redirect:list.do";
	}

	@GetMapping("update.do")
	public String upFree(@RequestParam("no") int no, Model model) {
		model.addAttribute("free", freeService.getFree(no));
		return "free/edit";
	}
	
	@PostMapping("updatePro.do")
	public String upFreePro(@RequestAttribute("free") Free Free, Model model) {
		freeService.upFree(Free);
		return "redirect:list.do";
	}
	
	@RequestMapping("delFree.do")
	public String delFree(@RequestParam("no") int no, Model model) {
		freeService.delFree(no);
		return "redirect:list.do";
	}
	
	@PostMapping("fileupload.do")
	public String fileupload(Model model) {
		return "";
	}
		
	
}