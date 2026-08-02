public class program3 {
    public static void main(String[] args){
        try{                                 // exceptional handling
        String a = "Hi";                     //try,catch,finally
        a.charAt(4);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("index is out of a");
        }
        finally{
            System.out.println("program finished");
        }
          

        
    }

}
