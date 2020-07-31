package homework;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		int choose;
		Scanner option = new Scanner(System.in);
	
		do {
			showMenu();
			System.out.println("********************");
			System.out.println("Please choose option");
			choose = Integer.parseInt(option.nextLine());
			
			switch (choose) {
			case 1:

				powerCalculate pc = new powerCalculate();
				System.out.print(pc.powerCalculate());
			break;
			case 2:
				divSeven dsf = new divSeven();
				dsf.divSevenNotFive();
			break;
			case 3:
				checkPrime cp = new checkPrime();
				cp.abc();
				break;
				
			case 4 :
				System.exit(-1);
				break;
				default:
					System.err.print("ERRROERRRR");
			
		}
		}while(choose !=5);

	}
	
	static void showMenu() {
		System.out.println("");
		System.out.println("1.Tính giai thừa");
		System.out.println("2. Chia hết cho 7 nhưng không chia hết cho 5 ");
		System.out.println("3.Số nguyên tố ");
		System.out.println("4. Exit");
	}
}
