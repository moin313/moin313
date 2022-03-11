package DAY2.Association;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Drivercode {
    public static void main(String[] args) {

        /*
        Student student1 = new Student("name-1");
        Student student2 = new Student("name-2");
        Student student3 = new Student("name-3");
        Student student4 = new Student("name-4");
        Student student5 = new Student("name-5");
        Student student6 = new Student("name-6");
        Course course = new Course();

        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);
        course.addStudent(student5);
        course.addStudent(student6);
        System.out.println("Students enrolled in course-1");
        course.print();

        Course course2 = new Course();
        course2.addStudent(student1);
//        Student student7 = new Student("name-7");
        course2.addStudent(student7);

        System.out.println("Students enrolled in cours-2");
        course2.print();
        // course.addStudent
*/

        Date date1 = new Date(2022,1,1);
        Date date2 = new Date(2022,3,1);
        System.out.println(date1.compareTo(date2));
        // -1 <0 date1 occurs before date2
        String[] states = {"karnataka", "haryana","maharashtra","arunachal"};
        Arrays.sort(states); // String class implements compareTo method.
        for(String state: states)
            System.out.println(state);
        Student[] students = {new Student("tim",100), new Student("aim",200), new Student("durk",150),
                new Student("ceaser",1)};
        Arrays.sort(students);
        for(Student student:students)
            System.out.println(student.getName() + ", "+student.getRollNumber());

        System.out.println("\n\n\nSTACK IMPLIMENTATION");
        stack<String> stack = new stack<>();
        stack.pop();
        stack.push("Moin");
        stack.push("Arshad");
        System.out.println(stack.pick());
        System.out.println(stack.pop()+" Removed");
        System.out.println(stack.pick());
    }
}