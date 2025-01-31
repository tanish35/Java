import java.util.ArrayList;

class Person {
    private int age;
    private double weight;
    private double height;
    private String dateOfBirth;
    private String address;

    Person(int age, double weight, double height, String dateOfBirth, String address) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Employee extends Person {
    private double salary;
    private String dateOfJoining;
    private int experience;

    Employee(int age, double weight, double height, String dateOfBirth, String address, double salary,
            String dateOfJoining, int experience) {
        super(age, weight, height, dateOfBirth, address);
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                ", experience=" + experience +
                ", " + super.toString() +
                '}';
    }
}

class Student extends Person {
    private int roll;
    private ArrayList<String> subjects;
    private ArrayList<Integer> marks;

    Student(int age, double weight, double height, String dateOfBirth, String address, int roll) {
        super(age, weight, height, dateOfBirth, address);
        this.roll = roll;
        this.subjects = new ArrayList<>();
        this.marks = new ArrayList<>();
    }

    public void addSubject(String subject, int mark) {
        subjects.add(subject);
        marks.add(mark);
    }

    public String calculateGrade() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double average = totalMarks / marks.size();
        if (average >= 90)
            return "A";
        else if (average >= 80)
            return "B";
        else if (average >= 70)
            return "C";
        else if (average >= 60)
            return "D";
        else
            return "F";
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", subjects=" + subjects +
                ", marks=" + marks +
                ", " + super.toString() +
                '}';
    }
}

class Technician extends Employee {
    Technician(int age, double weight, double height, String dateOfBirth, String address, double salary,
            String dateOfJoining, int experience) {
        super(age, weight, height, dateOfBirth, address, salary, dateOfJoining, experience);
    }

    @Override
    public String toString() {
        return "Technician{" + super.toString() + '}';
    }
}

class Professor extends Employee {
    private ArrayList<String> courses;
    private ArrayList<String> listOfAdvisee;

    Professor(int age, double weight, double height, String dateOfBirth, String address, double salary,
            String dateOfJoining, int experience) {
        super(age, weight, height, dateOfBirth, address, salary, dateOfJoining, experience);
        this.courses = new ArrayList<>();
        this.listOfAdvisee = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void addAdvisee(String advisee) {
        listOfAdvisee.add(advisee);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "courses=" + courses +
                ", listOfAdvisee=" + listOfAdvisee +
                ", " + super.toString() +
                '}';
    }
}

public class q9 {
    public static void main(String[] args) {
        Person person = new Person(30, 70.5, 175.0, "1993-01-01", "1 Silverstone Circuit, Towcester");
        Employee employee = new Employee(40, 80.0, 180.0, "1983-01-01", "5 Albert Park, Melbourne", 50000, "2010-01-01",
                10);
        Student student = new Student(20, 60.0, 170.0, "2003-01-01", "44 Brackley Drive, Northamptonshire", 44);
        student.addSubject("Aerodynamics", 95);
        student.addSubject("Tire Management", 85);
        System.out.println("Student Grade: " + student.calculateGrade());
        Technician technician = new Technician(35, 75.0, 175.0, "1988-01-01", "16 Maranello Road, Italy", 40000,
                "2015-01-01", 8);
        Professor professor = new Professor(50, 85.0, 185.0, "1973-01-01", "33 Zandvoort Lane, Netherlands", 70000,
                "2000-01-01", 20);
        professor.addCourse("Race Strategy");
        professor.addCourse("Pit Stop Optimization");
        professor.addAdvisee("Lando Norris");
        professor.addAdvisee("George Russell");

        System.out.println(person);
        System.out.println(employee);
        System.out.println(student);
        System.out.println(technician);
        System.out.println(professor);

    }
}
