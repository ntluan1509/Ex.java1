package baitaplab;

import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.print("Ho va ten:");
        String hoTen= input.nextLine();
        System.out.print("Diem TB:");
        double diemTB =input.nextDouble();
        System.out.printf("%s %.2f diem",hoTen,diemTB);
        
	}

}
