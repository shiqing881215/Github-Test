public class StaticDemo {
    public static final String name = "NAME";

    // this block is not static
    {
        System.out.println("HELLO");
    }

    // static block get executed when the class gets loaded into the memory and even before the creation of an object.
    // so before the main
    static {
        show();
    }

    public StaticDemo() {
        System.out.println("CONSTRUCTOR");
    }

    public static void show() {
        System.out.println("MESSAGE");
    }

    public static void main(String[] args) {
        System.out.println("MAIN");

        StaticDemo s = new StaticDemo();
        StaticDemo s2 = new StaticDemo();
    }

    static {
        System.out.println("STATIC BLOCK");
        System.out.println("StaticDemo.name = " + name);
    }
}