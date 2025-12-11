package xiaoyouxi;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("我想了一个 1 - 100 的数字，想不想猜猜呀？");
		
		int answer = (int)(Math.random() * 100) + 1;
		int guess = 0;
		int count = 0;
		
		while(guess != answer) {
			System.out.print("你猜的多少呀o.O？： ");
			guess = input.nextInt();
			count++;
			
			if(guess > answer) {
				System.out.println("太大了喵");
			}else if(guess < answer) {
				System.out.println("太小了喵");
			}else {
				System.out.println("猜对啦！好厉害");
			}	
		}

		System.out.println("你一共猜了" + count + "次，简直是聪明宝宝！");
		input.close();
		
		
		
		

	}

}
