package services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import client.CelularClientFeign;
import models.Store;

@Service("serviceFeign")

public class StoreServiceFeignImp implements StoreService {

	@Autowired
	private CelularClientFeign clientFeign;
	
	@Override
	public List<Store> findAll() {
		return clientFeign.list().stream().map(c -> new Store(c, 5)).collect(Collectors.toList());
	}

	@Override
	public Store findById(Long id, Integer cantidad) {
		return new Store(clientFeign.detail(id), cantidad);
	}

}