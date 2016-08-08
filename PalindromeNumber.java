import java.util.Scanner;
public class PalindromeNumber {
public static void main(String[] args) {
Scanner in =new Scanner(System.in);
int a=0,sum=0;
int reverse=0,s1;
System.out.println("enter the number to find the sum of digits:");
int num=in.nextInt();
while(num!=0)
{
	a=num%10;
	sum=sum+a;
	num=num/10;
	
}
System.out.println("the sum of the digits is :"+sum);
int x=sum;
while(sum>0){
	s1=sum%10;
	reverse=reverse*10+s1;
	sum=sum/10;
}
if(reverse==x)
{
	System.out.println("the sum of digits of number is palindrome");
}
else
{
	System.out.println("the sum of digits of number is not a palindrome");
}
	}

}
