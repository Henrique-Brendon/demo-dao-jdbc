package com.model.dao;

import java.util.List;
import com.model.entities.Seller;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Seller obj);
    Seller findById(Seller obj);
    List<Seller> findAll();
}

