package com.fundamentos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentos.entities.Event;
import com.fundamentos.repositories.EventRepository;
import com.fundamentos.repositories.LocationRepository;
import com.fundamentos.repositories.SessionRepository;

@SpringBootApplication
public class FundamentosSpringApplication implements CommandLineRunner {
	
	@Autowired
	private EventRepository eventRepo;
	
	@Autowired
	private SessionRepository sessionRepo;
	
	@Autowired
	private LocationRepository locationRepo;

	public static void main(String[] args) {
		SpringApplication.run(FundamentosSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Event e1 = new Event(null, "Angular", new Date(), "9:00 am", 500.00, , null, null, null)
		
	}

}
