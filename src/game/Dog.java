package game;

import java.util.InputMismatchException;
import java.util.Random;

public class Dog {
	private String name;
	private int years;
	private int life;
	private static final int MAX_YEARS = 20; 
	private static final int MAX_LIVE = 50;
	
	
	public Dog(){
		this.name = "unknown";
		this.life = 0;
		this.years = 0;
	}
	
	public Dog(String dogName, int dogYears, int dogLife) throws Exception{
		this.setName(dogName);
		this.setYears(dogYears);
		this.setLife(dogLife);
		}
	
	public Dog(Dog d) throws Exception{
		this(d.name,d.years,d.life);
	}
	
	public String getName(){
		String temp = this.name;
		return temp;
	}
	
	public int getYears(){
		int temp = this.years;
		return temp;
	}
	
	public int getLife(){
		int temp = this.life;
		return temp;
	}
	
	//add declaration for setName method
	public void setName(String dogName){
		try{
			if(!dogName.matches("[A-Z][a-zA-Z]*")){
				throw new InputMismatchException();
			}
		}catch(InputMismatchException ime){
			System.out.print("Invalide name input!\nPlease try again: ");
			setName(Reader.readFromConsoleString());
		}
		this.name = dogName;	
	}
	
	public void setYears(int dogYears){
		try{
			if(dogYears > MAX_YEARS || dogYears <= 0){
				throw new InputMismatchException();
			}
		}catch(InputMismatchException ime){
			System.out.print("Invalide years input!\nPlease try again: ");
			setYears(Reader.readFromConsoleInt());
		}
		this.years=dogYears;
	}
	
	public void setLife(int dogLife){
		try{
			if(dogLife > MAX_LIVE || dogLife <= 0){
				throw new InputMismatchException();
			}
		}catch(InputMismatchException ime){
			System.out.print("Invalide life input!\nPlease try again:");
			setLife(Reader.readFromConsoleInt());
		}
			this.life=dogLife;
	}
	
	@Override
	public String toString(){
		return String.format("The dog %s who is %d years old has %d lives",name,years,life);
	}

	public void fight(Dog attackingDog){
		Random rand = new Random();
		int randomAttack = rand.nextInt(10)+1;
		System.out.printf("Dog %s was attacked by %s: ", this.getName(), attackingDog.getName());
		System.out.println("Attack power is "+ randomAttack);
		this.setLife(this.life - randomAttack);
		if(life > 0){
			System.out.println(this.getName() + " dog has "+ this.getLife() + " remaining lives. He is still alive!");
		}else{
			System.out.printf("dog %s died", this.getName());
		}
	}
}
