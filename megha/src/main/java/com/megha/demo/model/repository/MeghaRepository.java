package com.megha.demo.model.repository;

import java.time.LocalDate;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.megha.demo.model.Megha;
@Repository
public interface MeghaRepository extends MongoRepository<Megha,Integer>
{
   
	@Query("db.megha.find().sort({"+"date_of_sale"+": -1}).limit(1)")
	Megha getByLatestDate(LocalDate date);

	

}
