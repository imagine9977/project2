package com.coffee.biz;

import java.util.List;

import com.coffee.dto.Free;

public interface FreeBiz {
	public int getTotalCount();
	public List<Free> getFreeList();
	public Free getFree(int no);
	public void insFree(Free Free);
	public void upFree(Free Free);
	public void hitcount(int no);
	public void delFree(int no);

}
