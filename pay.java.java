import java.util.Scanner;

public class pay {
	public static class main (String[] args){
		int days;
		int total = 0;
		int payToday;
		Scanner in = new Scanner(System.in);
		System.out.print("how many days do you want to work?");
		days = in.nextInt();


		System.out.print("day \tpay \t total");
		for(int i = 0; i <= days; i++){
			payToday = Math.pow(2, i);
			total += payToday;
			System.out.print(i + "\t" + payToday + "\t" + total);
		}
	}
}