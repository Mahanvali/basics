package src;
//  Learning Java for IB, coming from a C++ background
//  Math functions
public class Maths {
    public static void main(String args[]){
        int x = 10;
        int y = 5;
        double a = 3;
        double b = 2;
        double c = -100;
        System.out.println(Math.max(x, y)); //  Get the max value of 2 numbers
        System.out.println(Math.min(x, y)); //  Get the min value of 2 numbers
        System.out.println(Math.pow(a, b)); //  Power math function, in this case 3^2
        System.out.println(Math.abs(c));    //  Get the absolute value
        System.out.println(Math.random() * a);  //  Get a random value, if you times it by a value it you can control the range. In this example the range would be from 0 to 3
    }
}
