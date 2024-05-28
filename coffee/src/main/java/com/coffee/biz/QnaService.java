package com.coffee.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffee.dao.BoardMapper;
import com.coffee.dao.QnaMapper;
import com.coffee.dto.Board;
import com.coffee.dto.Qna;

@Service
public class QnaService implements QnaBiz {

	@Autowired
	private QnaMapper qnaDAO;

	@Override
	public List<Qna> getQnaList() {
		// TODO Auto-generated method stub
		return qnaDAO.getQnaList();
	}

	@Override
	public Qna getQna(int bno) {
		// TODO Auto-generated method stub
		return qnaDAO.getQna(bno);
	}

	@Override
	public int insQues(Qna qna) {
		return qnaDAO.insQues(qna);
		// TODO Auto-generated method stub

	}

	@Override
	public int insAnsw(Qna qna) {
		// TODO Auto-generated method stub
		return qnaDAO.insAnsw(qna);
	}

	@Override
	public List<Qna> getLastQnaList() {
		// TODO Auto-generated method stub
		return qnaDAO.getLastQnaList();
	}

	@Override
	public int editProQna(Qna qna) {
		// TODO Auto-generated method stub
		return qnaDAO.editProQna(qna);
	}

	@Override
	public int delQues(int no) {
		// TODO Auto-generated method stub
		return qnaDAO.delQues(no);
	}

	@Override
	public int delAnsw(int no) {
		// TODO Auto-generated method stub
		return qnaDAO.delAnsw(no);
	}

}