package week1.day2;

public class Fibnoccies {

	public static void main(String[] args) {
		int range=8, firstNum=0, SecNum=1;
		int sum;
		System.out.println(firstNum);
		
	    for(int i=1;i<range;i++) {
	    sum= firstNum+ SecNum;
			firstNum=SecNum;
			SecNum=sum;
			System.out.println(firstNum);
			
		}
	}

	}


