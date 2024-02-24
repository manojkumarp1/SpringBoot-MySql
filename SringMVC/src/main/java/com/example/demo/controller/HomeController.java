package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Alien;
import com.example.demo.repository.AlienRepo;


@Controller
public class HomeController 
{
	
	@Autowired
	AlienRepo repo;
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name","Aliens");
		
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	/*
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("input1") int i,@RequestParam("input2") int j)
	{
		ModelAndView mv = new ModelAndView("result");
		//mv.setViewName("result");
		
		
		mv.addObject("num",i+j);
		 
		
		return mv;
		
	}
	*/
	
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a)
	{	
		repo.save(a);
		return "result";
	}
	
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int id,Model m)
	{
		
		m.addAttribute("result",repo.getOne(id));
		return "showAliens";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m)
	{
		m.addAttribute("result",repo.findAll());
		return "showAliens";
	}
	
	@PostMapping("getName")
	public String getName(@RequestParam String aname,Model m)
	{
		m.addAttribute("result",repo.find(aname));
		return "showAliens";
	}
	
}
