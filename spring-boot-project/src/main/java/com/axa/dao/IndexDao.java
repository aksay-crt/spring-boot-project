package com.axa.dao;

import java.util.List;

import com.axa.dto.Index;

public interface IndexDao {

	void add(Index index);

	List<Index> get();

	Index get(String name);

	List<Index> getLike(String pattern);

	void update(String id, Index index);

	void delete(String id);

}
