package homework.homework9.git;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added: " + student.getFirstName() + " " + student.getLastName());
    }

    public void updateStudent(int index, Student student){
        if (index >= 0 && index < students.size()){
            students.set(index, student);
            System.out.println("Student update at index: " + index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void deleteStudent(int index){
        if (index >= 0 && index < students.size()){
            students.remove(index);
            System.out.println("Student removed at index: " + index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void displayAllStudents(){
        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println("---------------------");
        }
    }
}
