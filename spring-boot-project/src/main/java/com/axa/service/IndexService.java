package com.axa.service;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.axa.dao.IndexDao;
import com.axa.dto.Index;
import com.axa.utility.Utility;

@Service(value = "indexService")
public class IndexService {

	@Resource(name = "indexDao")
	private IndexDao indexDao;

	@PostConstruct
	public void loadIndices() throws IOException {

		final List<Index> indexList = Utility.convertJsonToIndex(Utility.getIndicesAsJson());

		indexList.forEach(index -> indexDao.add(index));

	}

	public List<Index> get() {
		return indexDao.get();
	}

	public Index get(final String id) {
		return indexDao.get(id);
	}

	public List<Index> getIndexByPattern(String pattern) {
		return indexDao.getLike(pattern);
	}

}
