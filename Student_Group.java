import java.util.ArrayList;

public class Student_Group {
    public String name;
    public ArrayList<Student> Students;
    public Student_Group() {
        this.Students = new ArrayList<>();
    }
    public void addStudent(Student student) {

        if(this.Students.size() > 15){
            throw new IllegalArgumentException("Too many Students in one group");
        }
        if(this.Students.contains(student)){
            throw new IllegalArgumentException("You can't add the same student to the same group twice");
        }
        this.Students.add(student);

    }



}
