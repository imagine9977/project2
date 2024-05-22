package com.coffee.dao;

import java.util.List;

import com.coffee.dto.Free;

public interface FreeMapper {
	public int getTotalCount();
	public List<Free> getFreeList();
	public Free getFree(int bno);
	public void insFree(Free free);
	public void upFree(Free free);
	public void delFree(int bno);
	public void vcntCount(int bno);
}
