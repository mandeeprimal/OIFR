/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioe.dao.impl;

import dbutilpackage.DbConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oifr.DAO.ioeDAO;
import oifr.entity.Student;

/**
 *
 * @author Mandeep
 */
public class IOEDAOIMPL implements ioeDAO {
        private final DbConnection db = new DbConnection();
        private final ArrayList<Student> stdlist = new ArrayList<>();
        
    // Implementation for adding a new student    
    @Override
    public void add(Student student) {
        
        // Database code to insert the student to the database using your insert logic
    }
    
    // Implementation for getting all the students
    @Override
    public ArrayList<Student> getAll()throws ClassNotFoundException, SQLException{
    ArrayList<Student> studentList = new ArrayList<>();
        String sql = "SELECT * FROM tbl_student";
        db.open();
        db.initStatement(sql);
        ResultSet rs = db.executeQuery();
        while (rs.next()) {
            Student student = new Student();
            student.setFirstname(rs.getString("firstname"));
            student.setLastname(rs.getString("lastname"));
            student.setDob(rs.getString("dob"));
            student.setGender(rs.getString("gender"));
            student.setCollegename(rs.getString("collegename"));
            student.setCollegeroll(rs.getString("collegeroll"));
            student.setFaculty(rs.getString("faculty"));
            student.setYear(rs.getInt("year"));
            student.setSemester(rs.getString("semester"));
            student.setDateofexam(rs.getString("dateofexam"));
            student.setTypeofexam(rs.getString("typeofexam"));
            student.setVouchernumber(rs.getString("vouchernumber"));
            student.setUserid(rs.getString("userid"));
            student.isStatus();
            studentList.add(student);
        }
        db.close();
        return studentList ;
    }
}
