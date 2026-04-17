import java.util.Scanner;
class Perfectsquare
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean isSquare=false;
for(int i=1;i*i<=n;i++)
     if(i*i==n)
    {
     isSquare=true;
      break;
    }
if(isSquare)
System.out.println("perfectsquare");
else
System.out.println(" not perfectsquare");
}
}