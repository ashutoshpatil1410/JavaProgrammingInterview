package interviewquestions;

public class ReverseArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,1,5,8,9,7};
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
