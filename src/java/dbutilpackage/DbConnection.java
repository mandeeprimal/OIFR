/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbutilpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mandeep
 */
public class DbConnection {
   private Connection conn=null;
   private Statement stmt=null;
   
   public static void main(String[] args){
       DbConnection d = new DbConnection();
       d.open();
   }
   
   public void open(){
//       System.out.print("here");
//     Class.forName("com.mysql.jdbc.Driver");
       
     try {
         
     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ioe","root", "");
//     System.out.println(conn);
        String query = "select * from tbl_student";
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String fname = rs.getString("firstname");
            String lname = rs.getString("lastname");
            String dob = rs.getString("dob");
            String gender = rs.getString("gender");
            String collegename = rs.getString("collegename");
            String collegeroll = rs.getString("collegeroll");
            String year = rs.getString("year");
            
            System.out.println(fname + "\n" + lname + "\n" + dob + "\n" + gender + "\n" + collegename + "\n" + collegeroll + "\n" + year);
        }
    } catch (SQLException e ) {
    } finally {
//        if (stmt != null) { stmt.close(); }
    }
   }


//   public PreparedStatement initStatement(String sql) throws SQLException{
//   stmt=conn.prepareStatement(sql);
//   return stmt;
//   }
   
//   public int executeUpdate() throws SQLException{
//   return stmt.executeUpdate();
//   }
//  
//   
//   public ResultSet executeQuery() throws SQLException{
//       return stmt.executeQuery();
//   }
//   
//   public void close() throws SQLException{
//       
//       if(conn!=null && !conn.isClosed()){
//           conn.close();
//           conn=null;
//       }
//   }

    public void initStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet executeQuery() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



