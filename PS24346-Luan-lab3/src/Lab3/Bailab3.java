package Lab3;

import java.util.Scanner;

public class Bailab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("---Kiem tra so nguyen to---\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap vao so muon kiem tra:");
        int a=input.nextInt();
        for(int i=2; i<a;i++) {
        	if(a%i==0) {
        		System.out.printf("%d khong la so nguyen to",a);
        		break;
        	}else {
        		System.out.printf("%d la so nguyen to",a);
        		break;
        }
	}

}
}
