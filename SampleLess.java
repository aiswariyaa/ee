import java.util.Scanner;
class Samplesss{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int a=in.nextInt();
System.out.println("hii");
int b=in.nextInt();
int sum=a;
for(int i=0;i<(Integer.toString(a)).length();i++){
sum=sum*(a%10);
}
if(sum==b){
System.out.println("its seed");
}
else
System.out.println("its not seed");
}}
