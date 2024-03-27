package Pratice;

import java.util.*;

public class Bj3009 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
//		int[] arrX=new int[1001];
//		int[] arrY=new int[1001];
//		int lastX=0,lastY=0;
//		
//		for(int i=0;i<3;i++) {
//			int x=sc.nextInt();
//			int y=sc.nextInt();
//			arrX[x]++;
//			arrY[y]++;
//		}
//		
//		
//		for(int i=0;i<1000;i++) {
//			if(arrX[i]%2==1) {
//				lastX=i;
//			}
//			if(arrY[i]%2==1) {
//				lastY=i;
//			}
//		}
//		System.out.print(lastX+" "+lastY);
		
		int[] arr= {1,2,3,77,8,9};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr);
	}

}
