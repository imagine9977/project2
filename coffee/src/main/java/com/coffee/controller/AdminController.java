package com.coffee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coffee.dto.Custom;
import com.coffee.service.CustomService;

@Controller
@RequestMapping("/admin/")
public class AdminController {

	@Autowired
	private CustomService customService;
	
	@GetMapping("customList.do")
	public String getCustomList(Model model) {
		List<Custom> customList = customService.getCustomList(); 
		return "admin/customList";
	}
}