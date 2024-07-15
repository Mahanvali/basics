package src;
//  Learning Java for IB, coming from a C++ background
//  Strings

/*
\'	'	Single quote
\"	"	Double quote
\\	\	Backslash
*/

/*
\n	New Line	
\r	Carriage Return	
\t	Tab	
\b	Backspace	
\f	Form Feed
*/

public class Strings {
    public static void main(String[] args) {
        String text = "AbCdEfGhijkLmnopqrSTUVWXyZ";
        String i = "International";
        String b = "Baccalaureate";
        //  Get the text length
        System.out.println(text.length());  //  Prints out: 26
        //  Lowercase all characters in the string
        System.out.println(text.toLowerCase()); // Prints out: abcdefghijklmnopqrstuvwxyz
        //  Uppercase all characters in the string
        System.out.println(text.toUpperCase()); // Prints out: ABCDEFGHIJKLMNOPQQRSTUVWXYZ
        //  indexOf returns the position of the first specificed text in a string
        System.out.println(text.indexOf("AbCdE")); //Prints out: 0 (Because A is in the first position)
        System.out.println(text.indexOf("mnopqr")); //Prints out: 12 (Because m is in 12th position in the string)
        //  Concatenation, the + operator that is used to combine 2 or more string. Or we could use .concat
        System.out.println(i + " " + b); // Prints out: International Baccalaureate
        System.out.println(i.concat(b)); // Prints out: InternationalBaccalaureate
    }
}
