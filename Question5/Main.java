package Question5;

public class Main {
    public static void main(String[] args)
    {
        ExampleSingleton singleton = ExampleSingleton.getInstance();
        ExampleSingleton singleton2 = ExampleSingleton.getInstance();
        System.out.println(singleton.exampleState);
        singleton2.exampleState = 5;
        System.out.println(singleton.exampleState);
    }
}
