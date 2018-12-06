package oop.example.example4;

public class UserTest {
	public static void main(String[] args) {
		User[] users = new User[10];
		
		users[0] = new User("소희", true);
		users[1] = new User("소은", false);
		users[2] = new User("소민", true);
		users[3] = new User("소철", true);
		users[4] = new User("소혜", false);
		users[5] = new User("소형", false);
		users[6] = new User("소영", false);
		users[7] = new User("소이", false);
		users[8] = new User("소정", true);
		users[9] = new User("소하", false);
		
		for(int i = 0; i < users.length; i++) {
			for(int j = i +1; j < users.length; j++) {
				User source = users[i];
				User target = users[j];
				
				if(source.isMale() != target.isMale()) {
					if(Math.abs(source.getPoint() - target.getPoint()) < 0.8) {
						System.out.print(source.toString()+" - ");
						System.out.println(target.toString());
					}
				}
			}
		}
	}
}
