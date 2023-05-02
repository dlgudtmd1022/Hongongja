package quiz;

import java.util.Scanner;

public class quiz_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int value = scan.nextInt();
        System.out.println(value);

        int i = (int)(Math.random()*100) + 1;

        while(value != i){
            if(value > i){
                System.out.println("down입니다.");
            }else if(value < i){
                System.out.println("up입니다.");
            }
            value = scan.nextInt();
        }
       System.out.println("정답");

	}

}
