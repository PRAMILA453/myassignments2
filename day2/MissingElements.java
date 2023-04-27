package week1.day2;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,7,6,8};
		for(int i=0;i<num.length;i++) {
		System.out.print(num[i]);	
		}
		Arrays.sort(num);
		System.out.println("");
		//System.out.println("===============");
		 
  for(int i=0;i<num.length;i++) {
    	  System.out.println(num[i]);
    }
    System.out.println("");
    for(int i=0;i<num.length;i++) {
       if(num[i]!=i+1) {
    	 System.out.println("Missing Number is :" +(i+1));
    	 break;
     
       }     
    }
	}
}
	
