package com.adse2509.sess01_java_util_apis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.adse2509.classes.Student;
import util.Spacer;

public class ListDemo {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Avocado");
        fruits.add("Watermelon");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pawpaw");
        fruits.add("Pineapple");
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Passion");
        fruits.add("Grapes");
        fruits.add("Guava");
        fruits.add("Strawberries");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.add("Apricot");
        fruits.add("Dragon Fruit");
        fruits.add("Thorn Melon");
        fruits.add("Sweet Melon");
        fruits.add("Blueberries");
        fruits.add("Cherries");
        fruits.add("Peaches");
        fruits.add("Pomegranate");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        List<Student> javaStudents = new ArrayList<>();

        javaStudents.add(new Student("EICN-0001", "Java Professional Programming",
                "Zamzam Ali", LocalDate.of(2004, 11, 6), 'F', "Kenyan"));

        javaStudents.add(new Student("EICN-0002", "Java Professional Programming",
                "Yasson Simonette", LocalDate.of(2006, 12, 2), 'M', "Kenyan"));

        javaStudents.add(new Student("EICN-0003", "Java Professional Programming",
                "Chengkuach Mathok", LocalDate.of(2008, 6, 6), 'M', "South Sudanese"));

        javaStudents.add(new Student("EICN-0004", "Java Professional Programming",
                "Mohamed Ali", LocalDate.of(2005, 5, 5), 'M', "Kenyan"));

        javaStudents.add(new Student("EICN-0005", "Java Professional Programming",
                "Michael Williams", LocalDate.of(2005, 12, 22), 'M', "American"));

        javaStudents.add(new Student("EICN-0006", "Java Professional Programming",
                "John Wanjohi", LocalDate.of(2005, 11, 6), 'M', "Kenyan"));

        javaStudents.add(new Student("EICN-0007", "Java Professional Programming",
                "Hayat Abdi", LocalDate.of(2006, 6, 17), 'F', "Arabian"));

        javaStudents.add(new Student("EICN-0008", "Java Professional Programming",
                "John Doe", LocalDate.of(2002, 5, 16), 'M', "American"));

        javaStudents.add(new Student("EICN-0009", "Java Professional Programming",
                "Abdulrahman Rahim", LocalDate.of(1995, 8, 1), 'M', "Kenyan"));

        javaStudents.add(new Student("EICN-0010", "Java Professional Programming",
                "Florence Wambua", LocalDate.of(2006, 8, 7), 'F', "Kenyan"));

        javaStudents.add(new Student("EICN-0011", "Java Professional Programming",
                "Nicholas Koech", LocalDate.of(2006, 4, 12), 'M', "Kenyan"));

        javaStudents.add(new Student("EICN-0012", "Java Professional Programming",
                "Rahma Hassan", LocalDate.of(2004, 5, 9), 'F', "Kenyan"));

        Spacer.separator();
        System.out.println("Java Professional Programming Students");

        for (Student student : javaStudents) {
            System.out.println(student);
        }

        javaStudents.remove(1);
        javaStudents.remove(6);

        System.out.println("After the 2nd & 7th students dropped from the class we have "
                + javaStudents.size() + " students left.");

        javaStudents.add(new Student("EICN-0013", "Java Professional Programming",
                "Sheila Josiah", LocalDate.of(1993, 8, 4), 'F', "Kenyan"));

        javaStudents.add(new Student("EICN-0014", "Java Professional Programming",
                "Noor Gupta", LocalDate.of(2006, 6, 14), 'M', "Indian"));

        javaStudents.add(new Student("EICN-0015", "Java Professional Programming",
                "Tracy Chapman", LocalDate.of(2000, 10, 26), 'F', "South African"));

        Spacer.separator();
        System.out.println("The final list of students is:");

        Iterator<Student> stud = javaStudents.iterator();
        int n = 0;

        while (stud.hasNext()) {
            System.out.println("Displaying the details for student: " + (n + 1));
            System.out.println(stud.next());
            n++;
        }

        System.out.println("The final number of students after dropout and new "
                + "enrollments is: " + javaStudents.size());
    }
}