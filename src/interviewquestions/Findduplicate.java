package interviewquestions;

public class Findduplicate {

	public static void main(String[] args) {
		
		int arr[]= {2,3,2,4,2,3,4,8,7,5,54,55,51,54,3,4};
		boolean visited[]=new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(!visited[i])
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						System.out.println("Duplicate "+arr[i]);
						visited[j]=true;
						break;
					}
					
				}
			}
		}
	}
}
