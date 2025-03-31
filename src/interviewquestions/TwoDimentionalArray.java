package interviewquestions;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		int a[][]= {
				{10,20},
				{20,30},
				{30,40}
		};
		int rows=a.length;
		int cols=a[0].length;
		
		/*for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}*/

		for(int x[]:a)
		{
			for(int z:x)
			{
				System.out.print(z+" ");
			}
			System.out.println();
		}
		
	}

}
