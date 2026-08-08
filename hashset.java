import java.util.*;
public class hashset {
    public static void main(String[] args){
        Set<String> set1 = new HashSet<>();
        set1.add("banana");
        set1.add("orange");
        System.out.println(set1);
        System.out.println( set1.isEmpty());
        set1.remove("banana");
        Set <String> set2 = new HashSet<>();
        set2.add("Apple");
        set2.add("orange");
        set2.add("cherry");                 
        System.out.println(set2);                   //to add set1 and set2 both are in strings or integers
        set1.addAll(set2);                 // it will adds all the elements present in set2
        System.out.println(set1.containsAll(set1));  //it will checks all the elements are present
        Iterator<String> it= set1.iterator();
        while(it.hasNext())      //hasNext checks if any element is exists(present)
        System.out.println(it.next());    //  next gets and print the element

        //output
        //[banana, orange]
        //false
        //[orange, cherry, Apple]
        //true
        //orange
        //cherry
         //Apple
        
    }

}
