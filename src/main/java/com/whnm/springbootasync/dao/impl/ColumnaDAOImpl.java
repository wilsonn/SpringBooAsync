package com.whnm.springbootasync.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.whnm.springbootasync.dao.ColumnaDAO;

@Repository
public class ColumnaDAOImpl implements ColumnaDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ColumnaDAOImpl.class);

	@Override
	public List<String> getColumnas() {
		List<String> lista = new ArrayList<>();
		lista.add("COL1");
		lista.add("COL2");
		lista.add("COL3");
		lista.add("COL4");
		lista.add("COL5");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			logger.debug("Ocurrio un error: " + e.getMessage(), e);
		}
		return lista;
	}

	@Async
	@Override
	public CompletableFuture<List<String>> getColumnasAsync() {
		List<String> lista = new ArrayList<>();
		lista.add("COL1");
		lista.add("COL2");
		lista.add("COL3");
		lista.add("COL4");
		lista.add("COL5");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			logger.debug("Ocurrio un error: " + e.getMessage(), e);
		}
		return CompletableFuture.completedFuture(lista);
	}

}
