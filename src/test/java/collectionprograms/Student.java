package collectionprograms;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student student) {
        if (this.name.compareTo(student.name) != 0) {
            return this.name.compareTo(student.name);
        } else if(this.age>student.age) {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ram", 14));
        students.add(new Student("Shyam", 20));
        students.add(new Student("Mohan", 21));

        //Arrays.sort(students);
        for (Student student: students)
             System.out.println(student.age+""+student.name); {
            
        }

    }

}
