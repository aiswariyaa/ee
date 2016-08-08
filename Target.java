import java.util.scanner;
public class Target{
public static void main(String args[]){
Scanner k=new Scanner(System.in);
System.out.println("enter the size of array :");
int n=k.nextInt();
int[] arr=new int[n];
int a=0;
int b=0;
System.out.println("enter the elements :");
for(int i=0;i<arr.length;i++)
{
arr[i]=k.nextInt();
}
System.out.println("enter the target :");
int target=k.nextInt();
for(int j=0;j<arr.length;j++)
{
for(int m=0;m<arr.length;m++)
{
if(arr[j]+arr[m]==target)
{
a=arr[j];
b=arr[m];
}
}
}
k.close();
System.out.println("the sum of elements to achieve target is :"+a+""+b);
}
}

