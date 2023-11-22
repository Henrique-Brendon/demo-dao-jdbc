package com.Application;

import java.sql.Connection;

import com.jdbc.db.DB;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        Connection conn = DB.getConnection();
    }
}
