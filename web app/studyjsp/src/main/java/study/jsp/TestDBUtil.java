/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.jsp;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UsmanSPC
 */
public class TestDBUtil {
    public static List<test> gettestList() throws ClassNotFoundException, SQLException
    {
                
        ArrayList test = new ArrayList();
        
        //load the mysql driver
        Class.forName("com.mysql.jdbc.Driver");
        
        //get connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teststudent", "root", "");
        
        //create statemnt
        java.sql.Statement statemnt = con.createStatement();
        
        //execute statement
        ResultSet rs =  statemnt.executeQuery("SELECT * FROM `test`");
        
        while(rs.next())
        {
            int test_id = rs.getInt(1);
            int student_id = rs.getInt(2);
            String student_name = rs.getString(3);
            int test_marks = rs.getInt(4);
            
            test t = new test(test_id, student_id, student_name, test_marks);
            
            test.add(t);
        }
        
        return test;
    }
}
