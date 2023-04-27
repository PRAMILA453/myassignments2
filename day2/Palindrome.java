package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int num=34343;
		int temp=0,rem;		
		int output=num;
		for(num=34343;num>0;num=num/10){
			rem=num%10;
	        temp=temp*10+rem;
			
		}
			if(output==temp) {
				System.out.println("The Number is palindrome");
			}
			else {
				System.out.println("The Number is  Not palindrome");	
			}
		}

}
