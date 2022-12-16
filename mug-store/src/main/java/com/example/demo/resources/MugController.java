package com.example.demo.resources;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.MugRepository;
import com.example.demo.domain.model.Mug;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public  class MugController {
	
	MugRepository repository;
	
	@GetMapping("/mug")
	public List<Mug> getAllMugs(){
		return repository.findAll();
	}
	
	@GetMapping("/mug/{id}")
	public Mug getMugById(@PathVariable Long id) {
		return repository.getReferenceById(id);
	}
	
	@PostMapping("/mug")
	public Mug saveMug(@RequestBody Mug mug) {
		return repository.save(mug);
	}
	
	@DeleteMapping("/mug/{id}")
	public  void deleteMug(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
