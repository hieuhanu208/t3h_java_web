package homework;

import java.util.Scanner;

public class powerCalculate {

	public static long powerCalculate() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter n:");
		 int n = userInput.nextInt();
		long power = 1;
		if(n == 0 || n== 1) {
			return power;
		}else {
			for(int i =2 ; i<=n;i++) {
				power *= i;
			}
			return power;
		}
		
	}	

}
