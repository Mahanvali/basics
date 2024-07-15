package src;
//  Learning Java for IB, Coming from a C++ background
//  For and while loops
/*
 * for loop is used when the number of iterations is known, 
 * whereas execution is done in a while loop until the statement in the program is proved wrong
 */
public class Loops {
    public static void main(String args[]){
        //  While loop
        //  Print til 30, when reached 30, stop.

        int i = 0;
        while(i <= 30){
            System.out.println(i);
            i++;
        }

        //  For loop
        /*
            Statement 1 is executed (one time) before the execution of the code block.
            Statement 2 defines the condition for executing the code block.
            Statement 3 is executed (every time) after the code block has been executed.
         */
        //  Print till 99, + 2 every time
        for(int x = 0; x < 100; x = x + 2){
            System.out.println(x);
        }
    }
}
