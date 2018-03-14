package javabasic;

import java.util.Scanner;

public class WhileLoop {

	/*
	 * Khởi_tạo_giá_trị;
	 * 
	 * While( Điều_Kiện_Dừng_Vòng_lặp)
	 * 
	 * {Khối_lệnh_thực_hiện_trong_vòng_lặp;}
	 */

	private static Scanner number;

	public static void main(String[] args) {
		number = new Scanner(System.in);
		System.out.println("input n value : ");
		int n = number.nextInt();
		int i = 0;
		int S = 0;

		while (i < n) {
			System.out.println("so thu tu " + i);
			S += i;
			i++;
		}
		System.out.println("Tổng của dãy " + n + " số = " + S);

	}

}

/*
 * While 	: Thỏa mãn điều kiện rồi làm
 * Do While : Làm rồi kiểm tra điêu kiện
 * 
 */
