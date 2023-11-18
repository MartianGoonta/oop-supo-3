package Question1;
public class ExampleClass {
    public static double pi = 3.141;

    public static double circleArea(double r)
    {
        return pi * r * r;
    }

    public static void main(String[] args) {
        System.out.println(circleArea(2));
    }
}
