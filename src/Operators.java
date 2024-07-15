package src;
//  Learning Java for IB, coming from a C++ background
//  Operators
public class Operators {
    public static void main(String[] args){
        //  Arithemetic operators
        int addition = 5 + 5;
        int subtraction = 2 - 1;
        int mult = 2 * 2;
        int division = 10 / 2;
        System.out.println(addition + subtraction + mult + division);   //  Prints out: 20
        //  Assignment Operators
        int x = 0;
        x += 5;
        //  x -= 5;
        //  x *= 5;
        //  x /= 5;
        //  x %= 5;
        System.out.println(x);
        //  Comparision Operators
        int z = 3;
        int y = 3;
        System.out.println(z > y);  // false
        System.out.println(z < y);  // false
        System.out.println(z == y); // true5
        System.out.println(z >= y); // true
        System.out.println(z <= y); // true
        //  Logical Operators
        if(x > z && z < x){    //  Logical and
            System.out.println("x is greater than z and z is less than x ");
        }
        if(y == z || x > 1){    //  Logical or
            System.out.println("Y is equal to z or x is greater than 1");
        }
    }
}
