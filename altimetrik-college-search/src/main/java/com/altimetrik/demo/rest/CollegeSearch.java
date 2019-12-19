package com.altimetrik.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.demo.utils.ReturnResponse;
import com.altimetrik.demo.utils.ServiceImpl;

@RestController
@RequestMapping("/")
public class CollegeSearch {

	@Autowired
	ServiceImpl service;

	@GetMapping
	public ResponseEntity<ReturnResponse> search(@RequestParam String degres, @RequestParam int year,
			@RequestParam int zip, @RequestParam int distance, @RequestParam int per_page, @RequestParam int page) {
		
		ReturnResponse response;
		
		response = service.search(degres, year, zip, distance, per_page, page);
		return ResponseEntity.ok(response);
		
	}

}