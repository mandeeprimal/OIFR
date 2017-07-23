package listpac;


public class Student {
    private int id ;
    private String firstName,lastName;
      private String faculty;
    private String semester;
  

    public Student()
    {}

    public Student(int id,String firstName, String lastName, String faculty,String semester) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.semester= semester;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        
    }
 public String getfaculty() {
        return faculty;
    }

    public void setfaculty(String faculty) {
        this.faculty = faculty;
    }

   
 public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", faculty=" + faculty + ", semester=" + semester + '}';
    }
    
    
}
