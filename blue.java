import java.io.IOException;         //throws in String
public class blue { 
    static void read()throws IOException{               //throws declaration
            throw new IOException("file not found");     //throw statement

    } 
    public static void main(String[] args)throws IOException{
              read();
            //output : file not found
    
        }  
    }

