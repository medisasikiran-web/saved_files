import java.util.Scanner;

class Student
{
    int rollno, marks;
    String name;

    void readData(int r, String n, int m)
    {
        rollno = r;
        name = n;
        marks = m;
    }

    void displayData()
    {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class TestStudent
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("Enter roll number:");
        int r = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter name:");
        String n = sc.nextLine();

        System.out.println("Enter marks:");
        int m = sc.nextInt();

        s.readData(r, n, m);
        s.displayData();
    }
}