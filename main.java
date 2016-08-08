import java.util.*;
 
class Main
{
    static void printFirstRepeating(int arr[])
    {
        int min = -1;
        HashSet<Integer> set = new HashSet<>();
         for (int i=arr.length-1; i>=0; i--)
        {
          if (set.contains(arr[i]))
                min = i;
 
            else   
                set.add(arr[i]);
        }
        if (min != -1)
          System.out.println("The first repeating element is " + arr[min]);
        else
          System.out.println("There are no repeating elements");
    }
     public static void main (String[] args) throws java.lang.Exception
    {
    	Scanner in=new Scanner(System.in);
    	System.out.println("enter the size of array :");
    	int w=in.nextInt();
        int arr[] = new int[w];
        System.out.println("enter the elements :");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=in.nextInt();
        }
        printFirstRepeating(arr);
    }
}
