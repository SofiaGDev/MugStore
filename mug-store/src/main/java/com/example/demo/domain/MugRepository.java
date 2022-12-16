package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.model.Mug;

public interface MugRepository extends JpaRepository<Mug, Long>{

}
