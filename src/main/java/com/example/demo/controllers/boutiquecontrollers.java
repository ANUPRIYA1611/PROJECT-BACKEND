package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.boutique;
import com.example.demo.repository.boutiquerepo;
import com.example.demo.service.boutiqueservice;
@RestController
@CrossOrigin
public class boutiquecontrollers {
	@Autowired
	boutiquerepo serviceRepository;
	@Autowired
	boutiqueservice service;
		 
	@GetMapping("/getvalues")
	List<boutique> getList(){
		return serviceRepository.findAll();
	}
		 @PostMapping("/post")
	  public boutique create(@RequestBody boutique t) {
			 return serviceRepository.save(t);
		 }
		 
		 @GetMapping("/getvalues/{id}")
		 public Optional<boutique> getbyid(@PathVariable int id){
			
			return service.gettaskdetail(id);
		 }
		 
		 @PutMapping("/task")
		 public String update(@RequestBody boutique t) {
			 return service.updateDetails(t);
		 }
		 
		 @DeleteMapping("/task/{id}")
		 public String delete(@PathVariable int id) {
			 return service.deleteDetails(id);
		 }
}
