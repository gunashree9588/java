public class main {     //polymorpism
    public static void main(String[] args) {

        program1 p1 = new program1();
        program2 p2= new program2();
        System.out.println(p2.name);
      p1.go();
      p2.go();
      program[] pro= {p1,p2};
      for(program programs: pro){
          programs.go();
      }
    }
}
