public class blue {  //Strings are immutable
    public static void main (String[] args){
        String s ="hello";
        String g=s.concat("java");
        System.out.println(g);  //String immutability
        
        StringBuilder sb = new StringBuilder();
       sb.append("hi");
       sb.insert(2,"java");
       System.out.println(sb);  
       System.out.println(sb.length());
       System.out.println(sb.replace(0,2,"hello"));
         System.out.println(sb.reverse()); 

       // String is immutable (cannot be changed after creation).
       // StringBuilder is mutable (can be modified).
       // StringBuffer is mutable and thread-safe (synchronized).
       // StringBuilder:
      // - Faster than StringBuffer.
      // - Not thread-safe.
      // - Used in single-threaded applications.
 
      // StringBuffer:
     // - Thread-safe (synchronized).
     // - Slightly slower than StringBuilder.
    // - Used in multi-threaded applications.

     // StringBuilder is more faster then StringBuffer but StringBuffer is slow but safe

     // Common methods:
     // append()   -> Adds text at the end.
     // insert()   -> Inserts text at a specified index.
     // replace()  -> Replaces characters between indexes.
   // delete()   -> Deletes characters.
     // reverse()  -> Reverses the string.
    // length()   -> Returns the number of characters.
    // capacity() -> Returns current storage capacity.
    // toString() -> Converts StringBuilder/StringBuffer to String.

    
    }

}

