package com.example.demo.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect
{
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	@Before("execution(public java.util.List<com.example.demo.models.Alien> com.example.demo.controller.AlienController.getAliens())")
	public void log()
	{
		LOGGER.info("Fetching Alien records");
		
	}
	
	@AfterReturning("execution(public java.util.List<com.example.demo.models.Alien> com.example.demo.controller.AlienController.getAliens())")
	public void logAfter()
	{
		LOGGER.info("Fetched Successfully");
		
	}
	
	@AfterThrowing("execution(public java.util.List<com.example.demo.models.Alien> com.example.demo.controller.AlienController.getAliens())")
	public void logAfterException()
	{
		LOGGER.info("issue");
		
	}
}
