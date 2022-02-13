package baitaplab;

import java.util.Scanner;

public class bai4lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+----------------------------------------+");
		System.out.println("                 MENU                     ");
		System.out.println("1.Phuong trinh bac nhat"                   );
		System.out.println("2.Phuong trinh bac hai"                    );
		System.out.println("3.Tinh tien dien"                          );
		System.out.println("4.Ket thuc"                                );
		System.out.println("+----------------------------------------+");
		System.out.print("Hay chon chuong trinh ban muon:");
		int a;
		Scanner input=new Scanner(System.in);
		a= input.nextInt();
		switch(a) {
		case 1:
			bac1();
			break;
		case 2:
			bac2();
			break;
		case 3:
			tienDien();
			break;
		case 4:
			break;
		}
		
		
	}
	public static void bac1(){
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
	 
	public static void bac2(){
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
	 
	public static void tienDien(){
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
