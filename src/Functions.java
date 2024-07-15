package src;

public class Functions {
    //  Here we have 2 functions called TestFunction
    //  This is called Function Overloading
    //  This is possible because they are different types of functions
    //  One is an int, the other a void
    static void TestFunction(String name, int age){
        if(age >= 21){
            System.out.println(name + " can legally drink");
        } else {
            System.out.println(name + " can illegally drink");
        }
        // System.out.println(name + " is " + age + " years old");
    }
    static int TestFunction(int x, int y){ //  We use int instead of void, cause void functions can not handle a return
        return x + y;
    }
    public static void main(String[] args) {
        TestFunction("Radahn", 20);
        TestFunction("Miquella", 15);
        TestFunction("Melina", 90);
        System.out.println(TestFunction(10, 6));
    }
}
