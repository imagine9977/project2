package com.coffee.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffee.dao.FreeMapper;
import com.coffee.dto.Free;


@Service
public class FreeService implements FreeBiz {

	@Autowired
	private FreeMapper FreeDAO;
	
	@Override
	public int getTotalCount() {
		return FreeDAO.getTotalCount();
	}

	@Override
	public List<Free> getFreeList() {
		return FreeDAO.getFreeList();
	}

	@Override
	public Free getFree(int no) {
		return FreeDAO.getFree(no);
	}

	@Override
	public void insFree(Free free) {
		FreeDAO.insFree(free);		
	}

	@Override
	public void upFree(Free free) {
		FreeDAO.upFree(free);
	}

	@Override
	public void hitcount(int no) {
		FreeDAO.hitCount(no);		
	}

	@Override
	public void delFree(int no) {
		FreeDAO.delFree(no);
	}


	
}