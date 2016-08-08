import java.util.Scanner;
public class substring{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String s1="";
System.out.println("enter the string :");
s1=in.nextLine();
if(s1.length()%2==0)
{
System.out.println("the maximum length of non palindrome substring :"+s1.length());
}
else
{
System.out.println("the maximum length of non palindrome substring is :"+s1.length()-1);
}
}
}