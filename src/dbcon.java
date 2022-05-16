import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sneha
 */
public class dbcon {
    Connection con;
    public static Connection connection()
          
    {
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3030/","root","sneha2407");
          return con;
          
                  /*jdbc:mysql://127.0.0.1:3030/?user=root*/
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
        
        
    }
    public static void main(String[] args) {
        Connection c=connection();
        System.out.println(c);
        try{
            String q ="SELECT * FROM unims.student;";
            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery(q);
            while(rs.next())
            {
               System.out.println(rs.getString(9)+":"+rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5)+":"+rs.getString(6)+":"+rs.getString(7)+":"+rs.getString(8));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
