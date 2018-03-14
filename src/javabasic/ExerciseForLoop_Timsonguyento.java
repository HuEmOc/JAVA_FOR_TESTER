package javabasic;

import java.util.Scanner;

public class ExerciseForLoop_Timsonguyento {

	private static Scanner number;

	// Kiểm tra số nguyên tố
	public static void main(String[] args) {
		number = new Scanner(System.in);
		System.out.println("Nhap so : ");
		int n = number.nextInt();
		if (n < 2) {
			System.out.println(n + " khong phai la so nguyen to");
		} 
		else 
		{
			for (int i = 2; i < n - 1; i++) {
				if (n % i == 0) {
					System.out.println(n + " khong phai la so nguyen to");
				}
			}
			System.out.println(n + " la so nguyen to");
		}

	}

}
