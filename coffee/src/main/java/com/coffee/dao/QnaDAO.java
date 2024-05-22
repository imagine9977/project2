package com.coffee.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffee.dto.Qna;

@Repository
public class QnaDAO implements QnaMapper {

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<Qna> getQnaList() {
		return sqlSession.selectList("Qna.getQnaList");
	}

	@Override
	public Qna getQna(int no) {
		return sqlSession.selectOne("Qna.getQna", no);
	}

	

	@Override
	public void insQna(Qna qna) {
		sqlSession.insert("Qna.insQna", qna);
	}

	@Override
	public void upQna(Qna qna) {
		sqlSession.update("Qna.upQna", qna);
	}

	@Override
	public void delQna(int no) {
		sqlSession.delete("Qna.delQna", no);		
	}


	
	@Override
	public int getTotalCount() {
		return sqlSession.selectOne("Qna.getTotalCount");

	}

	@Override
	public void vcntCount(int no) {
		sqlSession.update("Qna.vcntCount", no);
		
	}
}