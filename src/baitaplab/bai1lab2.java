package baitaplab;

import java.util.Scanner;

public class bai1lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Phuong trinh bac nhat : ax+b=0\n");
		Scanner input=new Scanner(System.in);
		System.out.print("Nhap vao so a:");
		int a= input.nextInt();
		System.out.print("Nhap vao so b:");
		int b= input.nextInt();
		if(a==0) {
			if(b==0) {
				System.out.print("Phuong trinh vo so nghiem");
			}else {
				System.out.print("Phuong trinh vo nghiem");
			}
		}else {
			System.out.printf("Phuong trinh co nghiem la %f", (float)-b/a);
		}
		
		

	}

}
