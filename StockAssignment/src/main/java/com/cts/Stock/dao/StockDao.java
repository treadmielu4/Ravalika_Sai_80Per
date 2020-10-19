package com.cts.Stock.dao;

import java.util.List;

import com.cts.Stock.entity.Stock;

public interface StockDao {
	public List<Stock> getAllStocks();
	public Stock getStockById(int stock_id);
	public Stock addStock(Stock stock);

}
