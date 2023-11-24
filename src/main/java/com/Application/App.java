package com.Application;

import com.model.dao.DaoFactory;
import com.model.dao.SellerDao;
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

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}
