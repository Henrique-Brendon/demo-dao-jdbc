package com.Application;

import java.sql.Connection;
import java.util.Date;

import com.jdbc.db.DB;
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
        Department obj = new Department(1, "books");

        Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.0, obj);

        System.out.println(seller);
    }
}
