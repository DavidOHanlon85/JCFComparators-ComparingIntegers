package slideDeckChallenges;

public class Example20ComparingIntegerObjects {

	public static void main(String[] args) {
		
		Integer intW1 = 100;
		Integer intW2 = 100;
		
		if (intW1.equals(intW2)) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}
	
		
		System.out.println("return from compareTo is: " +intW1.compareTo(intW2));
		
	}

}
