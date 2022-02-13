package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("---Sap xep mang---\n");
        int mang[]= new int[5];
        Scanner nhap=new Scanner(System.in);
        for(int i=0; i<mang.length; i++) {
        	 System.out.printf("Nhap vao so thu %d:", i+1);
        	 mang[i]= nhap.nextInt();
        }
        System.out.println("So phan tu cua mang: "+ Arrays.toString(mang) );
        Arrays.sort(mang);
        System.out.println("Phan tu cua mang sua khi sap xep: "+ Arrays.toString(mang) );
        
        int min=mang[0];
        for(int i=1; i<mang.length;i++) {
        	min=Math.min(min, mang[i]);
        System.out.println("Phan tu nho nhat trong mang:"+ min);
        break;
        }
        
        int tong=0, dem=0;
        int tb;
        for(int i=0; i<mang.length; i++) {
        	if(mang[i]%3==0) {
        		tong +=mang[i];
        		dem+=1;
        	}
        }
        tb= tong /dem;
        System.out.printf("Trung binh cong cac so chia het cho 3 la: %d",tb);
	}
}
        
