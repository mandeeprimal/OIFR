/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oifr.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import oifr.entity.Student;

/**
 *
 * @author Mandeep
 */
public interface ioeDAO {

    /**
     *
     * @param student
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    void add(Student student)throws ClassNotFoundException, SQLException;
    ArrayList<Student> getAll()throws ClassNotFoundException, SQLException;
    
}
