package src;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String args[]){
        //  Strings
        ArrayList<String> cars = new ArrayList<String>();   //  Create a new ArrayList which takes in strings
        cars.add("Ferrari");
        cars.add("Honda");
        cars.add("BMW");
        System.out.println(cars);   //  Print out the full array
        System.out.println(cars.size());    //  Print out the size of the array
        //  Sorting using Collections
        Collections.sort(cars); //  Sorts alpabetically
        System.out.println(cars);   //  Print out the sorted strings
        //  Integers
        ArrayList<Integer> nums = new ArrayList<Integer>();   //  Create a new ArrayList which takes in integers
        nums.add(20);
        nums.add(10);
        nums.add(100);
        nums.add(90);
        nums.add(1200);
        nums.add(6);
        System.out.println(nums);    //  Print out the full array
        System.out.println(nums.size());    //  Print out the size of the array
        //Sorting using Collections
        Collections.sort(nums); //  Sort numerically from smaller to biggest
        System.out.println(nums);   //  Print out the sorted numbers
        Collections.sort(nums, Collections.reverseOrder()); //  Sort numerically from biggest to smallest
        System.out.println(nums);   //  Print out the sorted numbers
    }
}
