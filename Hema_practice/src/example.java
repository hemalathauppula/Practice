import java.util.*;
class example
{
     public static void main(String srgs[])
     {
    	 System.out.println("Hai hema");
    	 int fact=0;
    	 int n=10;
    	 for(int i=1;i<=n;i++)
    	 {
    		 if(n%i==0)
    			 fact=fact+i;
    			 
    	 }
    	 if(fact<=n*2)
    	 {
    		 System.out.println("Given number is deficient number");
    	 }
    	 else
    	 {
    		 System.out.println("Given number is not deficient number");
    	 }
     }
}
