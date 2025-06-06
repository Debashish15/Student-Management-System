import java.util.Scanner;
import java.util.ArrayList;

public class student {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;
        String name;
        String ID;
        String totalMarks = null;
        String OptedMarks = null;

        while (true) {
            System.out.println("/1 . add student details");
            System.out.println("/2 . view student details");
            System.out.println("/3 . view Grade of student");
            System.out.println("/4 . exit");

            System.out.println("Enter Your Choice");
            choice = sc.nextInt();
            sc.nextLine(); // fix: consume newline

            switch (choice) {
                case 1:
                    System.out.println("Student ID");
                    ID = sc.nextLine();
                    s.add(ID);

                    System.out.println("Student name");
                    name = sc.nextLine();
                    s.add(name);

                    System.out.println("Total Marks");
                    totalMarks = sc.nextLine();
                    s.add(totalMarks);

                    System.out.println("Opted Marks");
                    OptedMarks = sc.nextLine();
                    s.add(OptedMarks);

                    System.out.println("Student details added Successfully!");
                    break;

                case 2:
                    if (s.isEmpty()) {
                        System.out.println("No student details available.");
                    } else {
                        System.out.println("Student Details:");
                        for (int i = 0; i < s.size(); i += 4) {
                            System.out.println("ID: " + s.get(i));
                            System.out.println("Name: " + s.get(i + 1));
                            System.out.println("Total Marks: " + s.get(i + 2));
                            System.out.println("Opted Marks: " + s.get(i + 3));
                            System.out.println("Percentage is: " + cal(s.get(i + 3), s.get(i + 2)) + "%");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Student Grade");

                    System.out.println("Stuent Grade");
                    int grade = cal(OptedMarks, totalMarks);
                    System.out.println("Grade: " + grade);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static int cal(String x, String y) {
        int total = Integer.parseInt(y);
        int opted = Integer.parseInt(x);
        int grade = (opted * 100) / total;

        if (grade >= 90) {
            System.out.println("A+");
        } else if (grade >= 80) {
            System.out.println("A");
        } else if (grade >= 70) {
            System.out.println("B+");
        } else if (grade >= 60) {
            System.out.println("B");
        } else if (grade >= 50) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
        return grade;
    }
}
