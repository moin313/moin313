package DAY2.Association;
/*
Student, Course, Faculty
Association.
There is an association between the student class and the course class.
There is an association between the course class and student class.
 */

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable{
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    @Override
    public int compareTo(Object o) {
        Student student  = (Student) o;
        return Integer.compare(rollNumber,student.getRollNumber());

    }
    // write a compareTo function which sorts the student array by name instead of roll number



    /*
//    private Course[] courses;
    private String name;
    private int rollNo;
    Student(String _name, int n){
        rollNo = n;
        name=_name;
    }
    private void addCourse(Course c){

    }
    public int getRollNumber() {
        return rollNo;
    }
    @Override
    public int compareTo(Object o) {
        Student student  = (Student) o;
        return Integer.compare(rollNo,student.getRollNumber());
    }

    public String getName(){
        return name;
    }*/
}