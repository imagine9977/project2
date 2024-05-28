package com.coffee.biz;

import java.util.List;


import com.coffee.dto.Qna;

public interface QnaBiz {
	public List<Qna> getLastQnaList();
	public List<Qna> getQnaList();
	public Qna getQna(int bno);
	public int insQues(Qna qna);
	public int insAnsw(Qna qna);
	public int editProQna(Qna qna);
	public int delQues(int no);
	public int delAnsw(int no);

}
