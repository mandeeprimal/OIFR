package impl;

import dao.StudentDAO;
import listpac.Student;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class StudentDAOlmp implements StudentDAO {


    @Override
    public List<Student> getAll() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Mamta", "Thapa","BCT"," even"));
        studentList.add(new Student(2, "Jenesh", "Shrestha","BCT"," even" ));
        studentList.add(new Student(3, "Mandeep", "Rimal","BCT"," even" ));
        studentList.add(new Student(4, "Ashma", "Shrestha","BCT"," even" ));
        


        return studentList;

    }

    @Override
    public Student getById(int id)
    {
        for (Student s : getAll())
        {
            if (s.getId() == id)
            {
                return s;
            }
        }
                return null;
    }

}