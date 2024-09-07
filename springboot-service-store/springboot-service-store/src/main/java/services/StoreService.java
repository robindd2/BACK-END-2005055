package services;

import java.util.List;

import models.Store;

public interface StoreService {
   public List<Store> findAll();
   public Store findById(Long id,Integer cantidad);
}
