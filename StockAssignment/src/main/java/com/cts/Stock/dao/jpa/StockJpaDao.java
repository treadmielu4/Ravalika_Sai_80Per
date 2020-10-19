package com.cts.Stock.dao.jpa;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.Stock.entity.Stock;

public interface StockJpaDao extends CrudRepository<Stock, Integer> {

	//Optional<Stock> findByName(String stock_name);




}
