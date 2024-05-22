package com.coffee.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Free {
	private int no;
	private String title;
	private String content;
	private int hits;
	private String resdate;
	private Member member;
}