package Arrays;

public class ArraysExample {
	
	//datatype[] arrayname = new datatype[array_Size]
	
	int[][] arr1= new int[3][2];
	
	public void method1()
	{
	arr1[0][0] = 34;
	arr1[0][1] = 45;
	arr1[1][0] = 56;
	arr1[1][1] = 67;
	arr1[2][0] = 56;
	arr1[2][1] = 67;

		for(int i=0;i<=arr1.length-1;i++)
			{
			for(int j=0;j<arr1.length-1;j++)
			{
				System.out.println(arr1[i][j]);
			}
			}
	}
	
	public static void main(String[] args)
	{
		ArraysExample obj = new ArraysExample();
		obj.method1();
	}
}
