package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Alien;
import com.example.demo.repository.AlienRepo;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	
	@GetMapping(path="aliens",produces= {"application/json"})
	public List<Alien> getAliens()
	{
		
		List<Alien> aliens = repo.findAll();
		
		return aliens;
	}
	
	@GetMapping("alien/{id}")
	public Optional<Alien> getAlien(@PathVariable("id")int id)
	{
		return repo.findById(id);
		
	}
	
	@PostMapping(path="alien",consumes= {"application/json"})
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		
		return alien;
	}
	
	@GetMapping("/test")
    public String testEndpoint() {
        return "Test Endpoint is working!";
    }
	
	

	

}
