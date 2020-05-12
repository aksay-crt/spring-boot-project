package com.axa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axa.dto.Index;
import com.axa.utility.Utility;

@RestController
public class NseController {

	@GetMapping(path = "/indices")
	public List<Index> getIndices() {
		return Utility.mockIndices();
	}

}
