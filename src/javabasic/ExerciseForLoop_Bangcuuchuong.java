package javabasic;

public class ExerciseForLoop_Bangcuuchuong {

	public static void main(String[] args) {
		int i, j;
		System.out.println("\n============Bang cuu chuong================");
		for (i = 1; i <= 10; i++) {
			System.out.println("Bang cuu chuong " + i);
			for (j = 0; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println("\n================================");

		}

	}

}
