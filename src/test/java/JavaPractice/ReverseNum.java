package JavaPractice;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("NUmber PLZ");
		String st=sc.nextLine();
		System.out.println("enter string");
		int x=sc.nextInt();
		int rev=0;
		while(x!=0) {
			rev= rev*10;
			rev=rev+x%10;
			x=x/10;
			
		}
        System.out.println("reverse number" +rev);
	}

}
