package com.kh.ajax.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.kh.ajax.model.vo.Menu;

@Controller
public class AjaxController {
	@GetMapping("ajax1.do")
	public void calSum(String menu, int amount, HttpServletResponse response) {

		int price = 0;
		switch (menu) {
		case "알밥":
			price = 10000;
			break;
		case "돈까스":
			price = 12000;
			break;
		case "서브웨이":
			price = 16000;
			break;
		case "김치찜":
			price = 9000;
			break;
		}

		price *= amount;
		// System.out.printf("사용자 입력 메뉴: " ,menu);
		// System.out.printf("사용자 입력 메뉴: " ,amount);

		response.setContentType("text/html; charset=UTF-8");

		// response.getWriter().price(amount);
	}

	@GetMapping("responseData")
	public void test(HttpServletResponse response) throws IOException {

	}
	
	
	//수정 요망 
	@ResponseBody
	@GetMapping(value ="ajax2.do", produces="application/json; charset=UTF-8")
	public String selectMenu(int menuNumber) {
		Menu menu = new Menu(1, "순두부", 9500, "순두부");
		
		
		
		JSONObject jObj = new JSONObject();
		jObj.put("menuNumber" , menu.getMenuNumber());
		jObj.put("menuName", menu.getMenuName());
		jObj.put("price", menu.getPrice());
		jObj.put("material", menu.getMaterial());
		
		return jObj.toJSONString();
	}
	
	
	@ResponseBody
	@GetMapping(value ="ajax3.do", produces="application/json; charset=UTF-8")
	public Menu ajax3Method(int menuNumber) {
		Menu menu = new Menu(menuNumber, "순두부찌개", 9500, "순두부");
		
		return menu;
	}
	@ResponseBody
	@GetMapping(value ="find.do", produces="application/json; charset=UTF-8")
	public String findAll() {
		List<Menu> menus = new ArrayList<Menu>();
		menus.add(new Menu(1,"순두부찌개", 9500, "순두부"));
		menus.add(new Menu(2,"김치찌개", 11500, "김치"));
		menus.add(new Menu(3,"된장찌개", 9000, "된장"));
		/* 방법 1 
		JSONObject jObj1 = new JSONObject();
		jObj1.put("menuNumber", menus.get(0).getMenuNumber());
		jObj1.put("menuName", menus.get(0).getMenuName());
		jObj1.put("price", menus.get(0).getPrice());
		jObj1.put("material", menus.get(0).getMaterial());
		JSONObject jObj2 = new JSONObject();
		jObj2.put("menuNumber", menus.get(1).getMenuNumber());
		jObj2.put("menuName", menus.get(1).getMenuName());
		jObj2.put("price", menus.get(1).getPrice());
		jObj2.put("material", menus.get(1).getMaterial());
		JSONObject jObj3 = new JSONObject();
		jObj3.put("menuNumber", menus.get(2).getMenuNumber());
		jObj3.put("menuName", menus.get(2).getMenuName());
		jObj3.put("price", menus.get(2).getPrice());
		jObj3.put("material", menus.get(2).getMaterial());
		*/
		JSONArray jArr = new JSONArray();
		/*//방법2
		for(int i=0; i<menus.size() ; i++) {
			JSONObject jObj = new JSONObject();
			jObj.put("menuNumber", menus.get(i).getMenuNumber());
			jObj.put("menuName", menus.get(i).getMenuName());
			jObj.put("price", menus.get(i).getPrice());
			jObj.put("material", menus.get(i).getMaterial());
			jArr,add(jObj);
		}
		*/
		return new Gson().toJson(menus); // 위 과정을 간단하게 만드는 방법 
	}
}
