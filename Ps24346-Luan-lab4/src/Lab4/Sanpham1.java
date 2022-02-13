package Lab4;

import java.util.Scanner;

public class Sanpham1 {
     public String ten;
     public double gia;
     public double giamGia;
     // tinh thue
     public double thueNhapKhau() {
    	 double tnk=gia*0.1;
    	 return tnk;
     }
     // ham nhap
     public void nhap() {
    	 System.out.print("Nhap thong tin cho san pham cua ban:(Ten,gia, giam gia, thue):\n");
    	 Scanner sc=new Scanner(System.in);
    	 ten=sc.nextLine();
    	 gia=Double.parseDouble(sc.nextLine());
    	 giamGia=Double.parseDouble(sc.nextLine());   	 
     }
     //ham xuat
     public void xuat() {
    	 System.out.print("Thong tin san pham\n");
    	 System.out.printf("Ten san pham: %s\n",ten);
    	 System.out.printf("Gia san pham: %.1f\n",gia);
    	 System.out.printf("Giam gia san pham: %.1f\n",giamGia);
    	 System.out.printf("Thue nhap khau: %.1f\n",thueNhapKhau());
    	 System.out.print("--------------------------\n");
     }
    
   
}
