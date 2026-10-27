
class Student
{
    int rollno, marks;
    String name;

    Student()
    {
        rollno = 100;
        name = "Sruya";
        marks = 80;
    }

    Student(int r, String n, int m)
    {
        rollno = r;
        name = n;
        marks = m;
    }

    void display()
    {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class ConstructorOverloading
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student(101, "Kiran", 95);

        System.out.println("Student Details are:");
        s1.display();

        System.out.println("Student Details are:");
        s2.display();
    }
}
