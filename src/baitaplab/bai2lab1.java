package baitaplab;

import java.util.Scanner;

public class bai2lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Hinh chu nhat\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap vao do dai 2 canh:");
        int a =input.nextInt();
        int b =input.nextInt();
        int chuvi=(a+b)*2;
        int dientich=a*b;
        int min= Math.min(a, b);
        System.out.printf("chu vi hinh chu nhat la %d\n", chuvi);
        System.out.printf("dien tich hinh chu nhat la %d\n",dientich);
        System.out.printf("so nho nhat la %d", min);
	}

}
