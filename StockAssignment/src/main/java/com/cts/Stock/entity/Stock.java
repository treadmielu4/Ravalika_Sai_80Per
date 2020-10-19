package com.cts.Stock.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Stock")
public class Stock {
	
	@Id
	@Column(name = "id")
	private int stock_id;
	
	@Column(name = "name")
	private String stock_name;
	private double price;
	private double volume;
	private Date date;
	public Stock() {
		super();
	}
	public Stock(int stock_id, String stock_name, double price, double volume, Date date) {
		super();
		this.stock_id = stock_id;
		this.stock_name = stock_name;
		this.price = price;
		this.volume = volume;
		this.date = date;
	}
	public int getStock_id() {
		return stock_id;
	}
	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Stock [stock_id=" + stock_id + ", stock_name=" + stock_name + ", price=" + price + ", volume=" + volume
				+ ", date=" + date + "]";
	}

}
