import java.util.Scanner;

class Student{

    public void name_of_student(String name){
        System.out.println(String.format("Student mane is: %s", name));
    }
    public void student_age(int age){
        System.out.println(String.format("Student grade: %d", age));
    }
    public static void student_status(String status){
        System.out.println(String.format("Status is: %s", status));
    }
}

public class StudentInstances {

    public static void main(String[] args){

//        Student student1 = new Student();
//        student1.name_of_student("Mihaela");
//        student1.student_age(24);
//        Student.student_status("married");
//        Student student2 = new Student();
//        student2.name_of_student("Max");
//        student2.student_age(28);
//        Student.student_status("not-married");
//        Student student3 = new Student();
//        student3.name_of_student("John");
//        student3.student_age(25);
//        Student.student_status("not-married");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of students:");
        int numOfStudents = input.nextInt();
        System.out.println("Enter a student name:");
        String student1 = input.next();
        System.out.println("Enter a student age: ");
        int age1 = input.nextInt();
        for(int i = 0; i < numOfStudents - 1; i++){
            System.out.println("Enter a student name: ");
            String student = input.next();
            System.out.println("Enter a student age: ");
            int age = input.nextInt();
            if (age > age1){
                student1 = student;
                age1 = age;
            }
        }

        System.out.println("The oldest student is " + student1 + ". He is " + age1 + " old.");

    }
}