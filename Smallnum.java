import java.util.*;
class Smallnum{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int num=in.nextInt();
int k=in.nextInt();
String s=Integer.toString(num);
System.out.println(s);
String sum="";
char charArr[]=s.toCharArray();
for(int i=0;i<k;i++){
for(int j=i+1;j<charArr.length;j++){
if(charArr[i]>charArr[j]){
char temp=charArr[i];
charArr[i]=charArr[j];
charArr[j]=temp;
}
}sum=sum+charArr[i];
}
System.out.println(sum);
}

}