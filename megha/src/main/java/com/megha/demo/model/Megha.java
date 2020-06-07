package com.megha.demo.model;

import java.time.LocalDate;
import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Document
public class Megha
{
	@Id
	private	ObjectId  _id;
	private String car_name;
	
	//@JsonFormat(pattern = "yyyy-mm-dd",shape = Shape.STRING)
	//private	String	date_of_sale;
	private LocalDate date_of_sale;
	
    private	int model_no;
	private int price;
	public Megha(String car_name, LocalDate date_of_sale, int model_no, int price) {
	
		this.car_name = car_name;
		this.date_of_sale = date_of_sale;
		this.model_no = model_no;
		this.price = price;
		
	}

	public ObjectId getId() {
		return _id;
	}

	public void setId(ObjectId id) {
		this._id = id;
	}

	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public LocalDate getDate_of_sale() {
		return date_of_sale;
	}
	public void setDate_of_sale(LocalDate date_of_sale) {
		this.date_of_sale = date_of_sale;
	}
	public int getModel_no() {
		return model_no;
	}
	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Megha [car_name=" + car_name + ", date_of_sale=" + date_of_sale + ", model_no=" + model_no + ", price="
				+ price + "]";
	}

	


}
