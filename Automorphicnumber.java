import java.util.Scanner;
class Automorphicnumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int square=n*n;
int temp=n;
boolean isAutomorphic=true;
while(temp>0)
     {
        if(temp%10!=square%10)
             {
                isAutomorphic=false;
                break;
              }
        temp/=10;
         square/=10;
       }   
if(isAutomorphic)
{
System.out.println("automorphic number");
}
else
{
System.out.println("not automorphic number");
}
}
}
        