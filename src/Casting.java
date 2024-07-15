package src;
//  Learning Java for IB, coming from a C++ background
//  Different types of casting (widening) (manual)
public class Casting {
    public static void main(String[] args){
        //  Widening Casting (passing a smaller size type like "int" to a larger size type like "double")
        int myInt = 19;
        double myDouble = myInt;    //  No parentheses, done automatically
        System.out.println(myDouble);  //   Prints out: 19.0
        //  Manual Casting (passing a larger size type like "double" to a smaller size type like "int")
        double otherDouble = 20.98;
        int otherInt = (int)otherDouble;    //  Add parentheses
        System.out.println(otherInt);   //  Prints out: 20
    }
}
