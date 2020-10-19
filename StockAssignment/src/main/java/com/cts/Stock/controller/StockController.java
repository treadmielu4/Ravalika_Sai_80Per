package com.cts.Stock.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Stock.entity.Stock;
import com.cts.Stock.service.StockService;

@RestController
public class StockController {

	@Autowired
	StockService stockservice;
	
	@GetMapping(value = "/stockList")
	public ResponseEntity<Object> personList()
	{
		
		return new ResponseEntity<>(stockservice.getAllStocks(),HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/getStockById/id/{stock_id}")
	public ResponseEntity<Object> personList(@PathVariable("stock_id") Integer stock_id)
	{
		
			Stock s=stockservice.getStockById(stock_id);
			if(s!=null) {
				
				return new ResponseEntity<>(s,HttpStatus.OK);	
			}
			else
			return new ResponseEntity<>("Record Not Found",HttpStatus.OK);
				
	}
	@PostMapping(value = "/addStock")

	public ResponseEntity<Object> addStock(@RequestBody Stock stock)

	{

		

		return new ResponseEntity<>(stockservice.addStock(stock),HttpStatus.OK);	

	}
	
}
