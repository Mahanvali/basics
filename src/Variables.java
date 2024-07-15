package src;
//  Learning Java for IB, coming from a C++ background


/*
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values */

/*
A floating point number can also be a scientific number with an "e" to indicate the power of 10 
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);
*/

public class Variables {
    public static void main(){
        String S = "Hello";
        int i = 100;
        double d = 10.11;
        float f = 19.99f;   //  Make sure to add "f" at the end
        char c = 'w';   // Stores single characters
        boolean b = true;   //  This is a bit weird, instead of "bool" java takes "boolean"
        byte y = 100;   //  Mainly used to save memory to store values 127 to -128
        System.out.println(S);
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);
        System.out.println(b);
        System.out.println(y);
    }
}
