package com.coffee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coffee.dto.Store;
import com.coffee.service.StoreService;

@Controller
@RequestMapping("/store/")
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	@GetMapping("list.do")
	public String getStoreList(Model model) {
		List<Store> list = storeService.getStoreList();
		model.addAttribute("list", list);
		return "store/storeList";
	}
}