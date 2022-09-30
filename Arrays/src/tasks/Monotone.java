package tasks;

import java.util.HashSet;
import java.util.Scanner;

public class Monotone {
	public static void main(String[] args) {

//		int[] array = { 5, 3, 7, 18, 4, 17, 8, 2, 19 };
		Scanner input =new Scanner(System.in);
		int l=input.nextInt();
		int[] array = new int[l];
		for(int i=0;i<l;i++) {
			array[i]=input.nextInt();
		}
		int length=0;
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < l; i++) {
			set.add(array[i]);
		}
		
		for(int i=0;i<l;i++) {
			if(!set.contains(array[i]-1)) {
				int temp=array[i];
				
				
				while(set.contains(temp)) {
					temp++;
				}
				
				if(length<(temp-array[i])) {
					length=temp-array[i];
					for(int j=array[i];j<temp;j++) {
						System.out.println(j);
					}
				}
				
			}
			
		}
		System.out.println("Longest sub array length : "+length);
		input.close();
	}

}
