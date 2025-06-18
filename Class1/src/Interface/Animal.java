package Interface;

public interface Animal {
	void animalRuns();
	void sleep();
	void eat();

}
class Cat implements Animal{
	@Override
	public void animalRuns() {
		System.out.println("the cat says meow meow");
	}
	@Override
	public void sleep() {
		System.out.println("Cat sleeps");
	}
	public void eat() {
		System.out.println("Cat eat fish");
	}
	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.animalRuns();
		myCat.sleep();
		myCat.eat();
	}
	
}