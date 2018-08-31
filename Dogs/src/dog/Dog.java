package dog;
import java.util.ArrayList;

public class Dog {
	
	public String name;
	public String breed;
	public int age;
	public ArrayList<Dog> friends = new ArrayList<Dog>();
	public ArrayList<Dog> enemies = new ArrayList<Dog>();
	
	public Dog(String n, String b, int a) {
		this.name = n;
		this.breed = b;
		this.age = a;
	}
	
	public void addFriend(Dog d) {
		if (this.enemies.contains(d)) {
			System.out.println("Error: attempt to add friend thats already an enemy");
		} else {
			this.friends.add(d);
		}
	}
	
	public void addEnemy(Dog d) {
		if (this.friends.contains(d)) {
			System.out.println("Error: attempt to add enemy thats already a friend");
		} else {
			this.enemies.add(d);
		}
	}
	
	public String toString() {
		String toReturn = this.name + " is a " + this.breed + " and is " + this.age + " years old!";
		return toReturn;
	}
	
	public ArrayList<Dog> getFriends() {
		return this.friends;
	}

	public ArrayList<Dog> getEnemies() {
		return this.enemies;
	}
	
	public void printFriends() {
		for(Dog d:this.friends) {
			System.out.println(d.name + " is " + this.name + "'s friend!");
		}
	}
	
	public void printenimies() {
		for(Dog d:this.enemies) {
			System.out.println(d.name + " is " + this.name + "'s enemy!");
		}
	}
}
