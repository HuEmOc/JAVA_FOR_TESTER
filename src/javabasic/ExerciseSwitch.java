package javabasic;

import java.util.Scanner;

public class ExerciseSwitch {

	private static Scanner kB;

	public static void main(String[] args) {
		String dayString3;
		kB = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int day = kB.nextInt();
		if (day == 1) {
		} else if (day == 2) {
		} else if (day == 3) {
			dayString3 = "Monday";
			System.out.println(dayString3);
		} else if (day == 4) {
		} else if (day == 5) {
		} else
			dayString3 = "Invalid day";

	}

}
