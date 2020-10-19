package com.cts.Stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Stock.dao.StockDao;
import com.cts.Stock.dao.jpa.StockJpaDao;
import com.cts.Stock.entity.Stock;

@Service(value = "stock")
public class StockServiceImpl implements StockService {

	@Autowired
	StockDao stockDao;
	
	@Autowired
	StockJpaDao stockJpaDao;
	
	@Override
	public Iterable<Stock> getAllStocks() {
		return stockJpaDao.findAll();
	}

	@Override
	public Stock getStockById(int stock_id) {
		return stockJpaDao.findById(stock_id).get();
	}
	@Override

	public Stock addStock(Stock stock) {

		return stockJpaDao.save(stock);

	}



	

}
