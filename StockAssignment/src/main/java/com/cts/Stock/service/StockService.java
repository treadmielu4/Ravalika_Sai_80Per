package com.cts.Stock.service;

import com.cts.Stock.entity.Stock;

public interface StockService {

	public Iterable<Stock> getAllStocks();
	public Stock getStockById(int stock_id);
	public Stock addStock(Stock stock);
}
