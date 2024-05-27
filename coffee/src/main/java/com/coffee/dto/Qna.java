package com.coffee.dto;

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
public class Qna {
	private int no;
	private int plevel;
	private int parno;
	private String title;
	private String content;
	private String resdate;
	private int visited;
	private String aid;
}
