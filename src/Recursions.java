package src;

public class Recursions {
    public static void main(Strings[] args){
        System.out.println(sum(10));
    }

    public static int sum(int x){
        if( x > 0 ){
            return x - 1;
        } else {
            return 0;
        }
    }
}
