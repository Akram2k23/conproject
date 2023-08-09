package com.tap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tap.entity.Employe;
import com.tap.service.MyService;

@RestController
public class MyController {

	@Autowired
	private MyService myService;

	@PostMapping("/save")
	public int saveData(@RequestBody Employe employe) {
		myService.saveData(employe);
		return employe.getEmpId();
	}

	@GetMapping("/getalldata")
	public List<Employe> getAllData() {
		List<Employe> emp = myService.getAllData();
		return emp;
	}

	@GetMapping("/name_start_with_a")
	public List<Employe> getEmployeByA() {
		List<Employe> emp = myService.getEmployeByA();
		return emp;
	}

	@GetMapping("/getdata/{id}")
	public Optional<Employe> getData(@PathVariable int id) {
		Optional<Employe> emp = myService.getData(id);
		return emp;
	}
	
	@GetMapping("/getcurrentdateandtime")
	public String getCurrentDateAndTime() {
		return myService.getCurrentDateAndTime();
	}

}
