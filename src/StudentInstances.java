import java.util.Scanner;

class Student {

    String name;
    int age;
    String  isMarried;

    public void getStudent(String name, int age, String isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

}

    public class StudentInstances {

        public static void main(String[] args) {

            Scanner list = new Scanner(System.in);
            System.out.println("Input number of students: ");
            int size = Integer.parseInt(list.nextLine().trim());
            System.out.println("Enter Name, age, status: ");
            Student stud = new Student();
            Student max = new Student();

            for (int i = 0; i < size; i ++){
                stud.name = list.next();
                stud.age = list.nextInt();
                stud.isMarried = list.next();
                if (max.age < stud.age && stud.isMarried.equals("false")){
                    max.name = stud.name;
                    max.age = stud.age;
                }
            }
            System.out.println(max.name +"Is the oldest student not married. He is "+ max.age + "old.");
            list.close();

        }
    }
