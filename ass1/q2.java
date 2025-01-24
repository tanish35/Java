package ass1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the marks of the student in 3 subjects: ");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        student.assignValues(name, mark1, mark2, mark3);
        student.display();
        sc.close();
    }
}

class Student {
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;

    public void assignValues(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public double computeTotalAverage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    public void display() {
        int totalMarks = mark1 + mark2 + mark3;
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + computeTotalAverage());
    }
}
