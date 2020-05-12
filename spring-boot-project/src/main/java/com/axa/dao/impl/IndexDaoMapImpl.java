package com.axa.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.axa.dao.IndexDao;
import com.axa.dto.Index;

@Repository(value = "indexDao")
public class IndexDaoMapImpl implements IndexDao {

	private static final Map<String, Index> INDEX_MAP = new HashMap<>();

	@Override
	public void add(Index index) {
		INDEX_MAP.put(index.getName(), index);
	}

	@Override
	public Index get(String name) {
		return INDEX_MAP.get(name);
	}

	@Override
	public List<Index> get() {
		return new ArrayList<>(INDEX_MAP.values());
	}

	@Override
	public List<Index> getLike(String pattern) {
		return INDEX_MAP
				.keySet()
				.stream()
				.filter(key -> key.contains(pattern))
				.map(INDEX_MAP::get)
				.collect(Collectors.toList());
	}

}
