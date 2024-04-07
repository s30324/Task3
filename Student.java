import java.util.ArrayList;
public class Student {
    public String fname;
    public String lname;
    private String indexNumber;
    private String email;
    private String address;
    public ArrayList<Double> grades;
    public Student(String fname, String lname, String indexnumber, String email, String address, ArrayList<Double> grades){
        this.fname=fname;
        this.lname=lname;
        this.indexNumber=indexnumber;
        this.address=address;
        this.email=email;
        this.grades= new ArrayList<>(grades);

    }
    public void addGrade(Double grade) {
            this.grades.add(grade);
            if (this.grades.size() > 20) {
                throw new IllegalArgumentException("Too many grades");
            }
            if (grade <2 || grade >5){
                throw new IllegalArgumentException("Only grades between 2 and 5");//ArrayList<Double>grades for(Double grade:grades) { this.grades.add(grade);

            }
    }
    public double countAverageOfGrades(){
        if (this.grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
      for(double grade : this.grades) {
          sum = sum + grade;

      }
      double average_c = sum / this.grades.size();
        if(average_c<2.25)
            return 2;
        if(average_c>=2.25 && average_c<2.75)
            return 2.5;
        if(average_c>=2.75 && average_c<3.25)
            return 3;
        if(average_c>=3.25 && average_c<3.75)
            return 3.5;
        if(average_c>=3.75 && average_c<4.25)
            return 4;
        if(average_c>=4.25 && average_c<4.75)
            return 4.5;
        if(average_c>=4.75)
            return 5;

        return 0.0;
    }

}
