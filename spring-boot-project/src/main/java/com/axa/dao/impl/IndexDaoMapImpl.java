package com.axa.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.axa.dao.IndexDao;
import com.axa.dto.Index;

@Repository(value = "indexDao")
public class IndexDaoMapImpl implements IndexDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndexDaoMapImpl.class);

	private static final Map<String, Index> INDEX_MAP = new HashMap<>();

	@Override
	public void add(Index index) {
		INDEX_MAP.put(index.getName(), index);
		LOGGER.info("Added {}", index.toString());
	}

	@Override
	public Index get(String name) {
		final Index index = INDEX_MAP.get(name);
		LOGGER.info("Fetched {}", index.toString());
		return index;
	}

	@Override
	public List<Index> get() {
		LOGGER.info("Fetched all values");
		return new ArrayList<>(INDEX_MAP.values());
	}

	@Override
	public List<Index> getLike(String pattern) {
		final List<Index> indices = INDEX_MAP
				.keySet()
				.stream()
				.filter(key -> key.contains(pattern))
				.map(INDEX_MAP::get)
				.collect(Collectors.toList());
		LOGGER.info("Fetched {}", indices);
		return indices;
	}

	@Override
	public void update(String id, Index index) {
		index.setName(id);
		INDEX_MAP.put(id, index);
		LOGGER.info("Updated {}", index.toString());
	}

	@Override
	public void delete(String id) {
		INDEX_MAP.remove(id);
		LOGGER.info("Deleted index - {}", id);
	}

}
