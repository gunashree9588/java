public class thread extends Thread{
   public void run(){                    //to execute the code in run() the name of the function is run() only
        System.out.println("task 1");         // Starts a new thread and executes run()
    }
    public static void main(String[] args){   //here is two types excecution
        thread t=new thread();                //   one type              another one
        t.start();                            //    main()                thread
        System.out.println("task 2");      //    ↓                       ↓
                                              //    task 2                task 1  
    }                                         
}       //output       thread means:A thread is used to let multiple tasks execute concurrently (at overlapping times).
       // task 2       
        // task1
   //     Example:Imagine an application that is:
   //     Downloading a file 📥
   //     Playing music 🎵
  //     Responding to button clicks 🖱️
  //     If everything happened in one thread, a long download could make the application appear frozen.
 
  //  run()  : it contains the code/task executed by the thread.
  // t.start(): this starts a new thread, which then executes run().
  // task 2 → Executed by the main thread.
  // task 1 → Executed by the new thread.
 // The output can be task 2 then task 1, or task 1 then task 2, because thread scheduling is not fixed.