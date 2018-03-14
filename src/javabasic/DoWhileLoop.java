package javabasic;

public class DoWhileLoop {

	/*
	 * Do {Khối_lệnh_Thực_hiện_trong_vòng_lặp}
	 * 
	 * While{Điều_kiện_vòng_lặp};
	 */
	public static void main(String[] args) {
		int a = 20;
		do {
			System.out.println("Đây là vòng lặp thứ " + a);
			a++;
		}
		while(a<10);
	}

}
