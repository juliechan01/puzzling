import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    // getTenRolls() method
    public static int[] getTenRolls() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) + 1;
        }
        return array;
    }

    // getRandomLetter() method
    public static char getRandomLetter() {
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random random = new Random();
        int index = random.nextInt(letters.length);
        return letters[index];
    }

    // generatePw method
    public static String generatePw() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
			char randomLetters = getRandomLetter();
			password.append(randomLetters);
		}
        return password.toString();
    }

    // getNewPw method
    public String[] getNewPwSet(int length) {
        String[] pwSet = new String[length];
        for (int i = 0; i < length; i++) {
            pwSet[i] = generatePw();
        }
        return pwSet;
    }

    // shuffleArray sensei bonus
    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = random.nextInt(i + 1);

            // Swap the elements at positions i and j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}