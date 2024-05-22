package com.coffee.dao;

import java.util.List;

import com.coffee.dto.Inventory;

public interface InventoryMapper {
	public int getTotalCount();
	public List<Inventory> getInventoryList();
	public Inventory getInventory(int bno);
	public void insInventory(Inventory inventory);
	public void upInventory(Inventory inventory);
	public void delInventory(int bno);
	public void vcntCount(int bno);
}
