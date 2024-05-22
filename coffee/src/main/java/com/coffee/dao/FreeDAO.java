package com.coffee.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffee.dto.Free;

@Repository
public class FreeDAO implements FreeMapper {

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<Free> getFreeList() {
		return sqlSession.selectList("Free.getFreeList");
	}

	@Override
	public Free getFree(int bno) {
		return sqlSession.selectOne("Free.getFree", bno);
	}

	

	@Override
	public void insFree(Free free) {
		sqlSession.insert("Free.insFree", free);
	}

	@Override
	public void upFree(Free free) {
		sqlSession.update("Free.upFree", free);
	}

	@Override
	public void delFree(int bno) {
		sqlSession.delete("Free.delFree", bno);		
	}


	
	@Override
	public int getTotalCount() {
		return sqlSession.selectOne("Free.getTotalCount");

	}

	@Override
	public void vcntCount(int bno) {
		sqlSession.update("Free.vcntCount", bno);
		
	}


}