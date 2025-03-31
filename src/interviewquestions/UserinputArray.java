package interviewquestions;

import java.util.Scanner;

public class UserinputArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
//		System.out.println(Arrays.toString(a));
	}

}
