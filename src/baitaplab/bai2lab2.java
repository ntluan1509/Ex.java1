package baitaplab;

import java.util.Scanner;

public class bai2lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.print("Phuong trinh bac hai : ax2+ bx+ c=0\n");
         Scanner input=new Scanner(System.in);
         System.out.print("Nhap vao so a:");
 		int a= input.nextInt();
 		 System.out.print("Nhap vao so b:");
		int b= input.nextInt();
		 System.out.print("Nhap vao so c:");
		int c= input.nextInt();
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.print("Phuong trinh vo so nghiem");
				}else {
					System.out.print("Phuong trinh vo nghiem");
				}
			}else {
				System.out.printf("Phuong trinh co nghiem la %f", (float)-c/b);
			}
		}
		else if(a!=0) {
			 int delta= (b*b)-4*a*c;
			 float sqrt =(float) Math.sqrt(delta);
			 if(delta<0) {
				 System.out.print("Phuong trinh vo nghiem");
			 }else if(delta==0) {
				 System.out.printf("Phuong trinh co nghiem kep la: %f", -b/(2*a));
			 }else if(a>0) {
				 System.out.print("Phuong trinh co hai nghiem phan biet la \n:");
				 System.out.printf("x1= %.2f\n",(-b+sqrt)/(2*a));
				 System.out.printf("x1= %.2f\n",(-b-sqrt)/(2*a));
			 }
		}
	}

}
