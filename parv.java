import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int m1, m2, m3;
    int total;
    double percentage;
    String grade;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();

        System.out.print("Enter marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        m3 = sc.nextInt();
    }

    void calculate() {
        total = m1 + m2 + m3;
        percentage = total / 3.0;

        if (percentage >= 80)
            grade = "A";
        else if (percentage >= 60)
            grade = "B";
        else if (percentage >= 40)
            grade = "C";
        else
            grade = "Fail";
    }

    void display() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

public class ResultSystem {
    public static void main(String[] args) {
        Student s = new Student();

        s.input();
        s.calculate();
        s.display();
    }
}
