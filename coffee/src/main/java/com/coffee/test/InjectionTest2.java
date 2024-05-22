package com.coffee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.coffee.dto.Shop;

public class InjectionTest2 {
	public static void main(String[] args) {
		ApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:InjectionContext2.xml");
		
		Shop shop1 = ctx1.getBean("shop", Shop.class);
		System.out.println(shop1.toString());
		
		Shop shop2 = (Shop) ctx1.getBean("shop2", Shop.class);
		System.out.println(shop2.toString());
		
		Shop shop3 = ctx1.getBean("shop3", Shop.class);
		System.out.println(shop3.toString());
	}
}
