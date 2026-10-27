
class MethodOverloading
{
    int sum(int a, int b)
    {
        return a + b;
    }

    int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    double sum(double a, double b)
    {
        return a + b;
    }

    double sum(int a, double b)
    {
        return a + b;
    }

    double sum(double a, int b)
    {
        return a + b;
    }

    public static void main(String args[])
    {
        MethodOverloading m = new MethodOverloading();

        System.out.println("Sum of two integers is: " + m.sum(10, 20));
        System.out.println("Sum of three integers is: " + m.sum(10, 20, 30));
        System.out.println("Sum of two double values is: " + m.sum(10.99, 36.20));
        System.out.println("Sum of one integer and one double value is: " + m.sum(10, 29.22));
        System.out.println("Sum of one double and one integer value is: " + m.sum(9.66, 16));
    }
}
