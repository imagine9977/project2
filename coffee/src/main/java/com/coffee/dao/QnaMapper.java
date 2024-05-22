package com.coffee.dao;

import java.util.List;

import com.coffee.dto.Qna;

public interface QnaMapper {
	public int getTotalCount();
	public List<Qna> getQnaList();
	public Qna getQna(int bno);
	public void insQna(Qna qna);
	public void upQna(Qna qna);
	public void delQna(int no);
	public void vcntCount(int no);
}
