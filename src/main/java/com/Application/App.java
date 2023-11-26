package com.Application;

import java.util.Date;
import java.util.List;

import com.model.dao.DaoFactory;
import com.model.dao.SellerDao;
import com.model.entities.Department;
import com.model.entities.Seller;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("=== Teste 1: Seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== Teste 2: Seller findByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }

        
        System.out.println("=== Teste 3: Seller findByDepartment ====");
        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== Teste 4: Seller insert ====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! new id = " + newSeller.getId());

        System.out.println("=== Teste 5: Seller update ====");
        seller =  sellerDao.findById(1);
        seller.setName("Marta Waine");
        sellerDao.update(seller);
        System.out.println("update completed!");
}
}
