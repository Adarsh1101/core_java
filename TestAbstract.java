package proj1;

abstract class Dog{
	public void sleep() {
		System.out.println("hhhhh");
		
	}
	public abstract void animalSound();
}
class Puppy extends Dog
{
	public void animalSound() {
		System.out.println("animal is making Sound");
	}
	
}
class Puppy2 extends Dog
{
	public void animalSound() {
		System.out.println("animal is making Sound");
	}
	
}

public class TestAbstract{
	public static void main(String[] args)
	{
		Dog d= new Puppy2();
		d.animalSound();
		
		Puppy pobj=new Puppy();
		pobj.animalSound();
		pobj.sleep();
		
	}

}