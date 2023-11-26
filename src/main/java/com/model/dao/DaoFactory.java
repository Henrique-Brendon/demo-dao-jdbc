package com.model.dao;



import com.jdbc.db.DB;
import com.model.dao.impl.DepartmentDaoJDBC;
import com.model.dao.impl.SellerDaoJDBC;

public class DaoFactory{
    
    public static SellerDao creatSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
