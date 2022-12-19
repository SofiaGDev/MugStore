package com.example.demo.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Mug {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		 Long id;
		 String name;
		 String type;
		 int sizeml; 

}
