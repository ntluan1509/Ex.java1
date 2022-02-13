package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai4lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.print("---Quan li sinh vien---\n");
      Scanner sc =new Scanner(System.in);
      float diem[]= new float[3];
      String ten[]=new String[3];
      
      for(int i=0; i<diem.length;i++) {
    	  System.out.print("Nhap vao ten:");
    	  ten[i]=sc.nextLine();
    	  System.out.print("Nhap vao diem: ");
    	  diem[i]= sc.nextInt();
    	  sc.nextLine();
//    	  Xet hoc luc
    	 
      }
      for(int j=0; j<diem.length;j++) 
    	  for(int i=j;i<diem.length;i++) {
    		  if(diem[i]<diem[j]) {
    			  float tam=diem[i];
    			  diem[i]=diem[j];
    			  diem[j]=tam;
    			  
    			  String tentam=ten[i];
    			  ten[i]=ten[j];
    			  ten[j]=tentam;
    		  }
    	  }
      
      System.out.println("================================");
      
      for(int i=0; i<diem.length;i++) {
    	  System.out.print( ten[i]+"\t"+diem[i]+"\t");
    	  if(diem[i]>=9) {
    		  System.out.println("Hoc luc xuat sac");
    	  }else if(diem[i]>=7.5) {
    		  System.out.println("Hoc luc gioi");
    	  }else if(diem[i]>=6.5) {
    		  System.out.println("Hoc luc kha");
    	  }else if(diem[i]>=5) {
    		  System.out.println("Hoc luc trung binh");
    	  }else {
    		  System.out.println("Hoc luc yeu");
    	  }
      }
	}

}
