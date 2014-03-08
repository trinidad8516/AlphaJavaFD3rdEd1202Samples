// Book 1, Listing 4-1
package book1.chap04;

public class HelloSayer {

    private String greeting;
    private String addressee;

    public HelloSayer(String greeting, String addressee) {
        this.greeting = greeting;
        this.addressee = addressee;
    }

    public void sayHello()
    {
        System.out.println(greeting + ", " + addressee
          + "!");
    }

}
