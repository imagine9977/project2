package com.coffee.dao;

import java.util.List;

import com.coffee.dto.Sales;

public interface SalesMapper {
	public int getTotalCount();
	public List<Sales> getSalesList();
	public Sales getSales(int sno);
	public void insSales(Sales sales);
	public void upSales(Sales sales);
	public void delSales(int sno);
	public void vcntCount(int sno);
}
