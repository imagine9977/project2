package com.coffee.biz;

import java.util.List;

import com.coffee.dto.CategoryVO;
import com.coffee.dto.Inventory;


public interface InventoryBiz {
	int getTotalCount();
	List<Inventory> getInventoryList();
	List<CategoryVO> categoryLoading(String cate);
	Inventory getInventory(int pno);
	void insInventory(Inventory inventory);
	void upInventory(Inventory inventory);
	void delInventory(int ino);
}