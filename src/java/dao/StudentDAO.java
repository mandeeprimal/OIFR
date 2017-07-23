package dao;

import listpac.Student;

import java.util.List;


public interface StudentDAO {
    List<Student>getAll();
    Student getById(int id);
}
