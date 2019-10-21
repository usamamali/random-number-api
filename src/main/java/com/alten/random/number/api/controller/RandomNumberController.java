/**
 * 
 */
package com.alten.random.number.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alten.random.number.api.service.RandomNumberService;

/**
 * @author usama
 *
 */
@RestController
@RequestMapping("/api/v1/random")
public class RandomNumberController {

	@Autowired
	RandomNumberService randomNumberService;

	@GetMapping("/integer")
	public ResponseEntity<Integer> getRandomIntegerNumber() {
		Integer randomIntNumber = randomNumberService.generateRandomIntegerNumber();
		return ResponseEntity.ok(randomIntNumber);
	}

}
