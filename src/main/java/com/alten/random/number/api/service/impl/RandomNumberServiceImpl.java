/**
 * 
 */
package com.alten.random.number.api.service.impl;

import org.springframework.stereotype.Service;

import com.alten.random.number.api.service.RandomNumberService;

/**
 * @author usama
 *
 */
@Service
public class RandomNumberServiceImpl implements RandomNumberService {

	@Override
	public int generateRandomIntegerNumber() {
		return (int) (Math.random() * 1000) + 1;
	}

}
