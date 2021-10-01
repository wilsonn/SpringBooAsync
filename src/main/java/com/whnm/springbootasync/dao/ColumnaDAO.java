package com.whnm.springbootasync.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ColumnaDAO {
	List<String> getColumnas();
	CompletableFuture<List<String>> getColumnasAsync();
}
