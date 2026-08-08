import java.util.*;
public class hashmap {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("guna",108);        //put(key,value)
        map.put("meary",208);
        map.put("joseph",308);
        map.put("cherry",408);
        System.out.println(map.get("joseph"));    //get(key)
        map.remove("cherry");   //remove(key)
         System.out.println(map.containsKey("guna"));   //contains(key)
         System.out.println(map.containsValue(308));   //containsValue(value)
         System.out.println(map.keySet());                   //return all keys
         System.out.println(map.values());                   //return all values
         System.out.println(map.entrySet());                //return all key value pairs
         map.replace("guna",808);        //replace the value of the key
         map.putIfAbsent("maggi",508);              //adds the key value pair only key is not already present
         map.put("meary",208);
         System.out.println(map.getOrDefault("guna",108));   // if key and  value exists
         System.out.println(map.getOrDefault("not found",6788));  //if key and value does not exists
         System.out.println(map.entrySet());
        } }             //output
                       //true
                       //true
                        //[guna, joseph, meary]
                         //[108, 308, 208]
                        //[guna=108, joseph=308, meary=208]
                         //808
                        //6788
                         //[guna=808, maggi=508, joseph=308, meary=208]
                       

