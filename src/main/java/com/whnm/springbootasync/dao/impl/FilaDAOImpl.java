package com.whnm.springbootasync.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.whnm.springbootasync.dao.FilaDAO;

@Repository
public class FilaDAOImpl implements FilaDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(FilaDAOImpl.class);

	@Override
	public List<String> getFilas() {
		List<String> lista = new ArrayList<>();
		lista.add("FIL1");
		lista.add("FIL2");
		lista.add("FIL3");
		lista.add("FIL4");
		lista.add("FIL5");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			logger.debug("Ocurrio un error: " + e.getMessage(), e);
		}
		return lista;
	}

	@Async
	@Override
	public CompletableFuture<List<String>> getFilasAsync() {
		List<String> lista = new ArrayList<>();
		lista.add("FIL1");
		lista.add("FIL2");
		lista.add("FIL3");
		lista.add("FIL4");
		lista.add("FIL5");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			logger.debug("Ocurrio un error: " + e.getMessage(), e);
		}
		return CompletableFuture.completedFuture(lista);
	}

}
