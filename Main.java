import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> gradesList_s1 = new ArrayList<>(Arrays.asList(2.0, 3.5, 4.0, 5.0, 4.5));
        Student s1 = new Student("Leon","Sobota","s30324","s30324@pjwstk.edu.pl","Warsaw",gradesList_s1);

        ArrayList<Double> gradesList_s2 = new ArrayList<>(Arrays.asList(2.0, 5.0, 4.0, 2.0, 4.5));
        Student s2 = new Student("Adam","Zalewski", "s34056","s34056@pjwstk.edu.pl","Krakow",gradesList_s2);

        s1.addGrade(3.0);
        s1.addGrade(5.0);
        s1.addGrade(4.0);

        Student_Group group1 = new Student_Group();

        group1.addStudent(s1);
        group1.addStudent(s2);

        double averageS1 = s1.countAverageOfGrades();

        System.out.println("Average of grades of s1: "+ averageS1);

    }

}
