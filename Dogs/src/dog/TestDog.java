package dog;
import java.util.ArrayList;


public class TestDog {
	
	public static void main(String[] args) throws InterruptedException {
	
		Dog lucy = new Dog("Lucy", "Bichon Frise", 13);
		Dog tucker = new Dog("Tucker","Chocolate Lab", 1);
		Dog gus = new Dog("Gus", "Great Dane", 3);
		Dog blue = new Dog("Blue", "Great Dane", 4);

		lucy.addEnemy(tucker);
		tucker.addFriend(lucy);
		System.out.println(lucy);
		Thread.sleep(1600);
		System.out.println(tucker);
		Thread.sleep(1600);
		System.out.println(gus);
		Thread.sleep(1600);
		System.out.println(blue);
		Thread.sleep(1600);
		gus.addEnemy(blue);
		blue.addEnemy(gus);
		blue.addEnemy(tucker);
		tucker.addFriend(gus);
		tucker.addFriend(blue);

		ArrayList<Dog> tuckF = tucker.getFriends();
		for(int i = 0; i < tuckF.size() ; i++) {
			if (i == 0) {
				System.out.print("Tucker is friends with: ");
				System.out.print(tuckF.get(i).name + ", ");
				Thread.sleep(1600);
			} else if (i == tuckF.size()-1) {
				System.out.print(tuckF.get(i).name + ".\n");
				Thread.sleep(1600);
			} else {
				System.out.print(tuckF.get(i).name + ", and ");
				Thread.sleep(1600);
			}
		}
		Thread.sleep(1600);
		for(int i = 0; i < tuckF.size() ; i++) {
			Dog friend = tuckF.get(i);
			ArrayList<Dog> friendsEnemies = friend.getEnemies();
			for(int o = 0; o < friendsEnemies.size(); o++) {
				System.out.println(friend.name + " is enemies with " + friendsEnemies.get(o).name + ".");
				Thread.sleep(1600);
			}
		}
	}
}
