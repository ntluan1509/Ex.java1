package Lab4;

import java.util.Scanner;

public class SanPham {
	//getter and setter
	     private  String ten;
	     private  double gia;
	     private  double giamGia;
	     
	     public String getTen() {
	    	 return ten;
	     }
	     public void setTen(String ten) {
	    	 this.ten=ten;
	     }
	     public double getGia() {
	    	 return gia;
	     }
	     public void setGia(Double gia) {
	    	 this.gia=gia;
	     } 
	     public double getGiamGia() {
	    	 return giamGia;
	     }
	     public void setGiamGia(double giamgia) {
	    	 this.giamGia=giamGia;
	     }
	     
	     // tinh thue nhap khau
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
	     // ham xuat
	     public void xuat() {
	    	 System.out.print("Thong tin san pham\n");
	    	 System.out.printf("Ten san pham: %s\n",ten);
	    	 System.out.printf("Gia san pham: %.1f\n",gia);
	    	 System.out.printf("Giam gia san pham: %.1f\n",giamGia);
	    	 System.out.printf("Thue nhap khau: %.1f\n",thueNhapKhau());
	    	 System.out.print("--------------------------\n");
	     }
	     // contructor
	     public SanPham(String ten, double gia, double giamGia) {
	    	 this. ten=ten;
	    	 this. gia= gia;
	    	 this.giamGia =giamGia;
	     }
	     public SanPham(String ten, double gia) {
	    	 this.ten=ten;
	    	 this.gia=gia;
	    	 
	     }
}
