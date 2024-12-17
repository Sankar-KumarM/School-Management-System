package school.management.system;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher melissa = new Teacher(2, "Melissa",700);
        Teacher velan = new Teacher(3, "Velan",600);


        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(velan);

        Student tamash = new Student(1,"Tamash",4);
        Student sankar = new Student(2,"Sankar",12);
        Student rithik = new Student(3,"Rithik",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamash);
        studentList.add(sankar);
        studentList.add(rithik);


        School ghs= new School(studentList, teacherList);

        Teacher megan = new Teacher(4, "Megan",9000);
        ghs.addTeacher(megan);

        tamash.payFees(5000);
        sankar.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("---------MAKING SCHOOL PAY SALARY---------");

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to "+ lizzy.getName()+" and now has $" + ghs.getTotalMoneyEarned());


        melissa.receiveSalary(melissa.getSalary());
        System.out.println("GHS has spent for salary to "+ melissa.getName()+" and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(sankar);

        velan.receiveSalary(velan.getSalary());
        System.out.println(velan);



    }
}
