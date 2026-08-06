  import java.util.LinkedList;  //LinkedList
public class linkedlist{
    
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(1));  //get(index)
        System.out.println(list.set(1,1));   //set(index,element)
        System.out.println(list.size());
        list.addFirst(8);  //addFirst(element)
        list.addLast(6);   //addLast(element)    
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeFirst());
        list.addFirst(8);
        System.out.println(list);
        

        //output
       //[2, 3]
       //3
        //3
       //2
       //8
       //6
       //6
       //8
       //[8,2, 1]
         //in the ArrayList addFirst, addLast, getFirst, getLast, removeFirst, removeLast these methods are not present
    
         }
}


