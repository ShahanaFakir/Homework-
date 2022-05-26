package hw6IfElseCondition01;

public class Voter {

	public static void main(String[] args) {
		int myAge = 34;

		if (myAge == 18) {
			System.out.println("a) I am a Voter");
		} else if (myAge < 18) {
			System.out.println("b) I am not a Voter");
		} else if (myAge > 18) {
			System.out.println("c) I am a Voter");
		} else {
			System.out.println("d) Please add a valid age");
		}

	}

}
