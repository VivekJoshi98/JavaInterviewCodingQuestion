class Element
{
	public static void main(String []s)
	{
		int [] arr={12,13,5,8,24};
		
		int first=arr[0];
		int second=arr[0];
		int third=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				third=second;
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second)
			{	
				third=second;
				second=arr[i];
			}
			else if(arr[i]>third)
			{
				third=arr[i];
			}
			 	
		}
		System.out.println("Third largest element is "+third);
	}
}