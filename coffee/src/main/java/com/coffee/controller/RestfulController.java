package com.coffee.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.dto.Sample;
import com.coffee.dto.Store;
import com.coffee.dto.Student;
import com.coffee.service.SampleService;
import com.coffee.service.StoreService;
import com.coffee.vo.Maker;

//REST(REpresentation State Transfer) : 표현 가능한 자원의 상태를 전송
//RESTful : 표현 가능한 자원의 상태를 자유롭게 전송할 수 있는
//API : 프로그래밍시에 활용할 수 있는 애플리케이션 형태의 자원
//RESTful API(Application Programming Interface Of REpresentation State Transfer)
@RestController //@ResponseBody + @Controller : JSON으로 출력
@RequestMapping("/api/")
public class RestfulController {

	private static final Logger log = LoggerFactory.getLogger(RestfulController.class);
	
	@Autowired
	private SampleService sampleService;
	
	@Autowired
	private StoreService storeService;
	
	@GetMapping("api1.do")
	public int getApi1() {
		return 1004;
	}
	
	@GetMapping("api2.do")
	public Store getApi2() {
		Store store = new Store(1, "EmArt");
		return store;
	}
	
	@GetMapping("api3.do")
	public List<Store> getApi3() {
		Store store1 = new Store(1, "EmArt");
		Store store2 = new Store(2, "HomePlus");
		Store store3 = new Store(3, "Costco");
		List<Store> storeList = new ArrayList<>();
		storeList.add(store1);
		storeList.add(store2);
		storeList.add(store3);
		return storeList;
	}
	
	@GetMapping("api4.do")
	public Maker getApi4() {
		Store store1 = new Store(1, "EmArt");
		Store store2 = new Store(2, "HomePlus");
		Store store3 = new Store(3, "Costco");
		ArrayList<Store> storeList = new ArrayList<>();
		storeList.add(store1);
		storeList.add(store2);
		storeList.add(store3);
		Maker maker = new Maker("GreateMall", 1, storeList);
		return maker;
	}
	
	@PostMapping("api5.do")
	public Store postApi5(@RequestBody Store store) {
		storeService.insStore(store);
		log.info("번호 : "+store.getStoreNum());
		log.info("이름 : "+store.getStoreName());
		return store;
	}
	
	
	
	@PostMapping("api6.do")
	public Student postStudent(@RequestBody Student std) {
		String response = String.format("\n< 학생정보>\n이름 : %s\n번호 : %d\n 나이 : %d", std.getName(), std.getStdNumber(), std.getAge());
		log.info("postStudent response :" + response);
		return std;
	}
	
	@PostMapping("api7.do")
	public String postAllStudent(@RequestBody List<Student> stds) {
		String response = "\n< 학생정보>\n";
		int i =1;
		for(Student s : stds) {
			response+=String.format("학생%d: 이름 : %s\n번호 : %d\n 나이 : %d",i, s.getName(), s.getStdNumber(), s.getAge());
			i++;
		}
				
				
		log.info("postAllStudent response :" + response);
		return response;
	}
	
}