   package com.coffee.dao;

import java.util.List;

import com.coffee.dto.Basket;

public interface BasketMapper {
	public int getTotalCount();
	public List<Basket> getBasketList();
	public Basket getBasket(int bno);
	public void insBasket(Basket basket);
	public void upBasket(Basket basket);
	public void delBasket(int bno);
	public void vcntCount(int bno);
}