package com.coffee.dao;

import java.util.List;

import com.coffee.dto.Fileboard;
import com.coffee.util.PagingBean;

public interface FileboardMapper {
	public int getTotalCount();
	public List<Fileboard> getFileboardListAll();
	public List<Fileboard> getFileboardList(PagingBean pagingBean);
	public Fileboard getFileboard(int no);
	public void insFileboard(Fileboard board);
	public void upFileboard(Fileboard board);
	public void hitCount(int no);
	public void delFileboard(int no);
}
 