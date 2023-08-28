package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class c {

    public void printListOfStudents(Student[] students){
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getName().length() > o2.getName().length()){
                    return 1;
                }else if(o1.getName().length() < o2.getName().length()){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        for(Student s : students){
            System.out.println("Student id: " + s.getStudentID() + " Name : " + s.getName()
            + " Admissions Date: " + s.getAdmissionDate());
        }
    }

    public List<Student> getListOfPlatinumAlumniStudents(Student[] students){
        List<Student> platinumStudents = new ArrayList<Student>();
        for(Student s: students){
            if(LocalDate.now().getYear() - s.getAdmissionDate().getYear() > 30){
                platinumStudents.add(s);
            }
        }

        return platinumStudents;
    }

    public static void main(String[] args) {
        c myClass = new c();
        Student s1 = new Student("110001", "Dave", 1951,11,18);
        Student s2 = new Student("110002", "Anna", 1990, 12,07);
        Student s3 = new Student("110003", "Erica", 1974,01,31);
        Student s4 = new Student("110004", "Carlos", 2009, 8, 22);
        Student s5 = new Student("110005", "Bob", 1990,03,05);
        Student[] students = new Student[5];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        myClass.printListOfStudents(students);
        System.out.println("=========================================");
        System.out.println(myClass.getListOfPlatinumAlumniStudents(students));



    }
}
