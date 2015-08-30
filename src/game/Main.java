package game;

public class Main {
	public static void main(String[] args) {
		Dog firstDog = new Dog();
		Dog secondDog = new Dog();
		
		dogInput(firstDog);
		dogInput(secondDog);
		
		secondDog.fight(firstDog);
		firstDog.fight(secondDog);
	}

	private static void dogInput(Dog dog) {
		System.out.print("Enter the name of the dog: ");
		dog.setName(Reader.readFromConsoleString());
		
		System.out.print("Enter the age of the dog: ");
		try{
			dog.setYears(Reader.readFromConsoleInt());
			System.out.print("Enter the live of the dog: ");
			dog.setLife(Reader.readFromConsoleInt());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
