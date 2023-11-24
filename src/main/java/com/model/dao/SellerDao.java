package com.model.dao;

import java.util.List;
import com.model.entities.Seller;

public interface SellerDao {
    void insert(Seller id);
    void update(Seller id);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}

