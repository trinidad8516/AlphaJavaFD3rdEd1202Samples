package book1.chap04;

// Book 1, Listing 4-2

public class HelloApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        HelloSayer h =
            new HelloSayer("Hello", "World");
        h.sayHello();
    }

}