import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import src.Student;

public class Main {

    static Scanner in = new Scanner(System.in);
    static HashSet<String> nationalIDs = new HashSet<>();

    static final String GET_NAME_MESSAGE = "Enter the student name: ";
    static final String GET_ID_MESSAGE = "Enter the student ID: ";

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        boolean flag = true;

        while (flag) {

            showMenu();
            int input = in.nextInt();
            in.nextLine();

            System.out.print("\n\n\n");

            switch (input) {
            case 0:
                System.out.println("Thank you for using my system :)");
                flag = false;
                break;

            case 1:
                Student student = addStudent();

                if (student != null) {
                    students.add(student);
                }
                break;

            case 2:
                showAllStudents(students);
                break;

            case 3:
                String nationalID = getInput(GET_ID_MESSAGE);
                search(students, nationalID);
                break;

            case 4:
                String nationalId = getInput(GET_ID_MESSAGE);
                update(students, nationalId);
                break;

            default:
                System.out.println("You didn't choose correct choice , try again");
            }

            System.out.print("\n\n\n");
        }
    }

    public static void showMenu() {
        System.out.println("===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. Show All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static Student addStudent() {

        String nationalID = getInput(GET_ID_MESSAGE);

        try {
            if (checker(nationalID)) {
                throw new IllegalArgumentException("\nNational ID already exists!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }

        String name = getInput(GET_NAME_MESSAGE);

        int age = inputAge();

        double grade = inputGrade();

        try {

            Student student = new Student(nationalID, name, age, grade);
            nationalIDs.add(nationalID);
            return student;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void showAllStudents(ArrayList<Student> students) {

        if (students.size() == 0) {
            System.out.println("\nNo students found!");
        } else {
            students.forEach(student -> {
                student.show();
                System.out.println("\n");
            });
        }
    }

    public static void search(ArrayList<Student> students, String nationalID) {
        if (checker(nationalID)) {

            for (Student student : students) {
                if (student.getNationalId().equals(nationalID)) {
                    student.show();
                    break;
                }
            }

        } else {
            System.out.println("\nStudent Not found");
        }
    }

    public static void update(ArrayList<Student> students, String nationalID) {

        if (checker(nationalID)) {

            for (Student student : students) {

                if (student.getNationalId().equals(nationalID)) {

                    String name = getInput(GET_NAME_MESSAGE);

                    int age = inputAge();

                    double grade = inputGrade();

                    try {
                        student.setName(name);
                        student.setAge(age);
                        student.setGrade(grade);
                        System.out.println("\nUpdate Done");
                        break;

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                }
            }
        } else {
            System.out.println("\nStudent Not found");
        }
    }

    public static boolean checker(String national_id) {
        if (nationalIDs.contains(national_id)) {
            return true;
        }
        return false;
    }

    public static int inputAge() {
        System.out.println("Enter the student age: ");
        int age = in.nextInt();

        return age;
    }

    public static double inputGrade() {
        System.out.println("Enter the student grade: ");
        double grade = in.nextDouble();

        return grade;
    }

    public static String getInput(String message) {
        System.out.println(message);
        String name = in.nextLine();

        return name;
    }
}
