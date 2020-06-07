package com.megha.demo.controller;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.megha.demo.model.Megha;
import com.megha.demo.model.repository.MeghaRepository;



@RestController
public class MeghaController
{
	
	@Autowired
	private MeghaRepository meghaRepository;
	

	@PostMapping("/create")
	public  String  create(@RequestBody Megha megha)
	{
		meghaRepository.save(megha);
		return "record added"+megha.getId();
	}
	
	@GetMapping("/getAll")
	public List<Megha> getAll()
	{
		return meghaRepository.findAll();
		}

	@RequestMapping("/recent")
	public Megha getByLatestDate(LocalDate date_of_sale)
	{
		return meghaRepository.getByLatestDate(date_of_sale);
	}
}
