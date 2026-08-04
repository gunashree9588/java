public class blue {  //throw in String
    public static void main(String[] args){
        int age = 19;
        if(age<18){
            throw new ArithmeticException("You cannot vote");
        }
        System.out.println("You can vote");
    }
}//output:You can vote
