import java.util.ArrayList;

class Student {
    private String name;
    private int rollNo;
    private String[] subjects;

    public Student(String name, int rollNo, String[] subjects) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
}

class TabulationSheet {
    private int rollNo;
    private ArrayList<Integer> marks;

    public TabulationSheet(int rollNo) {
        this.rollNo = rollNo;
        this.marks = new ArrayList<>();
    }

    public void addMarks(int mark) {
        marks.add(mark);
    }

    public int getRollNo() {
        return rollNo;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }
}

class MarkSheet {
    private String studentName;
    private ArrayList<Integer> marks;

    public MarkSheet(String studentName) {
        this.studentName = studentName;
        this.marks = new ArrayList<>();
    }

    public void addMarks(int mark) {
        marks.add(mark);
    }

    public void printMarkSheet() {
        System.out.println("Mark Sheet for: " + studentName);
        for (int i = 0; i < marks.size(); i++) {
            System.out.printf("Subject %d: %d\n", (i + 1), marks.get(i));
        }
        System.out.println();
    }
}

public class q12 {
    public static void main(String[] args) {
        String[] subjects = { "Math", "Physics", "Chemistry", "Biology", "English" };

        Student student1 = new Student("Ayrton Senna", 1, subjects);
        Student student2 = new Student("Alain Prost", 2, subjects);
        Student student3 = new Student("Michael Schumacher", 3, subjects);

        TabulationSheet[] tabulationSheets = new TabulationSheet[5];

        for (int i = 0; i < subjects.length; i++) {
            tabulationSheets[i] = new TabulationSheet(i + 1);
            tabulationSheets[i].addMarks((int) (Math.random() * 100));
            tabulationSheets[i].addMarks((int) (Math.random() * 100));
            tabulationSheets[i].addMarks((int) (Math.random() * 100));
        }

        MarkSheet[] markSheets = new MarkSheet[3];

        markSheets[0] = new MarkSheet(student1.getName());
        markSheets[1] = new MarkSheet(student2.getName());
        markSheets[2] = new MarkSheet(student3.getName());

        for (int i = 0; i < tabulationSheets.length; i++) {
            markSheets[0].addMarks(tabulationSheets[i].getMarks().get(0));
            markSheets[1].addMarks(tabulationSheets[i].getMarks().get(1));
            markSheets[2].addMarks(tabulationSheets[i].getMarks().get(2));
        }

        for (MarkSheet markSheet : markSheets) {
            markSheet.printMarkSheet();
        }
    }
}
