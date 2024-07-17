package src;
import java.util.HashMap;
/*
HashMaps store the data in (Key, Value) pairs, 
and you can access them by an index of another type (e.g. an Integer). 
One object is used as a key (index) to another object (value).
If you try to insert the duplicate key in HashMap,
it will replace the element of the corresponding key 
*/
public class HashMaps {
    public static void main(String args[]){
        HashMap<String, Integer> cityPopulations = new HashMap<String, Integer>();
        //  Add values (City, Population)
        cityPopulations.put("London", 8982000);
        cityPopulations.put("Tehran", 8694000);
        cityPopulations.put("Washington", 671803);
        cityPopulations.put("Berlin", 3645000);
        //  Print out Hashmap
        // System.out.println(cityPopulations); <------ CODE

        //  Loop through the hashmap
        for(String x : cityPopulations.keySet()){
                //  Print only the keys
                // System.out.println("Keys (Cities): " + x); <------- CODE

                //  Print the keys along with their assosicated values
                System.out.println("key: " + x + " value: " + cityPopulations.get(x));
        }
    }
}

//Hashmap Methods:
//  .get    | To access a value in the HashMap, use the get() method and refer to its key
//  .remove | To remove an item, use the remove() method and refer to the key
//  .clear  | To remove all items, use the clear() method
//  .size   | To find out how many items there are, use the size() method
//  .keySet | The keySet() method if you only want the keys
//  .values | Use the values() method if you only want the values