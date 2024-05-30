package com.coffee.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffee.dao.SalesMapper;
import com.coffee.dto.Sales;

@Service
public class SalesService implements SalesBiz {

	@Autowired
	private SalesMapper salesDAO;
	
	@Override
	public int getTotalCount() {
		return salesDAO.getTotalCount();
	}

	@Override
	public List<Sales> getAllSalesList() {
		return salesDAO.getAllSalesList();
	}
	
	@Override
	public List<Sales> getStSalesList(String st) {
		return salesDAO.getStSalesList(st);
	}
	
	@Override
	public List<Sales> getDelstSalesList(String delStatus) {
		return salesDAO.getDelstSalesList(delStatus);
	}
	
	@Override
	public List<Sales> getPnoSalesList(int pno) {
		return salesDAO.getPnoSalesList(pno);
	}

	@Override
	public List<Sales> getSalesList(String id) {
		return salesDAO.getSalesList(id);
	}

	@Override
	public Sales getSales(int sno) {
		return salesDAO.getSales(sno);
	}

	@Override
	public void insSales(Sales sales) {
		salesDAO.insSales(sales);
	}

	@Override
	public void upSales(Sales sales) {
		salesDAO.upSales(sales);
	}

	@Override
	public void upDelivery(Sales sales) {
		salesDAO.upDelivery(sales);
	}

	@Override
	public void completeDelivery(Sales sales) {
		salesDAO.completeDelivery(sales);
	}

	@Override
	public void delSales(int sno) {
		salesDAO.delSales(sno);
	}

	
}