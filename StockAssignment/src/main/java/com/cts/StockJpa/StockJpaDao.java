package com.cts.StockJpa;


import java.util.ArrayList;

import java.util.List;



import org.springframework.data.repository.CrudRepository;

import com.cts.Stock.Stock;


public interface StockJpaDao extends CrudRepository<Stock,Integer>{

	

	

	

}