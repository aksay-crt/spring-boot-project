package com.axa.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axa.dto.Index;
import com.axa.service.IndexService;

@RestController
public class IndexController {

	@Resource(name = "indexService")
	private IndexService indexService;

	@GetMapping(path = "/indices")
	public List<Index> getIndices() {
		return indexService.get();
	}

	@GetMapping(path = "/indices/{id}")
	public Index getIndex(@PathVariable(name = "id") String id) {
		return indexService.get(id);
	}

	@GetMapping(path = "/indices/like/{pattern}")
	public List<Index> getIndexByPattern(@PathVariable(name = "pattern") String pattern) {
		return indexService.getIndexByPattern(pattern);
	}

	@PostMapping(path = "/indices")
	public void addIndex(@RequestBody Index index) {
		indexService.add(index);
	}

	@PutMapping(path = "/indices/{id}")
	public void addIndex(@RequestBody Index index, @PathVariable(name = "id") String id) {
		indexService.update(id, index);
	}

	@DeleteMapping(path = "/indices/{id}")
	public void addIndex(@PathVariable(name = "id") String id) {
		indexService.delete(id);
	}

}
