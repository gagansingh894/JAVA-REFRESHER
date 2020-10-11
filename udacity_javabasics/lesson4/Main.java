import java.lang.Math;
import java.util.Arrays;

class Main {

	public static void main(String[] args) {
		int[] x = new int[5];
		String y = "aaa";
		System.out.println(keepRolling());
		System.out.println(x.length);
		System.out.println(y.length());
		double[] test = {75, 73, 72, 80};
		System.out.println(calculateAverage(test));
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));
		String[] names = {"aa", "bbb", "gagan", "g"};
		System.out.println(longestString(names));
	}


	public static int keepRolling() {
		int dice1 = rollDice();
		int dice2 = rollDice();
		int dice3 = rollDice();
		int count = 1;

		while (!(dice1 == dice2 && dice2 == dice3)) {
			dice1 = rollDice();
			dice2 = rollDice();
			dice3 = rollDice();
			count += 1;
		}
		return count;
	}

	public static int rollDice() {

		int randomNumber = (int) (Math.random() * 6) + 1;
		return randomNumber;
	}

	public static double calculateAverage(double[] temperatures) {
		int size = temperatures.length;
		double total = 0;
		for (int i=0; i<size; i++) {
			total += temperatures[i];
		}
		double average = total/size;
		return average;
	}

	public static String longestString(String[] names) {
		int maxLength = 0;
		String longestName = "";
		for (int i=0; i<names.length; i++) {
			int tempSize = names[i].length(); 
			if ( tempSize > maxLength ) {
				maxLength = names[i].length();
				longestName = names[i];
			}
		}
		return longestName;
	} 

}