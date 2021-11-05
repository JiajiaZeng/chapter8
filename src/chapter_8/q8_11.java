package chapter_8;

import java.util.Scanner;

public class q8_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511 : ");
		int num=input.nextInt();
		String s=Integer.toBinaryString(num);
		int num1=Integer.valueOf(s);
		int[] ch=new int[9];
		for(int i=0;i<9;i++) {
			ch[8-i]=num1%10;
			num1=num1/10;
		}
		for(int j=0;j<9;j++) {
			if(ch[j]==0) {
				System.out.print("H ");
				if((j+1)%3==0) {
					System.out.println();
				}
			}
			else {
				System.out.print("T ");
				if((j+1)%3==0) {
					System.out.println();
				}
			}
		}
		input.close();
	}

}
