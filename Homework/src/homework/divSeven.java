package homework;

public class divSeven {
	
	public static void divSevenNotFive() {
		System.out.print("Các số chia hết cho 7 nhưng không chia hết cho 5 từ 20 đến 200 là : ");
		for(int i = 20; i<=200;i++) {
			if(i % 7 == 0 && i % 5 != 0 ) {
				System.out.print(i+ "-");
			}
			
		}
		
	}

}
