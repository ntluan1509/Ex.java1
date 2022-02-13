package Lab2;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tinh tien dien.");
		Scanner nhap=new Scanner(System.in);
		System.out.printf("Nhap vao so dien su dung thang nay:");
		int a= nhap.nextInt();
		if(a<50) {
			System.out.printf("So tien can tra la: %d", a*1000);
		}else {
			int b=50*1000 +(a-50)*1200;
			System.out.printf("So tien can tra la (sodien>50):%d",b);
		}
	}
	}


