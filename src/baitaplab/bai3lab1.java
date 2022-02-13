package baitaplab;

import java.util.Scanner;

public class bai3lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.print("The tich khoi lap phuong\n");
          Scanner input=new Scanner(System.in);
          int canh;
          System.out.print("Nhap vao canh cua khoi lap phuong:");
          canh= input.nextInt();
          System.out.printf("The tich :%d", canh*canh*canh);
            
	}

}
