
public class ArrayRotation 
{

	public static void main(String[] args) 
	{
		int array1[]= {1,2,3,4,5};
		int array2[]= {2,4};
		int array3[]=new int[array2.length];
		int array3index=0;
		for(int i=0;i<array2.length;i++)
		{
			//roatation of the 1st array by array2[i] times
	        int j=0;
	        while(j<array2[i])
	        {
	        	RotateArrayByOne(array1);
	        	j++;
	        }
	        // Finding the largest element index
	        int max = array1[0]; 
	        int k;
	        int index=0;
	        for ( k = 1; k < array1.length; k++)
	        {
	        	if (array1[k] > max) 
	        	{ 
	        		max = array1[k]; 
	        	    index=k;
	        	}
	        }
	        System.out.println("max element at:"+index);
	        //Store the max element index in 3rd array3
	        
	        array3[array3index]=index;
	        array3index++;
	             
		}
		
		//Final rotated array1
		System.out.println("Rotated elements");
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]);
		}
		System.out.println("\narray with max element indexs");
		for(int i=0;i<array3.length;i++)
		{
			System.out.print(array3[i]);
		}

		

	}

	private static void RotateArrayByOne(int[] array1) 
	{
		int temp;
		temp=array1[0];
		int size=array1.length;
		for(int i=0;i<array1.length-1;i++)
		{
			array1[i]=array1[i+1];
		}
		array1[size-1]=temp;
		
	}

}
