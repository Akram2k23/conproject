package com.tap.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.entity.Employe;
import com.tap.repository.MyRepository;

@Service
public class MyService {
	String s;

	@Autowired
	private MyRepository myRepository;

	public void saveData(Employe employe) {
		Optional<String> opt = Optional.ofNullable(s);
		myRepository.save(employe);
	}

	public List<Employe> getAllData() {
		List<Employe> emp = myRepository.findAll();
		return emp;

	}

	public List<Employe> getEmployeByA() {
		List<Employe> emp = myRepository.getEmployeStartWithA();
		return emp;

	}

	public Optional<Employe> getData(int empId) {
		
		Optional<Employe> emp = myRepository.findById(empId);
		
		return emp;
	}
	
	
	
	public String getCurrentDateAndTime() {
		LocalDateTime datetime = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String dateTime = datetime.format(format);
		return dateTime;
	}
	
	

}
