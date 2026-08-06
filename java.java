import java.util.ArrayList;       //ArrayLi
public class java {
    public static void main(String[] args){
        ArrayList<String> array = new ArrayList<>();
        array.add("apple");
        array.add("mango");   //add(element)
        System.out.println(array.get(1));    // array.get(index)
        System.out.println(array.set(1,"orange"));     //set(index,element)
        System.out.println(array.get(0));     //remove(index)
        System.out.println(array.size());  
        System.out.println(array.contains("apple"));    //contains(element)  it checks present or not
        System.out.println(array.isEmpty());
        System.out.println(array);
        System.out.println(array.remove(1));  //remove(index)
        array.clear();  // clears all the elements

              //output
              //mango
              //mango
              //apple
              //2
              //true
              //false
              //[apple, orange]
              //orange
        
    }
}



