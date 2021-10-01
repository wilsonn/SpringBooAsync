package com.whnm.springbootasync.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface FilaDAO {
	List<String> getFilas();
	CompletableFuture<List<String>> getFilasAsync();
}
