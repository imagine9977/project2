package com.coffee.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffee.dto.Fileboard;

@Repository
public class FileboardDAO implements FileboardMapper {
 
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<Fileboard> getFileboardList() {
		return sqlSession.selectList("Fileboard.getFileboardList");
	}

	@Override
	public Fileboard getFileboard(int bno) {
		return sqlSession.selectOne("Fileboard.getFileboard", bno);
	}

	

	@Override
	public void insFileboard(Fileboard fileboard) {
		sqlSession.insert("Fileboard.insFileboard", fileboard);
	}

	@Override
	public void upFileboard(Fileboard fileboard) {
		sqlSession.update("Fileboard.upFileboard", fileboard);
	}

	@Override
	public void delFileboard(int bno) {
		sqlSession.delete("Fileboard.delFileboard", bno);		
	}


	
	@Override
	public int getTotalCount() {
		return sqlSession.selectOne("Fileboard.getTotalCount");

	}

	@Override
	public void vcntCount(int bno) {
		sqlSession.update("Fileboard.vcntCount", bno);
		
	}


}