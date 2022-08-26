package proj1;
     
public class Student {
    // static variable
    static int rollno= 40;
  
    // instance variable
    static String name= "Adarsh";
  
   
    // Declaration of a static method.
    static void method1()
    { 
      System.out.println(rollno); 
      System.out.println(name);
    }
  
    // main method
    public static void main(String[] args)
    {
        Student st= new Student();
        st.method1();
    }
}

