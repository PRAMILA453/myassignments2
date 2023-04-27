package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		
		
	int num1[]= {3,2,11,4,6,7};//syntax for array (Datatype name[]={}values)
    int num2[]= {1,2,8,4,9,7};
  //  int i=0;
  //  int j=0;
    
    int length = num1.length;
     System.out.println("length 1st of array is "+length);
    
     int length1 = num2.length;
     System.out.println("length of 2nd array is "+length1);
	
   for(int i=0;i<num1.length;i++){
       
	   for(int j=0;j<num2.length;j++){
     
	   if(num1[i]==num2[j]) {
    	  
		   System.out.println("similar item is "+num1[i]);
    	 
     }
}
}	
}

}
