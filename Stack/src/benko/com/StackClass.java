package benko.com;

public class StackClass {

    public static void main(String[] args) {
        int x = 3;
        System.out.println("main 1: " + x);
        foo();
        System.out.println("main: " + x);
    }

    static void foo() {
        int x = 5;
        bar(x + 2);
        System.out.println("foo: " + x);
    }

    static void bar(int x) {
        x = x + 5;
        System.out.println("bar: " + x);
    }
}
