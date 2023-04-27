package week1.day2;

public class PositiveNegative {
	public static void main(String[] args) {
		int number=-60;
		if(number<=0) {
			System.out.println("its negative number:"+number);
		}
			else {
				System.out.println("its positive number:"+number);
			}
		number=(~number+1);
		System.out.println("negative number covert into positive number:"+number);
		}

}
