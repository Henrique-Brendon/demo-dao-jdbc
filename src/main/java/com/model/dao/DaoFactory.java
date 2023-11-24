package com.model.dao;

import com.jdbc.db.DB;
import com.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    
    public static SellerDao creatSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
