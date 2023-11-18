package Question5;

public class ExampleSingleton {
    private static ExampleSingleton singletonInstance = null;
    public int exampleState;

    private ExampleSingleton()
    {
        exampleState = 0;
    }

    public static ExampleSingleton getInstance()
    {
        if (singletonInstance == null)
        {
            singletonInstance = new ExampleSingleton();
        }
        return singletonInstance;
    }
}
