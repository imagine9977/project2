package com.coffee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Basket {
	private int bno;
	private int amount;
	private String remark;
	private Member member;
	private String resdate;
	private Product product;
}