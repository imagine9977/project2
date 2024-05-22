package com.coffee.dao;

import java.util.List;

import com.coffee.dto.Fileboard;

public interface FileboardMapper {
	public int getTotalCount();
	public List<Fileboard> getFileboardList();
	public Fileboard getFileboard(int no);
	public void insFileboard(Fileboard fileboard);
	public void upFileboard(Fileboard fileboard);
	public void delFileboard(int no);
	public void vcntCount(int no);
}
 