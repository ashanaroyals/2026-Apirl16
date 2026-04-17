import java.util.Scanner;
class Binarytodecimal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int decimal=0;
int base=1;
while(n>0)
    {
       int lastdigit=n%10;
       decimal+=lastdigit*base;
       base*=2;
       n/=10;
}
System.out.println(decimal);
}
}