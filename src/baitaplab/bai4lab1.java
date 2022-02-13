package baitaplab;

import java.util.Scanner;

public class bai4lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.print("Phuong trinh bat hai: ax2 +bx+c=0\n");
          Scanner nhap=new Scanner(System.in);
          int a, b ,c;
          System.out.print("nhap vao so a:");
          a = nhap.nextInt();
          System.out.print("nhap vao so b:");
          b = nhap.nextInt();
          System.out.print("nhap vao so c:");
          c = nhap.nextInt();
          int delta= (b*b)-4*a*c;
          float sqrt =(float) Math.sqrt(delta);
          System.out.printf("Can bac hai cua delta: %d",sqrt);
	}

}
