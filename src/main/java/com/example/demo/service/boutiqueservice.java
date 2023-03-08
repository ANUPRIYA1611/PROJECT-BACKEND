package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.boutique;
import com.example.demo.repository.boutiquerepo;

@Service
public class boutiqueservice {
	@Autowired
	boutiquerepo repository;
		public Optional<boutique> gettaskdetail(int id){
			return repository.findById(id);
		}

		public String updateDetails(boutique t) {
			repository.save(t);
			return "updated";
		}

		public String deleteDetails(int id) {
			repository.deleteById(id);
			return "Id deleted";
		}
}
