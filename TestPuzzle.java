import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TestPuzzle {    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();

		System.out.println("==== getTenRolls() method ===");
        int[] randomRolls = generator.getTenRolls();
        for (int i = 0; i < randomRolls.length; i++) {
            System.out.println(randomRolls[i]+ " ");
        }

		System.out.println("==== getRandomLetter() method ===");
		char randomLetters = generator.getRandomLetter();
		System.out.println("Random letter: " + randomLetters);

		System.out.println("==== generatePw() method ===");
		String generatePw = generator.generatePw();
		System.out.println("Generated password: " + generatePw);

		System.out.println("==== getNewPwSet() method ===");
		String [] getNewPw = generator.getNewPwSet(5);
		System.out.println("A few passwords ideas: ");
		for (int i = 0; i < getNewPw.length; i++) {
			System.out.println(getNewPw[i]);
		}

		System.out.println("==== shuffleArray() method | SENSEI BONUS ===");
		int[] numbers = {1, 2, 3, 4, 5};
		generator.shuffleArray(numbers);
		System.out.println("Shuffled array: " + Arrays.toString(numbers));
		// Write your other test cases here.
		//..
	}
}
