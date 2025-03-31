package interviewquestions;

public class FactorialProgram {

	public static void main(String[] args) {
		
		int num=1;
		if(num==0 || num==1)
		{
			
			System.out.println("Factorial of "+num+ " is :1");
		}
		else
		{
			for(int i=num-1;i>0;i--)
			{
				num=num*i;
			}
			System.out.println(num);
		}
		

	}

}
