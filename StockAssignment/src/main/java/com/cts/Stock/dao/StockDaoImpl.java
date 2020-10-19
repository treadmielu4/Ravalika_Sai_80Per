package com.cts.Stock.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.Stock.entity.Stock;

@Repository(value = "StockDao")
public class StockDaoImpl implements StockDao {

	List<Stock> stockList=new ArrayList<>();
	
	public StockDaoImpl() {
		stockList.add(new Stock(101, "Table",2000, 10,new Date(2020-10-19)));
		stockList.add(new Stock(102, "Chair", 200, 20,new Date(2020-10-20)));
		stockList.add(new Stock(103, "AC", 100000, 20,new Date(2020-10-21)));		
	}
	
	@Override
	public List<Stock> getAllStocks() {
		return stockList;
	}
	
	
	@Override
	public Stock getStockById(int stock_id) {
		
		for(Stock s:stockList) {
			if(s.getStock_id()==stock_id) {
				
				return s;	
			}
		}
		
		return null;
	}
	@Override

	public Stock addStock(Stock stock) {

		stockList.add(stock);

		return stock;

	}

}
