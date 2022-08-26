package proj1;

public class Std{
	int rollno;
	String name;
	float fee;
	Std(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display() {System.out.println(rollno+" "+name+" "+fee);};
}
  class testthis1{
	  public static void main(String args[]) {
		  Std s1=new Std(111,"ankit",5000f);
		  Std s2=new Std(112,"sumit",6000f);
		  s1.display();
		  s2.display();
	  }
}
