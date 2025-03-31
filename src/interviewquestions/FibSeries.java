package interviewquestions;

public class FibSeries {

	public static void main(String[] args) {
		
		int seriescount=10;
		int num1=0;
		int num2=1;
		
		int temp=0;
		System.out.print(num1+" "+num2+" ");
		for(int i=3;i<=seriescount;i++)  // Loop should run for (seriesCount - 2) because we already printed 2 terms
		{
			temp=num1+num2;
			num1=num2;
			num2=temp;
			System.out.print(temp+" ");
		}
		

	}

}
